/**
 * 
 */
public package fr.tp.garage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

import fr.class_vehicules.Vehicule;


/**
 * Classee principale de mon garage contenant la liste des voitures permettant
 * d'afficher le contenu du garage et d'ajouter des voitures
 * 
 * @author dark
 * 
 */
public class Garage {
	private final List<Vehicule> voitures = new ArrayList<Vehicule>();

	/**
	 * Constructeur par défaut du Garage
	 */
	public Garage() {
		// On commence par vérifier la présence du fichier contenant les
		// précédentes voitures
		FileInputStream sauvegardeLecture;
		FileChannel sauvegardeLectureChannel;

		try {
			//Création d'un nouveau flux de fichier
			sauvegardeLecture = new FileInputStream(new File("Garage"));
			//On récupère le canal
			sauvegardeLectureChannel = sauvegardeLecture.getChannel();
			//On en déduit la taille
			final int size = (int)sauvegardeLectureChannel.size();
			//On crée un buffer correspondant à la taille du fichier
			final ByteBuffer bBuff = ByteBuffer.allocate(size);
		} catch (final FileNotFoundException e) {

			System.out.println("Fichier de sauvegarde introuvable");

		} catch (final IOException e) {

			//Gestion des exceptions

		}       

		finally{
			// On affiche le début du garage
			System.out.println("*************************");
			System.out.println("* Garage OpenClassrooms *");
			System.out.println("*************************");
		}

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
	 * @param voit
	 */
	public void addVoiture(final Vehicule voit) {
		// Lorsque l'on ajoute la voiture à la collection,
		// on calcul le prix total avec les options
		voit.setPrix(0d);
		this.voitures.add(voit);
	}
}
