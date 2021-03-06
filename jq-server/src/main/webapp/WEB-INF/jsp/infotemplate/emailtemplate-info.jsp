<%@ page contentType="text/html;charset=UTF-8"%>
<%@include file="/common/taglibs.jsp"%>
<div class="easyui-layout" data-options="fit:true">
	<div data-options="region:'center',split:true" style="width: 300px">
		<div style="padding: 10px;" align="center">
			<table>
				<tr align="center" style="padding-top: 10px">
					<td style="font-size: 20px;font-weight: bold;word-break:break-all;">${emailTemplate.emailTitle}</td>
				</tr>
				<tr align="center" style="padding-top: 10px">
					<td style="font-size: 20px;font-weight: bold;">${emailTemplate.emailVariableTags}</td>
				</tr>
				<tr align="center" style="padding-top: 10px">
					<td style="font-size: 20px;font-weight: bold;">${emailTemplate.emailEnglishName}</td>
				</tr>
				<tr align="center" style="padding-top: 30px">
					<td style="font-style: italic;">发布时间：
					<fmt:formatDate value="${emailTemplate.createdTime}" type="both" pattern="yyyy-MM-dd HH:mm:ss EEEE"/>
					<hr></hr>
					</td>
				</tr>
				<tr align="left" style="padding-top: 30px;word-break:break-all;">
					<td style="font-size: 17px;">${emailTemplate.emailContent}</td>
				</tr>
			</table>
		</div>
	</div>
</div>