import java.util.Scanner;
public class Agenzia
{
    public static void main (String [] args)
    {
        Scanner in = new Scanner(System.in);
        int scelta=0;
        int indice=0;
        Viaggi [] pacchettoViaggi= new Viaggi[100];
        String destinazione="";
        double costo=0;
        int giorni=0;
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
                    System.out.println("Inserisci la destinazione");
                    destinazione=in.next();
                    System.out.println("Inserisci i giorni");
                    giorni=in.nextInt();
                    System.out.println("Inserisci il prezzo");
                    costo=in.nextDouble();
                    Viaggi viaggio= new Viaggi (destinazione, giorni, costo);
                    Aggiunta(pacchettoViaggi, viaggio, indice);
                    break;

                case 2:
                    System.out.println(Visualizza(pacchettoViaggi, indice));
                    break;

                case 3:

                case 4:
            }
        } while (scelta!=5);
    }
    public static void Aggiunta (Viaggi[]pacchettoViaggi, Viaggi viaggio, int indice)
    {
        pacchettoViaggi[indice]=viaggio;
        indice++;
    }
    public static String Visualizza (Viaggi[] pacchettoViaggi, int indice)
    {
        String informazioni="";
        for (int i=0;i<indice;i++)
        {
            informazioni=pacchettoViaggi[i].getDestinazione() + pacchettoViaggi[i].getGiorni() + pacchettoViaggi[i].getCosto();
        }
        return informazioni;
    }
}
