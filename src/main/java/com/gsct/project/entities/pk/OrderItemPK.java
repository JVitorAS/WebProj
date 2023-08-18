package com.gsct.project.entities.pk;

import java.io.Serializable;
import java.util.Objects;

import com.gsct.project.entities.Order;
import com.gsct.project.entities.Product;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class OrderItemPK implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;
	
	
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@Override
	public int hashCode() {
		return Objects.hash(order, product);
	}
	@Override
	public boolean equals(Object obj) {
	    if (this == obj)
	        return true;
	    if (obj == null || getClass() != obj.getClass())
	        return false;
	    OrderItemPK other = (OrderItemPK) obj;

	    if (order == null && other.order != null)
	        return false;
	    if (product == null && other.product != null)
	        return false;

	    return Objects.equals(order, other.order) && Objects.equals(product, other.product);
	}

	
	
	
	

}
