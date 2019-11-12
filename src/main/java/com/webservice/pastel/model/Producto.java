package com.webservice.pastel.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCTO")
public class Producto implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProducto;

	@Column(length = 30, nullable = false)
	private String nombre;

	@Column(length = 100)
	private String descripcion;

	@Column(nullable = false)
	private Double precio;

	@Column(nullable = false)
	private Integer stock;

	@Column(length = 30)
	private String estado;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idPromocion", foreignKey = @ForeignKey(name = "FK_Promocion_Producto"))
	private Promocion promocion;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "producto")
	private Set<Ingrediente> ingredientes;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "producto")
	private Set<Pan> panes;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "producto")
	private Set<Torta> torta;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "producto")
	private Set<Postre> postre;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "producto")
	private Set<Compra> compras;

	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public Promocion getPromocion() {
		return promocion;
	}

	public void setPromocion(Promocion promocion) {
		this.promocion = promocion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", promocion=" + promocion + ", nombre=" + nombre
				+ ", descripcion=" + descripcion + ", precio=" + precio + ", stock=" + stock + ", estado=" + estado
				+ "]";
	}

}
