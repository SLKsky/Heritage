import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Dvd extends Multimedia {
	int i = 0;
	boolean restart = true;


	private String bonus;

	public String getBonus() {
		return bonus;
	}

	public void setBonus(String bonus) {
		this.bonus = bonus;
	}

	public  Dvd() {
		super();
		// TODO Auto-generated constructor stub
		this.bonus = Uti.scanString("Qu'elle est le bonus ? ");

	}

	@Override
	public String toString() {
		return super.toString() + "\nle bonus est : "+ bonus;
	}


	public void filecreat(Dvd b )
	{
		i++;
		Scanner cdScann = new Scanner(System.in);
		System.out.println("Voulez creé un nouveaux fichier .TXT ? [Y or N]");
		String cdr = cdScann.nextLine();

		if (cdr.equals("Y"))
		{
			while(restart == true)
			{
				File file = new File("/Users/benoitbarette/Desktop/JAVA.nosync/Dvd"+i+".txt");
				try 
				{
					if (file.createNewFile()){
						PrintWriter writer = new PrintWriter(file);
						writer.println("                       ___....___\n"
								+ "                  _,--'''          ```--._\n"
								+ "                ,'                        `.\n"
								+ "               /_,_,_,_,_,_,_,_,_,_,_,_,_,_,\\\n"
								+ "           _,-----._         ||\n"
								+ "         ,'(     /  `.       ||\n"
								+ "        (__ __/_/._,'_)      ||\n"
								+ "       ( _,/ `. ,' `.  )     ||\n"
								+ "       (_ |  o . o  |-')     ||\n"
								+ "        `-|    |    |-'      ||\n"
								+ "           \\   O   /         ||\n"
								+ "  ____      `.___,'      ____||\n"
								+ ",' / /`._____)===(_____,'\\ \\ ||\n"
								+ "( ( ( (|  `-'/_|_\\`.'  |) ) )||\n"
								+ " \\_\\_\\_|    _______    |_/_/_||\n"
								+ "   |  ||   [_______]   ||  | ||\n"
								+ "   |  ||_,'  ,' `.  `._||  |/  |\n"
								+ "   |  ||__,-'     `-.__||  |\\__|\n"
								+ "   |  | \\             / |  /  /\n"
								+ "   |  |  \\           /  |    /\n"
								+ "   \\  \\   \\_________/   |__,'\n"
								+ "    \\  \\  |_________|\n"
								+ "     \\  \\'           `-.\n"
								+ "     ,\\  `. '   :  `. `.`.\n"
								+ "    /  `--'   '        .  \\\n"
								+ "   / '   ,        '  \\  \\  \\\n"
								+ "   |  |       |   .   |    |\n"
								+ "   |_______________________|\n"
								+ "         |    | |    |\n"
								+ "         |    | |    |\n"
								+ "         |    | |    |\n"
								+ "         |    | |    |\n"
								+ "         |    | |    |\n"
								+ "         |  -.| |  -.|\n"
								+ "         (    ) (    )\n"
								+ "         |`-  | |`-- |\n"
								+ "         |    | |    |\n"
								+ "         |    | |    |\n"
								+ "         |    | |    |\n"
								+ "         |__ _| |____|\n"
								+ "         (____) (____)" +"\n"+ b);
						writer.close();
						System.out.println("--------------------------");
						System.out.println("Fichier créé!");
						System.out.println("Le nom du fichier est : Dvd"+ i + ".txt");
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
			File file = new File("/Users/benoitbarette/Desktop/JAVA.nosync/originDVD.txt");
			try 
			{
				if (file.createNewFile()){
					PrintWriter writer = new PrintWriter(file);
					writer.println("                       ___....___\n"
							+ "                  _,--'''          ```--._\n"
							+ "                ,'                        `.\n"
							+ "               /_,_,_,_,_,_,_,_,_,_,_,_,_,_,\\\n"
							+ "           _,-----._         ||\n"
							+ "         ,'(     /  `.       ||\n"
							+ "        (__ __/_/._,'_)      ||\n"
							+ "       ( _,/ `. ,' `.  )     ||\n"
							+ "       (_ |  o . o  |-')     ||\n"
							+ "        `-|    |    |-'      ||\n"
							+ "           \\   O   /         ||\n"
							+ "  ____      `.___,'      ____||\n"
							+ ",' / /`._____)===(_____,'\\ \\ ||\n"
							+ "( ( ( (|  `-'/_|_\\`.'  |) ) )||\n"
							+ " \\_\\_\\_|    _______    |_/_/_||\n"
							+ "   |  ||   [_______]   ||  | ||\n"
							+ "   |  ||_,'  ,' `.  `._||  |/  |\n"
							+ "   |  ||__,-'     `-.__||  |\\__|\n"
							+ "   |  | \\             / |  /  /\n"
							+ "   |  |  \\           /  |    /\n"
							+ "   \\  \\   \\_________/   |__,'\n"
							+ "    \\  \\  |_________|\n"
							+ "     \\  \\'           `-.\n"
							+ "     ,\\  `. '   :  `. `.`.\n"
							+ "    /  `--'   '        .  \\\n"
							+ "   / '   ,        '  \\  \\  \\\n"
							+ "   |  |       |   .   |    |\n"
							+ "   |_______________________|\n"
							+ "         |    | |    |\n"
							+ "         |    | |    |\n"
							+ "         |    | |    |\n"
							+ "         |    | |    |\n"
							+ "         |    | |    |\n"
							+ "         |  -.| |  -.|\n"
							+ "         (    ) (    )\n"
							+ "         |`-  | |`-- |\n"
							+ "         |    | |    |\n"
							+ "         |    | |    |\n"
							+ "         |    | |    |\n"
							+ "         |__ _| |____|\n"
							+ "         (____) (____)" +"\n"+ b);
					writer.close();
					System.out.println("Fichier créé, originDvd a était crée !");
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
						writer.println("                       ___....___\n"
								+ "                  _,--'''          ```--._\n"
								+ "                ,'                        `.\n"
								+ "               /_,_,_,_,_,_,_,_,_,_,_,_,_,_,\\\n"
								+ "           _,-----._         ||\n"
								+ "         ,'(     /  `.       ||\n"
								+ "        (__ __/_/._,'_)      ||\n"
								+ "       ( _,/ `. ,' `.  )     ||\n"
								+ "       (_ |  o . o  |-')     ||\n"
								+ "        `-|    |    |-'      ||\n"
								+ "           \\   O   /         ||\n"
								+ "  ____      `.___,'      ____||\n"
								+ ",' / /`._____)===(_____,'\\ \\ ||\n"
								+ "( ( ( (|  `-'/_|_\\`.'  |) ) )||\n"
								+ " \\_\\_\\_|    _______    |_/_/_||\n"
								+ "   |  ||   [_______]   ||  | ||\n"
								+ "   |  ||_,'  ,' `.  `._||  |/  |\n"
								+ "   |  ||__,-'     `-.__||  |\\__|\n"
								+ "   |  | \\             / |  /  /\n"
								+ "   |  |  \\           /  |    /\n"
								+ "   \\  \\   \\_________/   |__,'\n"
								+ "    \\  \\  |_________|\n"
								+ "     \\  \\'           `-.\n"
								+ "     ,\\  `. '   :  `. `.`.\n"
								+ "    /  `--'   '        .  \\\n"
								+ "   / '   ,        '  \\  \\  \\\n"
								+ "   |  |       |   .   |    |\n"
								+ "   |_______________________|\n"
								+ "         |    | |    |\n"
								+ "         |    | |    |\n"
								+ "         |    | |    |\n"
								+ "         |    | |    |\n"
								+ "         |    | |    |\n"
								+ "         |  -.| |  -.|\n"
								+ "         (    ) (    )\n"
								+ "         |`-  | |`-- |\n"
								+ "         |    | |    |\n"
								+ "         |    | |    |\n"
								+ "         |    | |    |\n"
								+ "         |__ _| |____|\n"
								+ "         (____) (____)" +"\n"+ b);
						writer.close();
						System.out.println("Le fichier, originDvd a etait mise a jour !");
					}
					else 
					{
						//option pour ajouter a la suite du fichier origine
						String filePath = "/Users/benoitbarette/Desktop/JAVA.nosync/originDvd.txt";
						FileWriter fw = new FileWriter(filePath, true); 
						BufferedWriter bw = new BufferedWriter(fw);
						Dvd lineToAppend = b; 
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
