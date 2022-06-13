import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		boolean start = true;
		//boucle pour revenir au choix

		while (start == true)
		{
			//declaration de scan pour choix de creation objet
			System.out.println("--------------------------");
			System.out.println("Que voulez vous créer : [CD | Dvd | livre | Q ] ? : \n");
			Scanner cScann = new Scanner(System.in);//nom du scann aleatoire
			String choix = cScann.nextLine();

			//condition pout choix
			if (choix.equals("CD" ))
			{
				CD a = new CD(null, null, null); 
				System.out.println(a);
			}
			else if (choix.equals("Dvd"))
			{
				Dvd b = new Dvd(null, null, null, 0, null);
				System.out.println(b);
			}
			else if (choix.equals("livre"))
			{
				Livre c = new Livre(0, null, null, null, 0, null);
				System.out.println(c);
			}
			else if (choix.equals("Q"))
			{
				System.out.println("Le programme c'est parfaitement cloturée");
				System.out.println("------------------------------------------");
				System.out.println("                     __\n"
						+ "         .,-;-;-,.  /'_\\\n"
						+ "       _/_/_/_|_\\_\\) /\n"
						+ "     '-<_><_><_><_>=/\\\n"
						+ "      `/_/====/_/-'\\_\\\n"
						+ "       \"\"     \"\"    \"\"");
				System.out.println("------------------------------------------");
				System.exit(0);
			}

		}





		//		//print de support
		//		System.out.println("------------------------------------------");
		//		System.out.println("                     __\n"
		//				+ "         .,-;-;-,.  /'_\\\n"
		//				+ "       _/_/_/_|_\\_\\) /\n"
		//				+ "     '-<_><_><_><_>=/\\\n"
		//				+ "      `/_/====/_/-'\\_\\\n"
		//				+ "       \"\"     \"\"    \"\"");
		//		System.out.println("------------------------------------------");
		//		Support a = new Support();
		//		System.out.println(a);
		//		System.out.println("--------------------------------");
		//		
		//		//print de multi
		//		Multimedia b = new Multimedia();
		//		System.out.println(b.getDuree() + " heure en moyen!");
		//		System.out.println("--------------------------------");
		//		
		//		//print de livre 
		//		Livre c = new Livre();
		//		System.out.println(c.getNb_Page() + " page !");
		//		System.out.println("--------------------------------");
		//		
		//		//print de dvd
		//		Dvd d = new Dvd();
		//		System.out.println("Type de bonus a l'achat : ["+ d.getBonus()+ "] Un QR-CODE et disponible au dos !");
		//		System.out.println("--------------------------------");
		//		
		//		//print de cd
		//		CD e = new CD();
		//		System.out.println("Nombre de plage : "+ e.getNbPlage()+ " Ils s'agit d'un livre !");
		//		System.out.println("--------------------------------");

	}

}
