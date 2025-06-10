package org.example;

import modelo.Producto;
import java.util.List;

public class ProductoDAO {
    public void insertarProducto(Producto producto) {
        CategoriaDAO categoriaDAO = new CategoriaDAO();
        Categoria categoria = categoriaDAO.buscarPorNombre(nombreCategoria);

        if (categoria == null) {
            System.out.println("Categoría no encontrada.");
            return;
        }
    }

    public List<Producto> obtenerPorCategoria(int categoriaId) {
        // SELECT por categoría
        return null;
    }

    public Producto obtenerPorId(int id) {
        // SELECT por ID
        return null;
    }

    public void actualizarStock(int idProducto, int cantidadComprada) {
        // UPDATE stock
    }
}
