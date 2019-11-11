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
@Table(name = "pan")
public class Pan implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPan;
	
	@Column(nullable = false)
	private Integer cantidad;
	
	@Column(length = 30)
	private String variedad;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idProducto", foreignKey = @ForeignKey(name="FK_Producto_Pan"))
	private Producto producto;
	
	public Pan() {
		// TODO Auto-generated constructor stub
	}

	public Pan(Long idPan, Integer cantidad, String variedad, Producto producto) {
		this.idPan = idPan;
		this.cantidad = cantidad;
		this.variedad = variedad;
		this.producto = producto;
	}

	public Long getIdPan() {
		return idPan;
	}

	public void setIdPan(Long idPan) {
		this.idPan = idPan;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
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
		return "Pan [idPan=" + idPan + ", cantidad=" + cantidad + ", variedad=" + variedad + ", producto=" + producto
				+ "]";
	}
	

}
