/**
 * 
 */
public package fr.class_vehicules;

import java.util.ArrayList;
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
	 * @param prix
	 *            the prix to set
	 */
	public void setPrix(final Double prix) {
		this.prix = prix;
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
		// TODO Auto-generated method stub
		return super.toString();
	}

}
