package menufact.facture;

import menufact.Client;
import menufact.facture.exceptions.FactureException;
import menufact.plats.PlatChoisi;

import java.util.ArrayList;
import java.util.Date;

public class Ouverte implements FactureEtat{

    private Facture facture;



    public Ouverte(Facture l_facture){
        facture=l_facture;

    };
    @Override
    public void payer() throws FactureException {
        throw new FactureException("La facture doit etre Fermer avant de payer");
    }
    @Override
    public void ajoutePlat(PlatChoisi p) throws FactureException {
        p.getPlat().commander();
        facture.addPlat(p);
        facture.notifySubscriber(p);
    }
    @Override
    public void ouvrir() throws FactureException {
        throw new FactureException("La facture est deja ouverte");
    }
    @Override
    public void fermer() throws FactureException {
        facture.setEtat(new Fermer(facture));
    }
    @Override
    public String genereFacture( String factureGenere){

        return factureGenere;
    }
}
