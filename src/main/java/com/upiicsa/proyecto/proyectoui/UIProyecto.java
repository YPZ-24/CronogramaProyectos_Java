package com.upiicsa.proyecto.proyectoui;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.upiicsa.pw.p1.Proyecto1.proyecto.bean.Proyecto;
import com.upiicsa.pw.p1.Proyecto1.proyecto.bs.ProyectoBs;
import com.upiicsa.pw.p1.Proyecto1.tarea.bean.Tarea;

/**
 * Servlet implementation class UIProyecto
 */
@WebServlet("/UIProyecto")
public class UIProyecto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UIProyecto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		out.print("<html>");
			out.print("<head>");
			out.print("</head>");
			out.print("<body>");
				
				ProyectoBs proyectobs = new ProyectoBs();
				Proyecto proyecto = new Proyecto("Proyecto1");
				Tarea tarea = new Tarea();
				tarea = proyectobs.getTarea(proyecto, 0);
				out.print("<p>Tarea: "+tarea.getNombre());
				out.print("</p>");
				
				out.print("<p>");
				out.print("HOLA...! SERVLET");
				out.print("</p>");
			out.print("</body>");
		out.print("</html>");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
