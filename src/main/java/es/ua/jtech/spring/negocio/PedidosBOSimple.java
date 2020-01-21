package es.ua.jtech.spring.negocio;

import org.springframework.stereotype.Service;

import es.ua.jtech.spring.PedidosException;

@Service
public class PedidosBOSimple implements IPedidosBO {
	
	
	private static int cantidadMaxima = 50; 

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
