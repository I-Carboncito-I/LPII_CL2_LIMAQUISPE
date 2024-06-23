package Interfaces;

import java.util.List;

import model.Tbl_Productocl2;

public interface lProducto {
    // Método para registrar un producto en la base de datos
    void registrarProducto(Tbl_Productocl2 producto);
    
    // Método para obtener una lista de todos los productos
    List<Tbl_Productocl2> listarProductos();
}

