package com.upiicsa.pw.p1.Proyecto1.tarea.bean;

import java.sql.Timestamp;

public class Tarea {
	private String cveProyecto;
	private String nombre;
	private Timestamp fechaInicio;
	private int duracion;
	private int predecesor;
	private int avance;
	
	
	
	public Timestamp getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Timestamp fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getCveProyecto() {
		return cveProyecto;
	}

	public void setCveProyecto(String cveProyecto) {
		this.cveProyecto = cveProyecto;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getDuracion() {
		return duracion;
	}
	
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	public int getPredecesor() {
		return predecesor;
	}
	
	public void setPredecesor(int predecesor) {
		this.predecesor = predecesor;
	}
	
	public int getAvance() {
		return avance;
	}
	
	public void setAvance(int avance) {
		this.avance = avance;
	}
	
	
}
