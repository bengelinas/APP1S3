package menufact.facture;

import menufact.Client;
import menufact.facture.exceptions.FactureException;
import menufact.plats.PlatChoisi;

import java.util.ArrayList;
import java.util.Date;

public class Payer implements FactureEtat{

    private Facture facture;
    private Date date;
    private String description;
    private Client client;
    private ArrayList<PlatChoisi> platchoisi;

    public Payer(){};
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
    public String genereFacture() throws FactureException {
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
            factureGenere +=  i + "     " + plat.getPlat().getDescription() +  "  " + plat.getPlat().getPrix() +  "      " + plat.getQuantite() + "\n";
            i++;
        }

        factureGenere += "          TPS:               " + facture.tps() + "\n";
        factureGenere += "          TVQ:               " + facture.tvq() + "\n";
        factureGenere += "          Le total est de:   " + facture.total() + "\n";

        return factureGenere;
    }
}
