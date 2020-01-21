package es.ua.jtech.spring.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import es.ua.jtech.spring.negocio.IPedidosBO;
import es.ua.jtech.spring.negocio.PedidosBOSimple;

@WebServlet("/hacerPedido")
public class HacerPedido extends HttpServlet {

	private static final long serialVersionUID = 780361686776789966L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int idCliente = Integer.parseInt(request.getParameter("idCliente"));
		int idProducto = Integer.parseInt(request.getParameter("idProducto"));
		int unidades = Integer.parseInt(request.getParameter("unidades"));

		// TODO: aquí hay que obtener una nueva instancia de un IPedidosBO ayudándose de
		// un WebApplicationContext

		ServletContext sc = getServletContext();
		WebApplicationContext wac = WebApplicationContextUtils.getWebApplicationContext(sc);

		IPedidosBO iPedidosBO = (IPedidosBO) wac.getBean(PedidosBOSimple.class);
	
		try {
			iPedidosBO.insertarPedido(idCliente, idProducto, unidades);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		response.setContentType("text/plain");
		PrintWriter pw = response.getWriter();
		pw.println("Pedido insertado con éxito (bueno, al menos así lo parece :D )");
		pw.close();
	}

}
