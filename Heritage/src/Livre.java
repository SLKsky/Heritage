
public class Livre extends Support{
	
	private String Nb_Page;

	
	public Livre(int Nb_Page,String Auteur, String Titre, String Reference, int duree,String bonus) {
		super();
		this.Nb_Page = Uti.scanString("Qu'elle est le nombre de page ? ");

		
	}

	public String getNb_Page() {
		return Nb_Page;
	}

	public void setNb_Page(String nb_Page) {
		Nb_Page = nb_Page;
	}

	@Override
	public String toString() {
		return super.toString() + "\nNb_Page : "+ Nb_Page ;
	}
	
	
}
