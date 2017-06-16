
<%@page import="cl.accesodato.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PRUEBA BD</title>
    </head>
    <body>
        <%
            Conexion conn = new Conexion();
            //conn.setInsertar("insert into courses(name, descripcion, created_at) "
              //      + "values('Sistema 2', 'Sin Descripcion',now())");
            conn.setInsertar("insert into users(name, apepat, apemat, username, password, created_at, state) "
                    + "values('Juan','Guerrero','Guerrero','jgue','secret',now(),'active')");
        %>
    </body>
</html>
