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
@Table(name = "ingrediente")
public class Ingrediente implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idIngrediente;
	
	@Column(length = 20, nullable = false)
	private String nombre;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idProducto", foreignKey = @ForeignKey(name="FK_Producto_Ingrediente"))
	private Producto producto;
	
	public Ingrediente() {
		// TODO Auto-generated constructor stub
	}

	public Ingrediente(Long idIngrediente, String nombre, Producto producto) {
		this.idIngrediente = idIngrediente;
		this.nombre = nombre;
		this.producto = producto;
	}

	public Long getIdIngrediente() {
		return idIngrediente;
	}

	public void setIdIngrediente(Long idIngrediente) {
		this.idIngrediente = idIngrediente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
		return "Ingrediente [idIngrediente=" + idIngrediente + ", nombre=" + nombre + ", producto=" + producto + "]";
	}
	
	

}
