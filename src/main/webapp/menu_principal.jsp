<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Menú Principal</title>
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
        }
        .btn {
            display: inline-block;
            background-color: #28a745; 
            color: #fff; 
            text-decoration: none;
            padding: 10px 20px;
            border-radius: 5px;
            transition: background-color 0.3s ease;
        }
        .btn:hover {
            background-color: #218838; 
        }
    </style>
</head>
<body>
    <header>
        <h1>Menú Principal</h1>
    </header>
    <main>
        <div class="container">
            <a href="registrarproducto.jsp" class="btn">Registrar Producto</a>
        </div>
    </main>
</body>
</html>

