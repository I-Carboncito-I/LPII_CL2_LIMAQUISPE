package Controlador;

import Dao.ClassProductoLmp;

import model.Tbl_Productocl2;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ControladorProducto")
public class ControladorProducto extends HttpServlet {

    private final ClassProductoLmp productoDao = new ClassProductoLmp();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        
        if (action != null) {
            switch (action) {
                case "registrar":
                    registrarProducto(request, response);
                    break;
                default:
                    listarProductos(request, response);
                    break;
            }
        } else {
            listarProductos(request, response);
        }
    }
    
    private void registrarProducto(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Recuperar parámetros del formulario
        String nombre = request.getParameter("nombre");
        String precioCompraStr = request.getParameter("preciocompra");
        String precioVentaStr = request.getParameter("precioventa");
        String estado = request.getParameter("estado");
        String descripcion = request.getParameter("descripcion");
        
        
        try {
            // Validar y convertir parámetros
            double precioCompra = Double.parseDouble(precioCompraStr);
            double precioVenta = Double.parseDouble(precioVentaStr);
            
            // Crear el objeto TblProductocl2 con los datos del formulario
            Tbl_Productocl2 producto = new Tbl_Productocl2();
            producto.setNombrecl2(nombre);
            producto.setPreciocompcl2(precioCompra);
            producto.setPrecioventacl2(precioVenta);
            producto.setEstadocl2(estado);
            producto.setDescripcl2(descripcion);
            
            // Guardar el producto en la base de datos
            productoDao.registrarProducto(producto);
            
            // Redirigir a la misma página para mostrar el listado actualizado
            listarProductos(request, response);
            
        } catch (NumberFormatException e) {
            
            listarProductos(request, response);
        }
    }
    
    private void listarProductos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            // Obtener lista de productos desde el DAO
            List<Tbl_Productocl2> productos = productoDao.listarProductos();

            // Setear la lista de productos como atributo para ser mostrada en el JSP
            request.setAttribute("productos", productos);

            // Redirigir al JSP para mostrar el listado
            request.getRequestDispatcher("registrarproducto.jsp").forward(request, response);

        } catch (Exception e) {
            // Manejar cualquier otra excepción
            e.printStackTrace(); // Imprime la excepción en la consola del servidor
            request.setAttribute("error", "Error al obtener la lista de productos.");
            request.getRequestDispatcher("registrarproducto.jsp").forward(request, response);
        }
    }
}