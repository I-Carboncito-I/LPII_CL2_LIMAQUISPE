<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Registrar y Listar Productos</title>
    <link rel="stylesheet" href="styles.css">
    <style>
        body {
            background-color: #c5dec9; 
            color: #212529; 
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }
        header {
            background-color: #c5dec9; 
            color: #000; 
            text-align: center;
            padding: 20px 0;
        }
        main {
            padding: 20px;
            text-align: center;
        }
        .container {
            max-width: 600px;
            margin: 0 auto;
            padding: 20px;
            background-color: #fff; 
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        .btn {
            display: inline-block;
            background-color: #007bff; 
            color: #fff; 
            text-decoration: none;
            padding: 10px 20px;
            border-radius: 5px;
            transition: background-color 0.3s ease;
            cursor: pointer;
        }
        .btn:hover {
            background-color: #0056b3; 
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }
        table, th, td {
            border: 1px solid #ddd;
        }
        th, td {
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <header>
        <h1>Registrar y Listar Productos</h1>
    </header>
    <main>
        <div class="container">
            <!-- Formulario de Registro de Producto -->
            <h2>Registrar Producto</h2>
            <form action="ControladorProducto" method="post">
                <input type="hidden" name="action" value="registrar">
                <table>
                    <tr>
                        <td>Nombre:</td>
                        <td><input type="text" name="nombre" required/></td>
                    </tr>
                    <tr>
                        <td>Precio de Compra:</td>
                        <td><input type="number" name="preciocompra" step="0.01" required/></td>
                    </tr>
                    <tr>
                        <td>Precio de Venta:</td>
                        <td><input type="number" name="precioventa" step="0.01" required/></td>
                    </tr>
                    <tr>
                        <td>Estado:</td>
                        <td>
                            <select name="estado" required>
                                <option value="Activo">Activo</option>
                                <option value="Inactivo">Inactivo</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>Descripción:</td>
                        <td><textarea name="descripcion" rows="4" cols="50" required></textarea></td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="submit" value="Registrar Producto" class="btn"/></td>
                    </tr>
                </table>
            </form>
            
            <!-- Listado de Productos -->
<h2>Listado de Productos</h2>
<div class="container">
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>Precio Compra</th>
                <th>Precio Venta</th>
                <th>Estado</th>
                <th>Descripción</th>
            </tr>
        </thead>
        <tbody>
            <!-- Iterar sobre la lista de productos -->
            <c:forEach items="${productos}" var="producto">
                <tr>
                    <td>${producto.idproductocl2}</td>
                    <td>${producto.nombrecl2}</td>
                    <td>${producto.preciocompcl2}</td>
                    <td>${producto.precioventacl2}</td>
                    <td>${producto.estadocl2}</td>
                    <td>${producto.descripcl2}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>
    </main>
</body>
</html>


