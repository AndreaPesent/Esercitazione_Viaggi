import java.util.Scanner;
public class Main extends GestioneMetodi
{
    public static void main (String [] args)
    {
        Scanner in = new Scanner(System.in);
        int scelta=0;
        Main [] viaggio= new Main[10];
        do
        {
            System.out.println("SCEGLI UNA DELLE SEGUENTI OPZIONI");
            System.out.println("1- Aggiunta pacchetto");
            System.out.println("2- Visualizza informazioni del pacchetto");
            System.out.println("3- Calcolo costo medio");
            System.out.println("4- Visualizza dati pacchetto, costominimo e costo massimo");
            scelta= in.nextInt();
            switch (scelta)
            {
                case 1:

                case 2:

                case 3:

                case 4:
            }
        } while (scelta!=5);
    }
}
