package Controlador;

import Dao.ClassUsuarioLmp;

import Interfaces.lUsuario;
import model.Tbl_Usuariocl2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/LoginUsuario")
public class ControladorUsuario extends HttpServlet {
    
	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        
	        
	        // Ejemplo básico de validación de usuario y contraseña
	        String usuario = request.getParameter("usuario");
	        String password = request.getParameter("password");
	        
	        if ("luis".equals(usuario) && "lima".equals(password)) {
	            // Iniciar sesión exitosa, redirigir a la página principal u otra página
	            response.sendRedirect("menu_principal.jsp");
	        } else {
	            // Error de credenciales, enviar mensaje de error a la página de login
	            request.setAttribute("error", "Usuario o contraseña incorrectos");
	            request.getRequestDispatcher("login.jsp").forward(request, response);
	        }
	    }
	}

