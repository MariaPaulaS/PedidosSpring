<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Comprar productos</title>
    </head>
    <body>
        <h1>Hacer pedido</h1>
        <form action="hacerPedido" method="get">
            Cliente: <input type="text" name="idCliente" value="1"/> <br/>
            Producto: <input type="text" name="idProducto" value="1"/> <br/>
            Cantidad a pedir : <input type="text" name="unidades" value="1"/> <br/>
            <input type="submit" value="Pedir">
        </form>
    </body>
</html>

