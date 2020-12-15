package com.upiicsa.pw.p1.Proyecto1.tarea.bs;

import com.upiicsa.pw.p1.Proyecto1.tarea.bd.TareaBd;
import com.upiicsa.pw.p1.Proyecto1.tarea.bean.Tarea;

public class TareaBs {
	
	public void agregarTarea(Tarea tarea) {
		TareaBd tareabd = new TareaBd();
		tareabd.guardarTarea(tarea);
	}
	
}
