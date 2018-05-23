package dev.sgp.service;

import java.util.ArrayList;
import java.util.List;

import dev.sgp.entite.VisiteWeb;

public class VisiteWebService {

	List<VisiteWeb> visite = new ArrayList<>();

	public List<VisiteWeb> listeVisite() {
		return visite;
	}

	public void sauvegardeVisite(VisiteWeb vWeb) {
		visite.add(vWeb);
	}

}
