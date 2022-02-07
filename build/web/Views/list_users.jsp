<%-- 
    Document   : list_users
    Created on : 7/02/2022, 07:39:51 AM
    Author     : Mariana
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    ArrayList users = new ArrayList();
    users = (ArrayList)request.getAttribute("list");
    
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="../components/bootstrap.jsp" %>
        <title>Lista Usuarios</title>
    </head>
    <body class="bg-light">
        <%@include file="../components/nav_controllers.jsp" %>
        <div class="container mt-4">
            <div class="m-auto w-75 p-3 bg-success bg-opacity-25 rounded">
                <h1>Lista Usuarios</h1>
                
                <table class="table">
                    <tr>
                        <th>Nombre</th>
                        <th>Email</th>
                        <th>Telefono</th>
                        <th>Tipo de Usuario</th>
                <%
                    for(int i=0; i < users.size() ; i++){
                        if(i%4==0){
                        %>
                            </tr>
                            <tr>
                                <td>
                                    <%= users.get(i)%>
                                </td>
                        <%
                        } else{ 
                        %>
                        <td>
                            <%= users.get(i)%>
                        </td>
                <%    
                        }}
                %>
                </table>
            </div>
        </div>
    </body>
</html>
