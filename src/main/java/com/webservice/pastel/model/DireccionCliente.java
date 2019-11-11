package com.webservice.pastel.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "direccion_cliente")
public class DireccionCliente implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDireccionCliente;
	
	@Column(length = 20, nullable = false)
	private String distrito;
	
	@Column(length = 20, nullable = false)
	private String ciudad;
	
	@Column(length = 35)
	private String avenida;
	
	@Column
	private Integer numero;
	
	@Column(length = 20)
	private String urbanizacion;
	
	@Column(length = 30)
	private String calle;
	
	@Column(length = 30)
	private String departamento;
	
	@Column(length = 20)
	private String lote;
	
	@Column(columnDefinition = "smallint")
	private Integer piso;
	
	@Column(length = 10, nullable = false)
	private Integer codigoPostal;
	
	@Column(length = 100, nullable = false)
	private String referencia;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "direccionCliente",fetch = FetchType.LAZY)
	private Set<Cliente> clientes;
	
	public DireccionCliente() {
		// TODO Auto-generated constructor stub
	}

	public DireccionCliente(Long idDireccionCliente, Set<Cliente> clientes, String distrito, String ciudad,
			String avenida, Integer numero, String urbanizacion, String calle, String departamento, String lote, Integer piso,
			Integer codigoPostal, String referencia) {
		this.idDireccionCliente = idDireccionCliente;
		this.clientes = clientes;
		this.distrito = distrito;
		this.ciudad = ciudad;
		this.avenida = avenida;
		this.numero = numero;
		this.urbanizacion = urbanizacion;
		this.calle = calle;
		this.departamento = departamento;
		this.lote = lote;
		this.piso = piso;
		this.codigoPostal = codigoPostal;
		this.referencia = referencia;
	}

	public Long getIdDireccionCliente() {
		return idDireccionCliente;
	}

	public void setIdDireccionCliente(Long idDireccionCliente) {
		this.idDireccionCliente = idDireccionCliente;
	}

	public Set<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getAvenida() {
		return avenida;
	}

	public void setAvenida(String avenida) {
		this.avenida = avenida;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getUrbanizacion() {
		return urbanizacion;
	}

	public void setUrbanizacion(String urbanizacion) {
		this.urbanizacion = urbanizacion;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public Integer getPiso() {
		return piso;
	}

	public void setPiso(Integer piso) {
		this.piso = piso;
	}

	public Integer getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(Integer codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "DireccionCliente [idDireccionCliente=" + idDireccionCliente + ", clientes=" + clientes + ", distrito="
				+ distrito + ", ciudad=" + ciudad + ", avenida=" + avenida + ", numero=" + numero + ", urbanizacion="
				+ urbanizacion + ", calle=" + calle + ", departamento=" + departamento + ", lote=" + lote + ", piso="
				+ piso + ", codigoPostal=" + codigoPostal + ", referencia=" + referencia + "]";
	}

}
