package menufact.facture;

public class Payer implements FactureEtat{
    public Payer(){};
    @Override
    public void updateFacture()
    {
        System.out.println("La facture est en mode Payer");
    }
    @Override
    public String getEtat() { return "Payer"; }
}
