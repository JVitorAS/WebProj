package com.gsct.project.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_user")
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	private String nbrphone;
	private String password; 
	
	
	//Constructors and Fields
	public User() {}

	public User(Long id, String name, String email, String nbrphone, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.nbrphone = nbrphone;
		this.password = password;
	}

	//Getters e Setters
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNbrphone() {
		return nbrphone;
	}

	public void setNbrphone(String nbrphone) {
		this.nbrphone = nbrphone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	//hashcode e equals

	@Override
	public int hashCode() {
		return Objects.hash(id, password);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id) && Objects.equals(password, other.password);
	}
	

	
	

}