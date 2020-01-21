package es.ua.jtech.spring.negocio;

public interface IPedidosBO {
	

	public void insertarPedido(int idCliente, int idProducto, int unidades) throws Exception;
	
	public void setCantidadMaxima(int max);
	
	public int getCantidadMaxima();

}
