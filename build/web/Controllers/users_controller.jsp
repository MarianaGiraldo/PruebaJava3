<%-- 
    Document   : user_controller
    Created on : 4/02/2022, 07:31:45 PM
    Author     : Mariana
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Models.Professor"%>
<%@page import="Models.Student" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%! 
    String dato;
    Student s = new Student();
    Professor p = new Professor();
    //ArrayList listUser = new ArrayList();
    ResultSet listUser;
%>
<% 
    String btnCrear = request.getParameter("btnCrear");
    String btnModificar = request.getParameter("btnModificar");
    String btnConsultar = request.getParameter("btnConsultar");
    String btnListar = request.getParameter("btnListar");
    
    if(btnCrear != null && btnCrear.equals("Crear")){
        if(request.getParameter("txtCodEstudiante") != null){
            s = new Student(
                    request.getParameter("txtCodEstudiante"), 
                    Float.parseFloat(request.getParameter("txtNotaPromedio")), 
                    request.getParameter("txtNombre"), 
                    request.getParameter("txtTelefono"),  
                    request.getParameter("txtCorreo"),
                    "Estudiante"
             );
            dato = s.insertStudent(); 
        }else{
            p = new Professor(
                    Integer.parseInt(request.getParameter("txtSalario")), 
                    request.getParameter("txtNombre"), 
                    request.getParameter("txtTelefono"), 
                    request.getParameter("txtCorreo"),
                    "Profesor"
            );
            dato = p.insertProfessor();
        }
        
    }
    if(btnConsultar != null && btnConsultar.equals("Consultar") ){
        if(request.getParameter("txtCodEstudiante") != null){
            dato = s.consultStudent();
            dato += "<br/>" + s.getData();
        }else{
            dato = p.consultProfessor();
            dato += "<br/>" + p.getData();
        }
        
    }
    if(btnModificar != null && btnModificar.equals("Modificar") ){
        if(request.getParameter("txtCodEstudiante") != null){
            dato = s.editStudent();
        }else{
            dato = p.editProfessor();
        }
        
    }
    if(btnListar != null && btnListar.equals("Listar") ){
        if(request.getParameter("txtCodEstudiante") != null){
            listUser = s.listUsers();
        }else{
            listUser = p.listUsers();
        }
        
        request.setAttribute("list", listUser);
        request.getRequestDispatcher("../Views/list_users.jsp").forward(request, response);
    }
    
    request.setAttribute("datos", dato);
    request.getRequestDispatcher("../Views/view_user.jsp").forward(request, response);
%>
