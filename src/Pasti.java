public class Pasti extends Viaggi
{
    private double CostoBase;
    private boolean AndataRitorno;
    private boolean MezzaPensione;
    public Pasti(double costo, boolean AR, boolean MP)
    {
        MezzaPensione=MP;
        CostoBase=costo;
        if (MezzaPensione)
        {
            CostoBase=CostoBase+(costo*0.25);
        }
        else
        {
            CostoBase=CostoBase+(costo*0.35);
        }
        AndataRitorno=AR;
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
        return ("Costo base: " + CostoBase + "Andata e ritorno: " + AndataRitorno + "Mezza pensione: " + MezzaPensione);
    }
}
