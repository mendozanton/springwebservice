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

import com.webservice.pastel.model.Producto;

@Entity
@Table(name = "Promocion")
public class Promocion implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPromocion;
	
	@OneToMany(mappedBy = "promocion",fetch = FetchType.LAZY)
	private Set<Producto> productos;
	
	@Column(length = 20, nullable = false)
	private String titulo;
	
	@Column(length = 60, nullable = false)
	private String descripcion;
	
	@Column(columnDefinition = "DECIMAL", length = 2, scale = 1)
	private Double descuento;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "promocion")
	private Set<FechaPromocion> fechaPromociones;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idFactura", foreignKey = @ForeignKey(name="FK_Factura_Promocion"))
	private Factura factura;

	public Promocion() {
	
	}

	public Promocion(Long idPromocion, Set<Producto> productos, String titulo, String descripcion, Double descuento,
			Set<FechaPromocion> fechaPromociones, Factura factura) {
		this.idPromocion = idPromocion;
		this.productos = productos;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.descuento = descuento;
		this.fechaPromociones = fechaPromociones;
		this.factura = factura;
	}

	public Long getIdPromocion() {
		return idPromocion;
	}

	public void setIdPromocion(Long idPromocion) {
		this.idPromocion = idPromocion;
	}

	public Set<Producto> getProductos() {
		return productos;
	}

	public void setProductos(Set<Producto> productos) {
		this.productos = productos;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getDescuento() {
		return descuento;
	}

	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}

	public Set<FechaPromocion> getFechaPromociones() {
		return fechaPromociones;
	}

	public void setFechaPromociones(Set<FechaPromocion> fechaPromociones) {
		this.fechaPromociones = fechaPromociones;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Promocion [idPromocion=" + idPromocion + ", productos=" + productos + ", titulo=" + titulo
				+ ", descripcion=" + descripcion + ", descuento=" + descuento + ", fechaPromociones=" + fechaPromociones
				+ ", factura=" + factura + "]";
	}
	
	
}
