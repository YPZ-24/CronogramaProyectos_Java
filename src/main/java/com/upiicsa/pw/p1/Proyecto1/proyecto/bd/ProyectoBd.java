package com.upiicsa.pw.p1.Proyecto1.proyecto.bd;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.upiicsa.pw.p1.Proyecto1.baseDatos.BaseDatos;
import com.upiicsa.pw.p1.Proyecto1.proyecto.bean.Proyecto;
import com.upiicsa.pw.p1.Proyecto1.tarea.bd.TareaBd;
import com.upiicsa.pw.p1.Proyecto1.tarea.bean.Tarea;

public class ProyectoBd extends BaseDatos{
	
	public void registrarProyecto(Proyecto proyecto) {
		int respuesta=0;
		String query = "insert into Proyecto(cveProyecto, nombre) values(?,?)";
		try {
			PreparedStatement pst = connect().prepareStatement(query);
			pst.setString(1, proyecto.getCveProyecto());
			pst.setString(2, proyecto.getNombre());
			respuesta = pst.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void registraTareas(Proyecto proyecto) {
		TareaBd tareabd = new TareaBd();
		Tarea tarea;
		for(int i=0; i<proyecto.getTareasSize(); i++) {
			tarea = proyecto.getTarea(i);
			tareabd.guardarTarea(tarea);
		}
	}
	
	public Proyecto getProyectoSt(String nombreProyecto) {
		int respuesta=0;
		String query = "select * from proyecto where nombre=?";
		Proyecto proyecto = null;
		try {
			PreparedStatement pst = connect().prepareStatement(query);
			pst.setString(1, nombreProyecto);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				proyecto = new Proyecto(rs.getString("cveproyecto"));
				proyecto.setNombre(rs.getString("nombre"));
			}
			rs.close();
			disconnect();
			//pst.setString(2, proyecto.getNombre());
			//respuesta = pst.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return proyecto;
	}
	
	
	
	
}
