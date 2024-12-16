public class Viaggi
{
    private String destinazione;
    private double costo;
    private int giorni;
    public void setDestinazione(String destinazione)
    {
        this.destinazione=destinazione;
    }
    public void setCosto(double costo)
    {
        this.costo=costo;

    }
    public void setGiorni(int giorni)
    {
        this.giorni=giorni;
    }
    public String getDestinazione()
    {
        return destinazione;
    }
    public double getCosto()
    {
        return costo;
    }
    public int getGiorni()
    {
        return giorni;
    }
    public String toString()
    {
        return ("Destinazione: " + destinazione + "Costo: " + costo + "Durata viaggio: " + giorni + " giorni");
    }
}