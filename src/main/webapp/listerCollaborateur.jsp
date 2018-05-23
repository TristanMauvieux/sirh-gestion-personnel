<%@page import="dev.sgp.entite.Collaborateur"%>
<%@page import="java.util.List" %>
<%@page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>SGP-App</title>
		<link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap-3.3.7-dist/css/bootstrap.css">
	</head>
	<body>
		<h1>Les collaborateurs</h1>
		
		<%
		List<Collaborateur> listeNoms = (List<Collaborateur>)request.getAttribute("listeNoms");
		for(Collaborateur collab:listeNoms){
		%>
		<img src="<%=collab.getPhoto() %>" style="width: 40px">
		<ul>
			<li><label>Nom : </label><%=collab.getNom() %></li>
			<li><label>Prenom : </label><%=collab.getPrenom() %></li>
			<li><label>Date de naissance : </label><%=collab.getDateDeNaissance().toString() %>
			<li><label>Adresse :</label><%=collab.getAdresse() %></li>
			<li><label>Email :</label><%= collab.getEmailPro() %> </li>
			<li><label>Matricule :</label><%=collab.getMatricule() %></li>
			<li><label>Numero de securite social</label><%=collab.getNumeroDeSecuriteSociale() %> </li>
			<li><label>Crée à :</label><%=collab.getDateHeurereation() %></li>
			<li><label>actif ?</label><% if(collab.isActif()){ %> <label>Oui</label><%} else{ %><label>Non</label><%} %>
			
		</ul>
			<%} %>
		
	
	</body>
</html>