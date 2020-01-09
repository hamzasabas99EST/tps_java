package gestionEleves;

import java.util.ArrayList;

public class GroupeEleves {
	ArrayList<Eleve> listeEleve = new ArrayList<Eleve>();
	
	public int nombre() {
		return listeEleve.size();
	}
	
	public ArrayList<Eleve> getListe(){
		return listeEleve;
	}
	
	public void ajouterEleve(Eleve eleve) {
		listeEleve.add(eleve);
	}
	
	public void lister() {
		for(Eleve e: this.listeEleve) 
			System.out.println(e);
		 

	}
	
	public Eleve chercher(String nom) {
		for(Eleve eleve : listeEleve) {
			if(eleve.getNom().equals(nom)) {System.out.print(nom+" est exist \n");return eleve;}
		}
		return null;
	}
}

