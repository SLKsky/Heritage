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
				File file = new File("/Users/benoitbarette/Desktop/JAVA.nosync/test.txt");

				try 
				{
					if (file.createNewFile()){
						PrintWriter writer = new PrintWriter(file);
						writer.println(a);
						writer.close();
						System.out.println("Fichier créé!");
					}else{
						System.out.println("Fichier existe déjà.");
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else if (choix.equals("Dvd"))
			{
				Dvd b = new Dvd();
				System.out.println(b);
				File file = new File("/Users/benoitbarette/Desktop/JAVA.nosync/test.txt");

				try 
				{
					if (file.createNewFile()){
						PrintWriter writer = new PrintWriter(file);
						writer.println(b);
						writer.close();
						System.out.println("Fichier créé!");
					}else{
						System.out.println("Fichier existe déjà.");
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else if (choix.equals("livre"))
			{
				Livre c = new Livre();
				System.out.println(c);
				File file = new File("/Users/benoitbarette/Desktop/JAVA.nosync/test.txt");

				try 
				{
					if (file.createNewFile()){
						PrintWriter writer = new PrintWriter(file);
						writer.println(c);
						writer.close();
						System.out.println("Fichier créé!");
					}else{
						System.out.println("Fichier existe déjà.");
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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


