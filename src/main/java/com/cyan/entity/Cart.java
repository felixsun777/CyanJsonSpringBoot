package com.cyan.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class Cart {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cart_id")
	private Integer cartId;
	
	@Column(name="user_id")
	private Integer userId;
	
	@Column(name="cart_sum")
	private Double cartSum;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="cart_id")
	private Set<Cartitem> cartitems;

	
	public Integer getCartId() {
		return cartId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cart.cart_id
	 * @param cartId  the value for cart.cart_id
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cart.user_id
	 * @return  the value of cart.user_id
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cart.user_id
	 * @param userId  the value for cart.user_id
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cart.cart_sum
	 * @return  the value of cart.cart_sum
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	public Double getCartSum() {
		return cartSum;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cart.cart_sum
	 * @param cartSum  the value for cart.cart_sum
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	public void setCartSum(Double cartSum) {
		this.cartSum = cartSum;
	}
}