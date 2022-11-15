<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet">
<title>Cadastro de Atuação Profissional</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container mt-3">
		<h3>Atuação Profissional: ${listagem.size()}</h3>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>Empresa</th>
					<th>Cargo</th>
					<th>Função</th>
					<th>Início</th>
					<th>Fim</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="ap" items="${listagem}">
					<tr>
						<td>${ap.id}</td>
						<td>${ap.nomeEmpresa}</td>
						<td>${ap.cargo}</td>
						<td>${ap.funcao}</td>
						<td>${ap.dataInicio}</td>
						<td>${ap.dataFim}</td>
						<td><a href="/atuacaoprofissional/${ap.id}/excluir">excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>