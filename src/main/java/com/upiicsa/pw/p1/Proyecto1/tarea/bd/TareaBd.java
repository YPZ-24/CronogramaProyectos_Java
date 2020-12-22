package com.upiicsa.pw.p1.Proyecto1.tarea.bd;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.upiicsa.pw.p1.Proyecto1.baseDatos.BaseDatos;
import com.upiicsa.pw.p1.Proyecto1.tarea.bean.Tarea;

public class TareaBd extends BaseDatos{
	
	
	public void guardarTarea(Tarea tarea) {
		int respuesta=0;
		String query = "insert into Tarea(cveProyecto, nombre, duracion, predecesor, avance, fechaInicio) values(?,?,?,?,?,?)";
		try {
			PreparedStatement pst = connect().prepareStatement(query);
			pst.setString(1, tarea.getCveProyecto());
			pst.setString(2, tarea.getNombre());
			pst.setInt(3, tarea.getDuracion());
			pst.setInt(4, tarea.getPredecesor());
			pst.setInt(5, tarea.getAvance());
			pst.setTimestamp(6, tarea.getFechaInicio());
			respuesta = pst.executeUpdate();
			disconnect();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Tarea> getTareas(String cveProyecto){
		List<Tarea> tareas = new ArrayList<Tarea>();
		String query = "select * from tarea where cveproyecto=?";
		try {
			PreparedStatement pst = connect().prepareStatement(query);
			pst.setString(1, cveProyecto);
			ResultSet rs = pst.executeQuery();
			Tarea tarea;
			while(rs.next()) {
				tarea = new Tarea();
				tarea.setCveProyecto(rs.getString("cveproyecto"));
				tarea.setNombre(rs.getString("nombre"));
				tarea.setDuracion(rs.getInt("duracion"));
				tarea.setPredecesor(rs.getInt("predecesor"));
				tarea.setAvance(rs.getInt("avance"));
				tareas.add(tarea);
			}
			rs.close();
			pst.close();
			disconnect();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return tareas;
	}
	
	
}
