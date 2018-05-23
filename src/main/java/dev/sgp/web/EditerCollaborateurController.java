package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

public class EditerCollaborateurController extends HttpServlet {

	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/creer-colab.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String matricule = "M" + Random.class.toGenericString();

		LocalDate date = LocalDate.parse(req.getParameter("dateUser"), DateTimeFormatter.ISO_LOCAL_DATE);

		String nom = req.getParameter("nomUser");
		String prenom = req.getParameter("prenomUser");
		String adresse = req.getParameter("adresseUser");
		String numeroSecu = req.getParameter("numbSecSocUser");

		if (nom == null | prenom == null | adresse == null | numeroSecu == null) {
			String message = "Les champs nom, prenom, adresse et numero de sécurité social sont obligatoire";
			ErreurMessage(message, req, resp);

		} else if (numeroSecu.length() == 15) {
			Collaborateur collab = new Collaborateur();
			collab.setActif(true);
			collab.setAdresse(adresse);
			collab.setDateDeNaissance(date);
			collab.setMatricule(matricule);
			collab.setNom(nom);
			collab.setPrenom(prenom);
			collab.setEmailPro(prenom + "." + nom + "@societe.com");
			collab.setPhoto(req.getContextPath() + "/image/snivy_default_facebook_avatar_by_smokofenek-d67bbxo.png");
			collab.setDateHeurereation(ZonedDateTime.now());
			collab.setNumeroDeSecuriteSociale(numeroSecu);

			collabService.sauvegarderCollaborateur(collab);

			resp.setContentType("text/html");

			resp.sendRedirect("lister");

		} else {
			ErreurMessage("Le numero de sécurité social dois avoir 15 chiffre", req, resp);
		}

	}

	private void ErreurMessage(String message, HttpServletRequest req, HttpServletResponse resp) {

		try {
			resp.sendError(400, message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
