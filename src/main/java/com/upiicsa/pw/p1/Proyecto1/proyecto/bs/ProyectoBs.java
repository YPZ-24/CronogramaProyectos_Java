package com.upiicsa.pw.p1.Proyecto1.proyecto.bs;

import com.upiicsa.pw.p1.Proyecto1.proyecto.bd.ProyectoBd;
import com.upiicsa.pw.p1.Proyecto1.proyecto.bean.Proyecto;
import com.upiicsa.pw.p1.Proyecto1.tarea.bd.TareaBd;
import com.upiicsa.pw.p1.Proyecto1.tarea.bean.Tarea;

public class ProyectoBs {
	
	public Proyecto abrirProyecto(String nombreProyecto) {
		ProyectoBd proyectoBd = new ProyectoBd();
		TareaBd tareaBd = new TareaBd();
		
		Proyecto proyecto = proyectoBd.getProyectoSt(nombreProyecto);
		proyecto.addTareas(tareaBd.getTareas(nombreProyecto));
		return proyecto;
	}

	public void registraProyecto(Proyecto proyecto) {
		ProyectoBd proyectoBd = new ProyectoBd();
		proyectoBd.registrarProyecto(proyecto);
	}
	
	public boolean agregaTarea(Proyecto proyecto, Tarea tarea) {
		boolean respuesta = false;
		proyecto.addTarea(tarea);
		return respuesta;
	}
	
	public Tarea getTarea(Proyecto proyecto, int posicion) {
		Tarea tarea = proyecto.getTarea(posicion);
		return tarea;
	}
	
	public boolean guardaProyecto(Proyecto proyecto) {
		boolean respuesta = false;
		registraProyecto(proyecto);
		return respuesta;
	}
	
	
	
}
