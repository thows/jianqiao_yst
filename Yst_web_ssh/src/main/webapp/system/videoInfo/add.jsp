<%@ page pageEncoding="UTF-8"%>
<%@ include file="/common/commonPublic.jsp"%>
<%String doctor_id=request.getParameter("doctor_id");%>
<html>
<script type="text/javascript">
	function check() {
		var $phone = $("input[name='customer.phone']");
		if ($phone.val() == "") {
			$phone.tips({
				side : 2,
				msg : '名称不得为空',
				bg : '#AE81FF',
				time : 3
			});

			$phone.focus();
			return false;
		} else {
			$phone.val(jQuery.trim($phone.val()));
		}
		return true;
	}
	// 添加视频
	function saveDoctorImage() {
		if (check()) {
			var form = $("#doctorInfoForm");
			var options = {
				url : 'videoInfo!addAjax', //提交给哪个执行
				type : 'POST',
				success : function(result) {
					//从返回的json数据中获取结果信息
					//结果提示信息
					var appResult = eval("(" + result + ")");
					var message = appResult.error_info;
					var success = appResult.result;
					if (success != "SUCCESS" ) {
						$("#save").tips({
							side : 2,
							msg : message,
							bg : '#68B500',
							time : 10
						});
					} else {
						pageGo('videoInfo.action');
					}
				} //显示操作提示
			};
			form.ajaxSubmit(options);
		}
	}
</script>
<body>
	<ul class="breadcrumb">
		<li><a href="user!index">主页</a> <span class="divider">/</span></li>
		<li>视频列表 <span class="divider">/</span>
		</li>
		<li class="active">添加视频：</li>
	</ul>
	<form method="post" id="doctorInfoForm">
		<table border="3" bordercolor="blue" width="60%" cellspacing="0"
			cellpadding="0">
			<tr>
				<td>名称：</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>描述信息：</td>
				<td><input type="text" name="short_desc" /></td>
			</tr>
			<tr>
				<td>所属标签：</td>
				<td>
					<select name="tag_id">
						<s:iterator value="#knowlgTagList">
							<option value="<s:property value="id"/>">
								<s:property value="name"/>
							</option>
						</s:iterator>
					</select>
				</td>
			</tr>
			<tr>
				<td>头部图片：</td>
				<td><input type="file" name="image_header" /></td>
			</tr>
			<tr>
				<td>视频上传：</td>
				<td><input type="file" name="image_video" /></td>
			</tr>
			<tr>
				<td>评论数量：</td>
				<td><input type="text" name="comment_count" /></td>
			</tr>
			<tr>
				<td>点击数量：</td>
				<td><input type="text" name="view_count" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><button class="btn"
						type="button" onclick="saveDoctorImage()" id="save">确定</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<button class="btn" type="button"
						onclick="pageGo('videoInfo.action')">返回</button></td>
			</tr>
		</table>

	</form>
</body>
</html>
