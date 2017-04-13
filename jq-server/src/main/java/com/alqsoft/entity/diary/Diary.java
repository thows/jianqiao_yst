/**
 * Project Name:Yst_web_ssh
 * File Name:Diary.java
 * Package Name:com.yst.web.entity.diary
 * Date:2016年1月6日上午12:25:01
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.alqsoft.entity.diary;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.alqframework.orm.hibernate.IdEntity;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.ForeignKey;

import com.alqsoft.entity.diarybook.DiaryBook;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**日记
 * ClassName:Diary <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2016年1月6日 上午12:25:01 <br/>
 * @author   张灿
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
@Entity
@Table(name = "diary")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","fieldHandler"}) 
public class Diary extends IdEntity{
	
	private String content;//日记内容
	
	private Integer customerId;//用户
	
	private Integer commenterNum;//评论数量
	
	private Integer browNum;//浏览数量
	
	private DiaryBook diaryBook;//日记本
	
	private String productName;//项目名称
	
	private Long productOrderId;//项目id
	
	private String productTypeName;//项目类型名称；
	
	private Long productTypeId;//项目类型id；

	private String merchantName;//医院名称
	
	private String doctorName;//医生名称
	
	private Long doctorId;//医生id
	
	private String diaryBookName;//日记本名称
	
	public String getDiaryBookName() {
		return diaryBookName;
	}

	public void setDiaryBookName(String diaryBookName) {
		this.diaryBookName = diaryBookName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductTypeName() {
		return productTypeName;
	}

	public void setProductTypeName(String productTypeName) {
		this.productTypeName = productTypeName;
	}

	public Long getProductOrderId() {
		return productOrderId;
	}

	public void setProductOrderId(Long productOrderId) {
		this.productOrderId = productOrderId;
	}

	public Long getProductTypeId() {
		return productTypeId;
	}

	public void setProductTypeId(Long productTypeId) {
		this.productTypeId = productTypeId;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public Long getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Long doctorId) {
		this.doctorId = doctorId;
	}


	/**
	 * 接口返回参数
	 * @return
	 */
	private String[] attachmentAddress;	//附件地址数组
	private String customerName;	//用户名
	private String customerAddress;		//用户地址
	private String customerlogoimg;   //用户头像
	
	public Integer getBrowNum() {
		return browNum;
	}

	public void setBrowNum(Integer browNum) {
		this.browNum = browNum;
	}

	public Integer getCommenterNum() {
		return commenterNum;
	}

	public void setCommenterNum(Integer commenterNum) {
		this.commenterNum = commenterNum;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	@Transient
	public String[] getAttachmentAddress() {
		return attachmentAddress;
	}

	public void setAttachmentAddress(String[] attachmentAddress) {
		this.attachmentAddress = attachmentAddress;
	}
	
	@Transient
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	@Transient
	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	@Transient
	public String getCustomerlogoimg() {
		return customerlogoimg;
	}

	public void setCustomerlogoimg(String customerlogoimg) {
		this.customerlogoimg = customerlogoimg;
	}

	@SuppressWarnings("deprecation")
	@ManyToOne(cascade =CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "diary_book_id")
	@ForeignKey(name="")
	@JsonIgnore
	public DiaryBook getDiaryBook() {
		return diaryBook;
	}

	public void setDiaryBook(DiaryBook diaryBook) {
		this.diaryBook = diaryBook;
	}
	
	

}

