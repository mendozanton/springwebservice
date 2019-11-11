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
@Table(name = "fecha_promocion")
public class FechaPromocion implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFechaPromocion;
	
	@Column(columnDefinition = "date", nullable = false)
	private String fechaInicio;
	
	@Column(columnDefinition = "date", nullable = false)
	private String fechaFin;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idPromocion",foreignKey = @ForeignKey(name = "FK_Promocion_Fecha_Promocion"))
	private Promocion promocion;
	
	public FechaPromocion() {
		// TODO Auto-generated constructor stub
	}

	public FechaPromocion(Long idFechaPromocion, String fechaInicio, String fechaFin, Promocion promocion) {
		this.idFechaPromocion = idFechaPromocion;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.promocion = promocion;
	}

	public Long getIdFechaPromocion() {
		return idFechaPromocion;
	}

	public void setIdFechaPromocion(Long idFechaPromocion) {
		this.idFechaPromocion = idFechaPromocion;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Promocion getPromocion() {
		return promocion;
	}

	public void setPromocion(Promocion promocion) {
		this.promocion = promocion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "FechaPromocion [idFechaPromocion=" + idFechaPromocion + ", fechaInicio=" + fechaInicio + ", fechaFin="
				+ fechaFin + ", promocion=" + promocion + "]";
	}

}
