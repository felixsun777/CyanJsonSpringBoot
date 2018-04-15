package com.cyan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orderdetail")
public class Orderdetail {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="detail_id")
	private Integer detailId;
	
	@Column(name="order_id")
	private Integer orderId;

	@Column(name="product_id")
	private Integer productId;
	
	@Column(name="price")
	private Double price;
	
	@Column(name="quantity")
	private Integer quantity;
	
	@Column(name="total")
	private Double total;
	
	
	public Integer getDetailId() {
		return detailId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column orderdetail.detail_id
	 * @param detailId  the value for orderdetail.detail_id
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	public void setDetailId(Integer detailId) {
		this.detailId = detailId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column orderdetail.order_id
	 * @return  the value of orderdetail.order_id
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	public Integer getOrderId() {
		return orderId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column orderdetail.order_id
	 * @param orderId  the value for orderdetail.order_id
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column orderdetail.product_id
	 * @return  the value of orderdetail.product_id
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	public Integer getProductId() {
		return productId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column orderdetail.product_id
	 * @param productId  the value for orderdetail.product_id
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column orderdetail.price
	 * @return  the value of orderdetail.price
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column orderdetail.price
	 * @param price  the value for orderdetail.price
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	public void setPrice(Double price) {
		this.price = price;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column orderdetail.quantity
	 * @return  the value of orderdetail.quantity
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	public Integer getQuantity() {
		return quantity;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column orderdetail.quantity
	 * @param quantity  the value for orderdetail.quantity
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column orderdetail.total
	 * @return  the value of orderdetail.total
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	public Double getTotal() {
		return total;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column orderdetail.total
	 * @param total  the value for orderdetail.total
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	public void setTotal(Double total) {
		this.total = total;
	}
}