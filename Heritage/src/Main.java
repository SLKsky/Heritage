import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
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
				CD a = new CD(); 
				System.out.println(a);
				a.filecreat(a);
			}
			
			else if (choix.equals("Dvd"))
			{
				Dvd b = new Dvd();
				System.out.println(b);
				b.filecreat(b);
			}
			else if (choix.equals("livre"))
			{
				Livre c = new Livre();
				System.out.println(c);
				c.filecreat(c);
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

	}

}


