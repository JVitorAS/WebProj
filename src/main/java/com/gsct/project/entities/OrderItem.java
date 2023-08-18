package com.gsct.project.entities;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gsct.project.entities.pk.OrderItemPK;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "table_order_item")
public class OrderItem implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @EmbeddedId
    private OrderItemPK id = new OrderItemPK();
    
    private Integer quantity;
    private Double price;

    public OrderItem() {
    }

    public OrderItem(Order order, Product product, Integer quantity, Double price) {
        super();
        id.setOrder(order);
        id.setProduct(product);
        this.quantity = quantity;
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    @JsonIgnore
	public Order getOrder() {
		return id.getOrder();
	}
    
    public void setOrder(Order order) {
    	id.setOrder(order);
    }
    
    public Product getProduct() {
    	return id.getProduct();
    }
    
    public void setProduct(Product produt) {
    	id.setProduct(produt);
    }
    
    public Double getSubTotal() {
    	return price * quantity;
    }
    

	
}
