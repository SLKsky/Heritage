

public class Dvd extends Multimedia {

	private String bonus;

	public String getBonus() {
		return bonus;
	}

	public void setBonus(String bonus) {
		this.bonus = bonus;
	}
	
	public  Dvd(String Auteur, String Titre, String Reference, int duree,String bonus) {
		super();
		// TODO Auto-generated constructor stub
		 this.bonus = Uti.scanString("Qu'elle est le bonus ? ");

	}

	@Override
	public String toString() {
		return super.toString() + "\nle bonus est : "+ bonus;
	}
	
}