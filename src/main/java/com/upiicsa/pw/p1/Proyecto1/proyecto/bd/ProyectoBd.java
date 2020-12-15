package com.upiicsa.pw.p1.Proyecto1.proyecto.bd;

import java.sql.PreparedStatement;
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
	
	
}
