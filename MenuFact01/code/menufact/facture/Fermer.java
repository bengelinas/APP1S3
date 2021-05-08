package menufact.facture;

public class Fermer implements FactureEtat{
    public Fermer(){};
    @Override
    public void updateFacture() { System.out.println("La facture est en mode Fermer"); }
    @Override
    public String getEtat() { return "Fermer"; }
}
