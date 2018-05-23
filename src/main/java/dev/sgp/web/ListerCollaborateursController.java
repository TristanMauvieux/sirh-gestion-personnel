package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZonedDateTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

public class ListerCollaborateursController extends HttpServlet {
	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Collaborateur phil = new Collaborateur();
		phil.setPrenom("philipe");
		phil.setAdresse("2 rue des palmier");
		phil.setEmailPro("philipe@enterprise.org");
		phil.setMatricule("INFO95");
		phil.setNom("Martin");
		phil.setNumeroDeSecuriteSociale("1 115 9961 55499 448");
		phil.setDateDeNaissance(LocalDate.of(1985, 12, 5));
		phil.setDateHeurereation(ZonedDateTime.now());
		collabService.sauvegarderCollaborateur(phil);
		req.setAttribute("listeNoms", collabService.listeCollaborateurs());
		req.getRequestDispatcher("/listerCollaborateur.jsp").forward(req, resp);

	}

}
