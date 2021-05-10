package menufact.facture;

import menufact.facture.exceptions.FactureException;
import menufact.plats.PlatChoisi;

import java.util.ArrayList;

public class Ouverte implements FactureEtat{

    private Facture facture;
    private ArrayList<PlatChoisi> platchoisi;
    private ArrayList<Subscriber> subscriber;

    public Ouverte(){};
    @Override
    public void payer() throws FactureException {
        throw new FactureException("La facture doit etre Fermer avant de payer");
    }
    @Override
    public void ajoutePlat(PlatChoisi p) throws FactureException {
        p.getPlat().commander();
        platchoisi.add(p);
        facture.notifySubscriber(p);
    }
    @Override
    public void ouvrir() throws FactureException {
        facture.setEtat(new Ouverte());
    }
    @Override
    public String genereFacture() throws FactureException {
        throw new FactureException("Criss de beigne ta facture est pas fermee");
    }
}
