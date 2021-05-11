package menufact.facture;

import menufact.Client;
import menufact.facture.exceptions.FactureException;
import menufact.plats.Impossible;
import menufact.plats.PlatChoisi;
import menufact.plats.PlatEtat;
import menufact.plats.Servi;

import java.util.ArrayList;
import java.util.Date;

public class Fermer implements FactureEtat{

    private Facture facture;


    public Fermer(Facture l_facture){
        facture=l_facture;

    };
    @Override
    public void payer() throws FactureException {
        facture.setEtat(new Payer(facture));
    }
    @Override
    public void ajoutePlat(PlatChoisi p) throws FactureException {
        throw new FactureException("On peut ajouter un plat seulement sur une facture OUVERTE.");
    }
    @Override
    public void ouvrir() throws FactureException {
        facture.setEtat(new Ouverte(facture));
    }


    @Override
    public void fermer() throws FactureException {
        throw new FactureException("La facture est déja dans l'état fermer.");
    }
    /*public String genereFacture() throws FactureException {

        String lesPlats = new String();
        String factureGenere = new String();

        int i =1;


        factureGenere =   "Facture generee.\n" +
                "Date:" + date + "\n" +
                "Description: " + description + "\n" +
                "Client:" + client.getNom() + "\n" +
                "Les plats commandes:" + "\n" + lesPlats;

        factureGenere += "Seq   Plat         Prix   Quantite\n";
        for (PlatChoisi plat : platchoisi)
        {
            if(platchoisi.get(i).getPlat().getEtat().getClass() == Servi.class)
            {
                factureGenere +=  i + "     " + plat.getPlat().getDescription() +  "  " + plat.getPlat().getPrix() +  "      " + plat.getQuantite() + "\n";
                i++;
            }

        }

        factureGenere += "          TPS:               " + facture.tps() + "\n";
        factureGenere += "          TVQ:               " + facture.tvq() + "\n";
        factureGenere += "          Le total est de:   " + facture.total() + "\n";

        return factureGenere;
    }*/
}
