package com.ungs.espe2017.model.domain;


import java.io.Serializable;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Usuario implements Serializable, Cloneable{

    private Long id;

    private String nombre;
    
    private String email;
    
    private String password;
    
    private int cuil;
    
    private int cuit;
    
    public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getCuil() {
		return cuil;
	}

	public void setCuil(int cuil) {
		this.cuil = cuil;
	}

	public int getCuit() {
		return cuit;
	}

	public void setCuit(int cuit) {
		this.cuit = cuit;
	}

	@Override
	public String toString() {
		return "El usuario: [id=" + id + ", nombre=" + nombre + ", email=" + email + ", password=" + password + ", cuil="
				+ cuil + ", cuit=" + cuit + "]";
	}
	
	@Override
	public Usuario clone() throws CloneNotSupportedException {
		return (Usuario) super.clone();
	}
    
    
}



