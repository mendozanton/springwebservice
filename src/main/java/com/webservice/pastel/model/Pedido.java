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
@Table(name = "Pedido")
public class Pedido implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPedido;
	
	@Column(length = 15)
	private String codigo;
	
	@Column(columnDefinition = "date", nullable = false)
	private String fecha;
	
	@Column(columnDefinition = "date", nullable = false)
	private String fechaEnvio;
	
	@Column(length = 10 , nullable = false)
	private String estado;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "pedido")
	private Set<Compra> compras;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idCliente", foreignKey = @ForeignKey(name="FK_Cliente_Pedido"))
	private Cliente cliente;
	
	public Pedido() {
		// TODO Auto-generated constructor stub
	}

	public Pedido(Long idPedido, String codigo, String fecha, String fechaEnvio, String estado, Set<Compra> compras,
			Cliente cliente) {
		this.idPedido = idPedido;
		this.codigo = codigo;
		this.fecha = fecha;
		this.fechaEnvio = fechaEnvio;
		this.estado = estado;
		this.compras = compras;
		this.cliente = cliente;
	}

	public Long getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getFechaEnvio() {
		return fechaEnvio;
	}

	public void setFechaEnvio(String fechaEnvio) {
		this.fechaEnvio = fechaEnvio;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Set<Compra> getCompras() {
		return compras;
	}

	public void setCompras(Set<Compra> compras) {
		this.compras = compras;
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
		return "Pedido [idPedido=" + idPedido + ", codigo=" + codigo + ", fecha=" + fecha + ", fechaEnvio=" + fechaEnvio
				+ ", estado=" + estado + ", compras=" + compras + ", cliente=" + cliente + "]";
	}

	
}
