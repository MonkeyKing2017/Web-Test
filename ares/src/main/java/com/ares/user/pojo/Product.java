package com.ares.user.pojo;

import java.io.Serializable;
import java.util.Date;

public class Product implements Serializable{
	/**
	 * 主键
	 */
	private Long id;
	/**
	 * 商品名称
	 */
	private String name;
	/**
	 * 商品分类
	 */
	private Long catalog;
	/**
	 * 分类名称
	 */
	private String catalog_name;
	/**
	 * 价格
	 */
	private double price;
	/**
	 * 商品数量
	 */
	private Integer number;
	/**
	 * 商品描述
	 */
	private String description;
	/**
	 * 商品图片
	 */
	private String picture;
	/**
	 * 发布时间
	 */
	private Date createTime;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getCatalog() {
		return catalog;
	}
	public void setCatalog(Long catalog) {
		this.catalog = catalog;
	}
	public String getCatalog_name() {
		return catalog_name;
	}
	public void setCatalog_name(String catalog_name) {
		this.catalog_name = catalog_name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
}
