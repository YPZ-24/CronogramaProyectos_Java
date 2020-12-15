package com.upiicsa.pw.p1.Proyecto1.proyecto.bean;

import java.util.ArrayList;
import java.util.List;

import com.upiicsa.pw.p1.Proyecto1.tarea.bean.Tarea;

public class Proyecto {
	private String nombre;
	private String cveProyecto;
	private List<Tarea> tareas;
	
	public Proyecto(String nombre){
		this.nombre = nombre;
		tareas = new ArrayList<>();
	}
	
	
	
	public int getTareasSize() {
		return tareas.size();
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getCveProyecto() {
		return cveProyecto;
	}
	
	public void setCveProyecto(String cveProyecto) {
		this.cveProyecto = cveProyecto;
	}
	
	public boolean addTarea(Tarea tarea) {
		boolean respuesta = false;
		respuesta = tareas.add(tarea);
		return respuesta;
	}
	
	public Tarea getTarea(int position) {
		Tarea tarea = tareas.get(position);
		return tarea;
	}
	
	public void getListaTareas() {
		for(int i=0; i<tareas.size(); i++) {
	        System.out.println("--> "+getTarea(i).getNombre());
		}
	}
	
	
	
	
	
}
