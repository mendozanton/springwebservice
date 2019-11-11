package com.webservice.pastel.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "factura")
public class Factura implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFactura;
	
	@Column(columnDefinition = "decimal")
	private Double igv;
	
	@Column( nullable = false)
	private Double monto;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idPedido", foreignKey = @ForeignKey(name="FK_Pedido_Factura"))
	private Pedido pedido;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "factura")
	private Set<Promocion> promociones;
	
	public Factura() {
		// TODO Auto-generated constructor stub
	}

	
	public Factura(Long idFactura, Double igv, Double monto, Pedido pedido, Set<Promocion> promociones) {
		this.idFactura = idFactura;
		this.igv = igv;
		this.monto = monto;
		this.pedido = pedido;
		this.promociones = promociones;
	}


	public Long getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(Long idFactura) {
		this.idFactura = idFactura;
	}

	public Double getIgv() {
		return igv;
	}

	public void setIgv(Double igv) {
		this.igv = igv;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Set<Promocion> getPromociones() {
		return promociones;
	}

	public void setPromociones(Set<Promocion> promociones) {
		this.promociones = promociones;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Factura [idFactura=" + idFactura + ", igv=" + igv + ", monto=" + monto + ", pedido=" + pedido
				+ ", promociones=" + promociones + "]";
	}

	
}
