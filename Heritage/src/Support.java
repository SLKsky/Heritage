import java.util.*;

public class Support{

	private String Auteur;
	private String Titre;
	private String Reference;


	public String getAuteur() 
	{
		return Auteur;
	}

	public void setAuteur(String auteur) 
	{
		Auteur = auteur;
	}
	public String getTitre() 
	{
		return Titre;
	}
	public void setTitre(String titre) 
	{
		Titre = titre;
	}
	public String getReference() 
	{
		return Reference;
	}
	public void setReference(String reference) {
		Reference = reference;
	}

	public Support()
	{
		System.out.println("--------------------------");
		Auteur = Uti.scanString("Quelle est l'auteur ?");
		System.out.println("--------------------------");
		Titre = Uti.scanString("Quelle est le titre ?");
		System.out.println("--------------------------");
		Reference = Uti.scanString("Quelle est la référence ?");
		System.out.println("--------------------------");

	}

	public String toString()

	{
		return "--------------------------\n" +"Auteur : " + this.Auteur + "\nTitre : " + this.Titre + "\nReference : " + this.Reference ;
	}

}
