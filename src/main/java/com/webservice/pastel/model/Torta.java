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
@Table(name = "torta")
public class Torta implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTorta;
	
	@Column(length = 17, nullable = false)
	private String sabor;
	
	@Column(length = 10)
	private String tamaño;
	
	@Column(columnDefinition = "smallint")
	private Integer piso;
	
	@Column(length = 10)
	private String tipo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idProducto",foreignKey = @ForeignKey(name="FK_Producto_Torta"))
	private Producto producto;
	
	public Torta() {
		// TODO Auto-generated constructor stub
	}

	public Torta(Long idTorta, String sabor, String tamaño, Integer piso, String tipo, Producto producto) {
		this.idTorta = idTorta;
		this.sabor = sabor;
		this.tamaño = tamaño;
		this.piso = piso;
		this.tipo = tipo;
		this.producto = producto;
	}

	public Long getIdTorta() {
		return idTorta;
	}

	public void setIdTorta(Long idTorta) {
		this.idTorta = idTorta;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public Integer getPiso() {
		return piso;
	}

	public void setPiso(Integer piso) {
		this.piso = piso;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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
		return "Torta [idTorta=" + idTorta + ", sabor=" + sabor + ", tamaño=" + tamaño + ", piso=" + piso + ", tipo="
				+ tipo + ", producto=" + producto + "]";
	}

}
