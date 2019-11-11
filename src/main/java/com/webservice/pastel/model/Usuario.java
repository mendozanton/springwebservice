package com.webservice.pastel.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Usuario")
public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUsuario;
	
	@Column(length = 10, nullable = false)
	private String nombre;
	
	@Column(length = 12, nullable = false)
	private String clave;
	
	@Column(length = 15)
	private String tipo;
	
	@Column(length = 1)
	private String estado;
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public Usuario(Long idUsuario, String nombre, String clave, String tipo, String estado) {
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.clave = clave;
		this.tipo = tipo;
		this.estado = estado;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nombre=" + nombre + ", clave=" + clave + ", tipo=" + tipo
				+ ", estado=" + estado + "]";
	}
	
}
