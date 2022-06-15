import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CD extends Multimedia {
	int i = 0;
	boolean restart = true;

	private int nbPlage;


	public CD() {
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

	public void filecreat(CD a)
	{
		//scann pour crée un nouveaux fichier
		i++;
		Scanner cdScann = new Scanner(System.in);
		System.out.println("Voulez creé un nouveaux fichier .TXT ? [Y or N]");
		String cdr = cdScann.nextLine();

		if (cdr.equals("Y"))
		{
			while(restart == true)//boucle qui tourne jusqu'a trouver un nom disponible 
			{
				File file = new File("/Users/benoitbarette/Desktop/JAVA.nosync/cd"+i+".txt");
				try 
				{
					//creation du fichier uniquement si le nom est disponible via variable incre
					if (file.createNewFile()){
						PrintWriter writer = new PrintWriter(file);
						writer.println("       ___\n"
								+ "     o|* *|o\n"
								+ "     o|* *|o\n"
								+ "     o|* *|o\n"
								+ "      \\===/\n"
								+ "       |||\n"
								+ "       |||\n"
								+ "       |||\n"
								+ "       |||\n"
								+ "    ___|||___\n"
								+ "   /   |||   \\\n"
								+ "  /    |||    \\\n"
								+ " |     |||     |\n"
								+ "  \\   (|||)   /\n"
								+ "   |   |||   |\n"
								+ "  /    |||    \\\n"
								+ " /     |||     \\\n"
								+ "/      |||      \\\n"
								+ "|     [===]     |\n"
								+ " \\             /\n"
								+ "  '.         .'\n"
								+ "    '-------'" +"\n"+ a);
						writer.close();
						System.out.println("--------------------------");
						System.out.println("Fichier créé!");
						System.out.println("Le nom du fichier est : cd"+ i + ".txt");
						restart = false;
					}
					else 
						//pour verifier si le nom du fichier existe ou pas 
					{
						i++;
					}
				} 
				catch (IOException e) 
				{
					e.printStackTrace();
				}
			}
		}
		else
		{
			File file = new File("/Users/benoitbarette/Desktop/JAVA.nosync/originCD.txt");
			try 
			{
				//creation du fichier origin
				if (file.createNewFile()){
					PrintWriter writer = new PrintWriter(file);
					writer.println("       ___\n"
							+ "     o|* *|o\n"
							+ "     o|* *|o\n"
							+ "     o|* *|o\n"
							+ "      \\===/\n"
							+ "       |||\n"
							+ "       |||\n"
							+ "       |||\n"
							+ "       |||\n"
							+ "    ___|||___\n"
							+ "   /   |||   \\\n"
							+ "  /    |||    \\\n"
							+ " |     |||     |\n"
							+ "  \\   (|||)   /\n"
							+ "   |   |||   |\n"
							+ "  /    |||    \\\n"
							+ " /     |||     \\\n"
							+ "/      |||      \\\n"
							+ "|     [===]     |\n"
							+ " \\             /\n"
							+ "  '.         .'\n"
							+ "    '-------'" +"\n"+ a);
					writer.close();
					System.out.println("Fichier créé, originCD a était crée !");
				}

				else
				{
					//input pour ecraser & modifier le fichier origin
					Scanner addScann = new Scanner(System.in);
					System.out.println("--------------------------");
					System.out.println("Voulez remplacer le contenue du fichier originCD ? [Y or NO]\n");
					System.out.println("--------------------------");
					String add = addScann.nextLine();

					if (add.equals("Y") || add.equals("y"))
					{
						PrintWriter writer = new PrintWriter(file);
						writer.println("       ___\n"
								+ "     o|* *|o\n"
								+ "     o|* *|o\n"
								+ "     o|* *|o\n"
								+ "      \\===/\n"
								+ "       |||\n"
								+ "       |||\n"
								+ "       |||\n"
								+ "       |||\n"
								+ "    ___|||___\n"
								+ "   /   |||   \\\n"
								+ "  /    |||    \\\n"
								+ " |     |||     |\n"
								+ "  \\   (|||)   /\n"
								+ "   |   |||   |\n"
								+ "  /    |||    \\\n"
								+ " /     |||     \\\n"
								+ "/      |||      \\\n"
								+ "|     [===]     |\n"
								+ " \\             /\n"
								+ "  '.         .'\n"
								+ "    '-------'" +"\n"+ a);
						writer.close();
						System.out.println("Le fichier, originCD a etait mise a jour !");
					}
					else 
					{
						//option pour ajouter a la suite du fichier origine
						String filePath = "/Users/benoitbarette/Desktop/JAVA.nosync/originCD.txt";
						FileWriter fw = new FileWriter(filePath, true); 
						BufferedWriter bw = new BufferedWriter(fw);
						CD lineToAppend = a; 
						bw.write(lineToAppend.toString());
						bw.close();
						System.out.println("--------------------------");
						System.out.println("Un ajouts a etait effectuer au fichier originCD.txt");
					}
				}
			} 
			catch (IOException e)
			{
				e.printStackTrace();
			}

		}
	}
}
