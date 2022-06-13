
public class CD extends Multimedia {

	private int nbPlage;
	
	
	public CD(String Auteur, String Titre, String Reference) {
		super();
		// TODO Auto-generated constructor stub
		 nbPlage = Uti.scanInteger("Quelle est le nombre de plage ?");

	}
	
	
	public int getNbPlage() {
		return nbPlage;
	}

	public void setNbPlage(int nbPlage) {
		this.nbPlage = nbPlage;
	}

	
	
	public String toString() {
		
        return super.toString() + "\nLe nombre de plage est deux : " + nbPlage;
    }
	
}
