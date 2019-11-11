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
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Cliente")
public class Cliente implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCliente;
	
	@Column(length = 17, nullable = false)
	private String nombre;
	
	@Column(length = 20, nullable = false)
	private String apellido;
	
	@Column(columnDefinition = "char", nullable = false)
	private String sexo;
	
	@Column(columnDefinition = "numeric", length = 2)
	private Integer edad;
	
	@Column(length = 320)
	private String email;
	
	@Column(columnDefinition = "numeric", length = 9, nullable = true)
	private Integer telefono;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idDireccionCliente", foreignKey = @ForeignKey(name="FK_Direccion_Cliente"))
	private DireccionCliente direccionCliente;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idUsuario", foreignKey = @ForeignKey(name="FK_Usuario_Cliente"))
	private Usuario usuario;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "cliente")
	private Set<Compra> compras;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "cliente")
	private Set<Preferencia> preferencias;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "cliente")
	private Set<Pedido> pedidos;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(Long idCliente, String nombre, String apellido, String sexo, Integer edad, String email, Integer telefono,
			DireccionCliente direccionCliente, Usuario usuario, Set<Compra> compras, Set<Preferencia> preferencias,
			Set<Pedido> pedidos) {
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.edad = edad;
		this.email = email;
		this.telefono = telefono;
		this.direccionCliente = direccionCliente;
		this.usuario = usuario;
		this.compras = compras;
		this.preferencias = preferencias;
		this.pedidos = pedidos;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public DireccionCliente getDireccionCliente() {
		return direccionCliente;
	}

	public void setDireccionCliente(DireccionCliente direccionCliente) {
		this.direccionCliente = direccionCliente;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Set<Compra> getCompras() {
		return compras;
	}

	public void setCompras(Set<Compra> compras) {
		this.compras = compras;
	}

	public Set<Preferencia> getPreferencias() {
		return preferencias;
	}

	public void setPreferencias(Set<Preferencia> preferencias) {
		this.preferencias = preferencias;
	}

	public Set<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(Set<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
