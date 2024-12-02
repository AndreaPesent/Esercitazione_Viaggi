public class Volo extends Viaggi
{
    private double CostoBase;
    private boolean AndataRitorno;
    public Volo(double costo, boolean AR)
    {
        AndataRitorno=AR;
        CostoBase=costo;
        if(AndataRitorno==false)
        {
            CostoBase=costo+(costo*0.50);
        }
        else
        {
            CostoBase=costo+(costo*0.85);
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
        return ("Costo base: " + CostoBase + "Andata e ritorno: " + AndataRitorno);
    }
}
