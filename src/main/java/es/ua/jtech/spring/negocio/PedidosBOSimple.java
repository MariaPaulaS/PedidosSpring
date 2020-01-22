package es.ua.jtech.spring.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.ua.jtech.spring.PedidosException;
import es.ua.jtech.spring.datos.IPedidosDAO;

@Service
public class PedidosBOSimple implements IPedidosBO {
	
	
	private static int cantidadMaxima = 50; 
	
	@Autowired
	private IPedidosDAO iPedidosDAO;

	public PedidosBOSimple() {
	
		System.out.println("Creado el bean de pedidos...");
	
	}
	
	
	@Override
	public void insertarPedido(int idCliente, int idProducto, int unidades) throws PedidosException {
		// TODO Auto-generated method stub
		
		if(unidades>cantidadMaxima) {
			throw new PedidosException ("La cantidad de unidades pedidas supera la cantidad máxima permitida.");
		}
		
		else {
			iPedidosDAO.insertarPedido(idCliente, idProducto, unidades);
			System.out.println("Pedido realizado");
		}
		
		

		
		
	}


	public int getCantidadMaxima() {
		return cantidadMaxima;
	}


	public void setCantidadMaxima(int cantidadMaxima) {
		this.cantidadMaxima = cantidadMaxima;
	}


	
	
}
