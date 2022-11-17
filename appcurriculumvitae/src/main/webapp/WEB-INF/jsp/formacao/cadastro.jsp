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

	<h2>Candidato</h2>
	  <form action="/formacao/incluir" method="post">
	    <div class="form-group">
	      <label>Instituicao:</label>
	      <input type="text" class="form-control" placeholder="Entre com o nome da Instituição" name="instituicao">
	      <label>Curso:</label>
	      <input type="text" class="form-control" placeholder="Entre com curso" name="curso">
	      <label>Nivel:</label>
	      <input type="text" class="form-control" placeholder="Entre com o nível" name="nivel">
	    </div>

	    <button type="submit" class="btn btn-default">Cadastrar</button>
	  </form>
  
	</div>
</body>
</html>