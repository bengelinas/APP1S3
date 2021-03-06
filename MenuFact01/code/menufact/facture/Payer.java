package menufact.facture;

import menufact.Client;
import menufact.facture.exceptions.FactureException;
import menufact.plats.PlatChoisi;

import java.util.ArrayList;
import java.util.Date;

public class Payer implements FactureEtat{

    private Facture facture;


    public Payer(Facture l_facture){
        facture=l_facture;
        };
    @Override
    public void payer() throws FactureException {
        throw new FactureException("La facture est deja payee.");
    }
    @Override
    public void ajoutePlat(PlatChoisi p) throws FactureException {
        throw new FactureException("On peut ajouter un plat seulement sur une facture OUVERTE.");
    }
    @Override
    public void ouvrir() throws FactureException {
        throw new FactureException("La facture ne peut pas être reouverte.");
    }

    @Override
    public void fermer() throws FactureException {
        throw new FactureException("La facture est déja payé.");
    }

    @Override
    public String genereFacture( String factureGenere){
        factureGenere += "          Le sous-total est de:   " + facture.sousTotal() + "\n";
        factureGenere += "          TPS:               " + facture.tps() + "\n";
        factureGenere += "          TVQ:               " + facture.tvq() + "\n";
        factureGenere += "          Le total est de:   " + facture.total() + "\n";
        return factureGenere;
    }
}
