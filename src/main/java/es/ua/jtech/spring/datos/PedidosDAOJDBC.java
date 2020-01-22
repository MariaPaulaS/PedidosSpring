package es.ua.jtech.spring.datos;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import es.ua.jtech.spring.PedidosException;

@Repository
public class PedidosDAOJDBC implements IPedidosDAO {

	@Autowired
	private DataSource dbDataSource;

	@Override
	public void insertarPedido(int idCliente, int idProducto, int unidades) {

		Statement sql;
		Connection con = null;

		try {
			con = dbDataSource.getConnection();
			// crear registro en la tabla de pedidos
			sql = con.createStatement();
			sql.execute("insert into pedidos values(NULL," + idProducto + "," + idCliente + "," + unidades + ")");
		} catch (SQLException sqle) {
			throw new PedidosException(sqle);
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (SQLException ex) {
				throw new PedidosException(ex);
			}
		}

	}

}
