public class Escursioni extends Viaggi
{
    private double CostoBase;
    private boolean AndataRitorno;
    private int Numero;
    public Escursioni(boolean AR, int N, String destinazione, int giorni, double costo)
    {
        super(destinazione, giorni, costo);
        AndataRitorno=AR;
        CostoBase=costo;
        Numero=N;
        for (int i=0;i<Numero;i++)
        {
            if (Numero>0)
            {
                CostoBase=CostoBase+(N*0.15);
            }
        }
    }
    public void setAR(boolean ar)
    {
        AndataRitorno=ar;
    }
    public boolean getAndataRitorno()
    {
        return AndataRitorno;
    }
    public void setCosto(double costo)
    {
        CostoBase=costo;
    }
    public double getCosto()
    {
        return CostoBase;
    }
    public String toString()
    {
        return ("Costo base: " + CostoBase + "Andata e ritorno: " + AndataRitorno + "Numero escursioni: " + Numero);
    }
}
