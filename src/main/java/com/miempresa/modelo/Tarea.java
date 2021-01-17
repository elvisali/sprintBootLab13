package com.miempresa.modelo;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="Tarea")
public class Tarea {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "fecha")
	private Date fecha;
	
	@Column(name = "realizado")
	private Boolean realizado;
	
	
	public Tarea() {}
	

	public Tarea(int id, String descripcion, Date fecha, Boolean realizado) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.fecha = fecha;
		this.realizado = realizado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Boolean getRealizado() {
		return realizado;
	}

	public void setRealizado(Boolean realizado) {
		this.realizado = realizado;
	}
	
	
}
