package com.webservice.pastel.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "postre")
public class Postre implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPostre;
	
	@Column(length = 25, nullable = false)
	private String sabor;
	
	@Column(length = 30, nullable = false)
	private String variedad;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idProducto", foreignKey = @ForeignKey(name = "FK_Producto_Postre" ))
	private Producto producto;
	
	public Postre() {
		// TODO Auto-generated constructor stub
	}

	public Postre(Long idPostre, String sabor, String variedad, Producto producto) {
		this.idPostre = idPostre;
		this.sabor = sabor;
		this.variedad = variedad;
		this.producto = producto;
	}

	public Long getIdPostre() {
		return idPostre;
	}

	public void setIdPostre(Long idPostre) {
		this.idPostre = idPostre;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getVariedad() {
		return variedad;
	}

	public void setVariedad(String variedad) {
		this.variedad = variedad;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Postre [idPostre=" + idPostre + ", sabor=" + sabor + ", variedad=" + variedad + ", producto=" + producto
				+ "]";
	}
	

}
