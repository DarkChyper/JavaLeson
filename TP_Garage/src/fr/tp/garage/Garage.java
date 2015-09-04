/**
 * 
 */
public package fr.tp.garage;

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
		this.voitures.add(voit);
	}
}
