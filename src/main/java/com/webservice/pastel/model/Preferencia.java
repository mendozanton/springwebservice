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
@Table(name = "preferencia")
public class Preferencia implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPreferencia;
	
	@Column(nullable = false)
	private Integer puntuacion;
	
	@Column(length = 50)
	private String comentario;
	
	@Column(columnDefinition = "date", nullable = false)
	private String fecha;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idCliente", foreignKey = @ForeignKey(name="FK_Cliente_Preferencia"))
	private Cliente cliente;
	
	public Preferencia() {
		// TODO Auto-generated constructor stub
	}

	public Preferencia(Long idPreferencia, Integer puntuacion, String comentario, String fecha, Cliente cliente) {
		this.idPreferencia = idPreferencia;
		this.puntuacion = puntuacion;
		this.comentario = comentario;
		this.fecha = fecha;
		this.cliente = cliente;
	}

	public Long getIdPreferencia() {
		return idPreferencia;
	}

	public void setIdPreferencia(Long idPreferencia) {
		this.idPreferencia = idPreferencia;
	}

	public Integer getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(Integer puntuacion) {
		this.puntuacion = puntuacion;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Preferencia [idPreferencia=" + idPreferencia + ", puntuacion=" + puntuacion + ", comentario="
				+ comentario + ", fecha=" + fecha + ", cliente=" + cliente + "]";
	}

}
