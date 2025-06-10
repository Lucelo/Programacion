package org.example;

import modelo.Pedido;
import modelo.LineaPedido;
import java.sql.Connection;
import java.util.List;

public class PedidoDAO {
    public int insertarPedido(Pedido pedido, Connection con) {
        // INSERT INTO pedidos, devolver ID generado
        return 0;
    }

    public void insertarLineasPedido(List<LineaPedido> lineas, int idPedido, Connection con) {
        // INSERT INTO lineas_pedido
    }
}

