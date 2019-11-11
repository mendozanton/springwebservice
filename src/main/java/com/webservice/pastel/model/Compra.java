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
@Table(name = "compra")
public class Compra implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCompra;
	
	@Column(length = 15)
	private String codigo;
	
	@Column(columnDefinition = "DATE")
	private String fecha;
	
	@Column(nullable = false)
	private Integer cantidad;
	
	@Column(nullable = false)
	private Double monto;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idPromocion", foreignKey = @ForeignKey(name="FK_Producto_Compra"))
	private Producto producto;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idPedido", foreignKey = @ForeignKey(name="FK_Pedido_Compra"))
	private Pedido pedido;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idCliente", foreignKey = @ForeignKey(name="FK_Cliente_Compra"))
	private Cliente cliente;
	
	public Compra() {
		// TODO Auto-generated constructor stub
	}

	public Compra(Long idCompra, String codigo, String fecha, Integer cantidad, Double monto, Producto producto,
			Pedido pedido, Cliente cliente) {
		this.idCompra = idCompra;
		this.codigo = codigo;
		this.fecha = fecha;
		this.cantidad = cantidad;
		this.monto = monto;
		this.producto = producto;
		this.pedido = pedido;
		this.cliente = cliente;
	}

	public Long getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(Long idCompra) {
		this.idCompra = idCompra;
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

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
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
		return "Compra [idCompra=" + idCompra + ", codigo=" + codigo + ", fecha=" + fecha + ", cantidad=" + cantidad
				+ ", monto=" + monto + ", producto=" + producto + ", pedido=" + pedido + ", cliente=" + cliente + "]";
	}
	

}
