/**
 * 
 */
public package fr.class_vehicules;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

import fr.class_options.Option;
import fr.class_typemoteur.Moteur;
import fr.constantes.garage.Marque;

/**
 * @author dark
 * 
 */
public class Vehicule {
	private Double prix;
	private String nom;
	private List<Option> listeOption = new ArrayList<Option>();
	private Moteur moteur;
	private Marque nomMarque;


	/**
	 * Ajoute une option à la liste des options
	 * 
	 * @param opt
	 */
	public void addOption(final Option opt) {
		this.listeOption.add(opt);
	}

	/**
	 * @return the prix
	 */
	public Double getPrix() {
		return prix;
	}

	/**
	 * Calcul du prix total du vehicule en comptabilisant les options
	 * @param prix
	 *            the prix to set
	 */
	public void setPrix(final Double prix) {
		Double prixTotal = null;
		prixTotal = moteur.getPrix();
		if (!this.listeOption.isEmpty()) {
			for (final Option option : listeOption) {
				prixTotal = prixTotal + option.getPrix();
			}
		}
		this.prix = prixTotal;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(final String nom) {
		this.nom = nom;
	}

	/**
	 * @return the listeOption
	 */
	public List<Option> getListeOption() {
		return listeOption;
	}

	/**
	 * @param listeOption
	 *            the listeOption to set
	 */
	public void setListeOption(final List<Option> listeOption) {
		this.listeOption = listeOption;
	}

	/**
	 * @return the moteur
	 */
	public Moteur getMoteur() {
		return moteur;
	}

	/**
	 * @param moteur
	 *            the moteur to set
	 */
	public void setMoteur(final Moteur moteur) {
		this.moteur = moteur;
	}

	/**
	 * @return the nomMarque
	 */
	public Marque getNomMarque() {
		return nomMarque;
	}

	/**
	 * @param nomMarque
	 *            the nomMarque to set
	 */
	public void setNomMarque(final Marque nomMarque) {
		this.nomMarque = nomMarque;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder vehicule = new StringBuilder();
		vehicule.append("+ ");
		vehicule.append("Voiture ");
		vehicule.append(getNomMarque());
		vehicule.append(" : ");
		vehicule.append(getNom());
		vehicule.append(" ");
		vehicule.append(getMoteur());
		// On vérifie qu'il y a une option avant de les parcourir
		if (!this.listeOption.isEmpty()) {
			vehicule.append("[ ");
			//on cré une énumération pour parcourir la liste d'options
			final Enumeration e = Collections.enumeration(listeOption);
			while(e.hasMoreElements()){
				vehicule.append(e.nextElement().toString());
				if(e.hasMoreElements()){
					vehicule.append(", ");
				}

			}
			vehicule.append("] ");
		}
		vehicule.append("d'une valeur totale de ");
		vehicule.append(getPrix());
		vehicule.append("€.");
		return vehicule.toString();
	}

}
