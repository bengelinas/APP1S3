package menufact.facture;

public class Ouverte implements FactureEtat{
    public Ouverte(){};
    @Override
    public void updateFacture(){ System.out.println("La facture est en mode Ouverte"); }
    @Override
    public String getEtat() { return "Ouverte"; }
}
