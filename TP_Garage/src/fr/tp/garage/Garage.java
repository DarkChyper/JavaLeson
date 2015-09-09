/**
 * 
 */
public package fr.tp.garage;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.NoSuchFileException;
import java.util.ArrayList;
import java.util.List;

import fr.class_options.Option;
import fr.class_vehicules.Vehicule;


/**
 * Classee principale de mon garage contenant la liste des voitures permettant
 * d'afficher le contenu du garage et d'ajouter des voitures
 * 
 * @author dark
 * 
 */
public class Garage implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Vehicule> voitures = new ArrayList<Vehicule>();
	private final String fichier;

	/**
	 * Constructeur par défaut du Garage
	 */
	public Garage(final String fichier) {
		this.fichier = fichier;
		// On commence par vérifier la présence du fichier contenant les
		// précédentes voitures enregistrées sous forme d'une ArrayList
		try ( FileInputStream fis = new FileInputStream(this.fichier);
				ObjectInputStream ois = new ObjectInputStream(fis)) {

			voitures = (ArrayList<Vehicule>)ois.readObject();

		} catch (final NoSuchFileException e) {
			System.out.println("Le fichier \"" + fichier + "\" n'existe pas." );
			System.out.println("Le garage est vide !");

		} catch (final IOException e) {
			System.out.println("IOException");
			System.out.println("Le garage est vide");

		} catch (final ClassNotFoundException e) {
			System.out.println("ClassNotFoundException");
			System.out.println("Le garage est vide");
		}       

		finally{
			// Quoi qu'il arrive, on affiche l'enseigne du Garage OpenClassrooms
			System.out.println("*************************");
			System.out.println("* Garage OpenClassrooms *");
			System.out.println("*************************");
		}

	}

	/**
	 * @return
	 */
	public String getFichier() {
		return fichier;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder garage = new StringBuilder();
		for (final Vehicule voiture : voitures) {
			garage.append(voiture);
			garage.append("\n");
		}
		return garage.toString();
	}

	/**
	 * Calcul le prix total d'un véhicule, avec chaque option
	 * @param voit
	 * @return prixTotal
	 */
	private Double CalculPrixTotal (final Vehicule voit){
		Double prixTotal = null;
		// on récupère le prix du moteur
		prixTotal = voit.getMoteur().getPrix();
		//on récupère le prix de chaque option
		if (!voit.getListeOption().isEmpty()) {
			for (final Option option : voit.getListeOption()) {
				prixTotal = prixTotal + option.getPrix();
			}
		}
		return prixTotal;
	}

	private void EnregistrerGarage(final List<Vehicule> listVehicules){
		try ( final ObjectOutputStream oos = new ObjectOutputStream(

				new BufferedOutputStream(

						new FileOutputStream(

								new File(this.fichier))))){
			oos.writeObject(listVehicules);
			System.out.println("Enregistrement OK");

		}catch (final Exception e) {
			System.out.println(e);
		}
	}

	/**
	 * Méthode finalisant en véhicule en demandant le calcul du prix total, 
	 * ajoute le véhicule dans la liste du Garage
	 * ajoute le véhicule dans le fichier de sauvegarde du Garage
	 * @param voit
	 */
	public void addVoiture(final Vehicule voit) {
		// Avant d'ajouter la voiture à la liste, on calcul le prix total avec toutes les options
		voit.setPrix(CalculPrixTotal(voit));

		// On ajoute la voiture à la liste du garage
		this.voitures.add(voit);

		// On enregistre la liste des vehicule dans le fichier de sauvegarde
		EnregistrerGarage(voitures);
	}
}
