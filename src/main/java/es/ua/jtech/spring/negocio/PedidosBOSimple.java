package es.ua.jtech.spring.negocio;

import org.springframework.stereotype.Service;

@Service
public class PedidosBOSimple implements IPedidosBO {
	
	
	private static int cantidadMaxima = 50; 

	public PedidosBOSimple() {
			
		System.out.println("Creado el bean de pedidos...");
	
	}
	
	
	@Override
	public void insertarPedido(int idCliente, int idProducto, int unidades) throws Exception {
		// TODO Auto-generated method stub
		
		if(unidades>cantidadMaxima) {
			throw new Exception ("La cantidad de unidades pedidas supera la cantidad máxima permitida.");
		}
		
		else {
			System.out.println("Pedido realizado");
		}
		
	}

	@Override
	public void setCantidadMaxima(int max) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getCantidadMaxima() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
}
