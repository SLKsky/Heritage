import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Livre extends Support{
	int i =0;
	boolean restart = true;

	private String Nb_Page;


	public Livre() {
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


	public void filecreat(Livre c)
	{
		i++;
		Scanner cdScann = new Scanner(System.in);
		System.out.println("Voulez creé un nouveaux fichier .TXT ? [Y or N]");
		String cdr = cdScann.nextLine();

		if (cdr.equals("Y"))
		{
			while(restart == true)
			{
				File file = new File("/Users/benoitbarette/Desktop/JAVA.nosync/Livre"+i+".txt");
				try 
				{
					if (file.createNewFile()){
						PrintWriter writer = new PrintWriter(file);
						writer.println("   __...--~~~~~-._   _.-~~~~~--...__\n"
								+ "    //               `V'               \\\\ \n"
								+ "   //                 |                 \\\\ \n"
								+ "  //__...--~~~~~~-._  |  _.-~~~~~~--...__\\\\ \n"
								+ " //__.....----~~~~._\\ | /_.~~~~----.....__\\\\\n"
								+ "====================\\\\|//====================\n"
								+ "                    `---`" +"\n"+ c);
						writer.close();
						System.out.println("--------------------------");
						System.out.println("Fichier créé!");
						System.out.println("Le nom du fichier est : Livre"+ i + ".txt");
						restart = false;
					}
					else 
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
			File file = new File("/Users/benoitbarette/Desktop/JAVA.nosync/originLivre.txt");
			try 
			{
				if (file.createNewFile()){
					PrintWriter writer = new PrintWriter(file);
					writer.println("   __...--~~~~~-._   _.-~~~~~--...__\n"
							+ "    //               `V'               \\\\ \n"
							+ "   //                 |                 \\\\ \n"
							+ "  //__...--~~~~~~-._  |  _.-~~~~~~--...__\\\\ \n"
							+ " //__.....----~~~~._\\ | /_.~~~~----.....__\\\\\n"
							+ "====================\\\\|//====================\n"
							+ "                    `---`" +"\n"+ c);
					writer.close();
					System.out.println("Fichier créé, originLivre a était crée !");
				}
				else
				{
					Scanner addScann = new Scanner(System.in);
					System.out.println("--------------------------");
					System.out.println("Voulez remplacer le contenue du fichier originCD ? [Y or NO]\n");
					System.out.println("--------------------------");
					String add = addScann.nextLine();

					if (add.equals("Y") || add.equals("y"))
					{
						PrintWriter writer = new PrintWriter(file);
						writer.println("   __...--~~~~~-._   _.-~~~~~--...__\n"
								+ "    //               `V'               \\\\ \n"
								+ "   //                 |                 \\\\ \n"
								+ "  //__...--~~~~~~-._  |  _.-~~~~~~--...__\\\\ \n"
								+ " //__.....----~~~~._\\ | /_.~~~~----.....__\\\\\n"
								+ "====================\\\\|//====================\n"
								+ "                    `---`" +"\n"+ c);
						writer.close();
						System.out.println("Le fichier, originLivre a etait mise a jour !");
					}
					else 
					{
						//option pour ajouter a la suite du fichier origine
						String filePath = "/Users/benoitbarette/Desktop/JAVA.nosync/originDvd.txt";
						FileWriter fw = new FileWriter(filePath, true); 
						BufferedWriter bw = new BufferedWriter(fw);
						Livre lineToAppend = c; 
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
