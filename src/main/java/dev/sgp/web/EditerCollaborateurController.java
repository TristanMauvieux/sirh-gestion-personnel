package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditerCollaborateurController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String matricule = req.getParameter("matricule");
		resp.setContentType("text/html");

		if (matricule == null) {
			resp.setStatus(400);
			resp.sendError(400, "un matricule est attendu");
		} else {
			resp.getWriter().write(
					"<h1>Edition des Collaborateurs</h1>" + "<ul>" + "<li>Matricule :" + matricule + "</li>" + "</ul>");

		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String matricule = req.getParameter("matricule");
		String titre = req.getParameter("titre");
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");

		resp.setContentType("text/html");

		if (matricule == null | titre == null | nom == null | prenom == null) {
			resp.setStatus(400);
			resp.sendError(400, "Le matricule est " + matricule + " le titre est " + titre + " le nom est " + nom
					+ " le prenom est " + prenom + " et tous doivent être renseigné.");
		} else {
			resp.setStatus(201);
			resp.getWriter()
					.write("<h1>Edition des Collaborateurs</h1>" + "<ul>" + "<li>Matricule = " + matricule + "</li>"
							+ "<li>titre = " + titre + "</li>" + "<li>nom = " + nom + "</li>" + "<li>prenom = " + prenom
							+ "</li>" + "</ul>");

		}
	}

}
