package gestionEleves;

import java.util.*;

public class testerEleve {

	public static void main(String[] args) {
		
		GroupeEleves g1 =new GroupeEleves();
		
		Eleve e1=new Eleve("Hamza");
		g1.ajouterEleve(e1);
		e1.ajouterNote(10);
		e1.ajouterNote(15);
		e1.ajouterNote(13);
		
		Eleve e2=new Eleve("Soulaimane");
		e2.ajouterNote(15);
		e2.ajouterNote(15);
		e2.ajouterNote(13);
		g1.ajouterEleve(e2);
		Eleve e3=new Eleve("Soulaimane");
		e3.ajouterNote(15);
		e3.ajouterNote(15);
		e3.ajouterNote(13);
		g1.ajouterEleve(e3);
		
		g1.chercher("Hamza");
		
		g1.lister();
		
		/*System.out.println(g1.getListe().get(0).compareTo(g1.getListe().get(1)));
		Collections.sort(g1.getListe());
		
		System.out.println(Collections.max(g1.getListe()));
*/
		
	}
}
