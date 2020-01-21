package es.ua.jtech.spring.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/hacerPedido")
public class HacerPedido extends HttpServlet {

	private static final long serialVersionUID = 780361686776789966L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int idCliente = Integer.parseInt(request.getParameter("idCliente"));
		int idProducto = Integer.parseInt(request.getParameter("idProducto"));
		int unidades = Integer.parseInt(request.getParameter("unidades"));
		
		//TODO: aquí hay que obtener una nueva instancia de un IPedidosBO ayudándose de un WebApplicationContext
		
		response.setContentType("text/plain");
		PrintWriter pw = response.getWriter();
		pw.println("Pedido insertado con éxito (bueno, al menos así lo parece :) )");
		pw.close();
	}
	
	
	

}
