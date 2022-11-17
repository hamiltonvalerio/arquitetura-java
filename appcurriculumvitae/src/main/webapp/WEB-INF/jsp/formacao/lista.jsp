<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastro de Formação</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">
	  <h3>Formação: ${listagem.size()}</h3>

	  <h4><a href="/formacao">Formação</a></h4>

	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>Instituicao</th>
	        <th>Curso</th>
	        <th>Nivel</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
		  <c:forEach var="s" items="${listagem}">
		      <tr>
				<td>${s.id}</td>
		        <td>${s.instituicao}</td>
		        <td>${s.curso}</td>
		        <td>${s.nivel}</td>
		        <td><a href="/formacao/${s.id}/excluir">excluir</a></td>
		      </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	</div>
</body>
</html>