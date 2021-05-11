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
    private Date date;
    private String description;
    private Client client;
    private ArrayList<PlatChoisi> platchoisi;

    public Fermer(){};
    @Override
    public void payer() throws FactureException {
        for(int i=0;i<platchoisi.size();i++){
            if(platchoisi.get(i).getPlat().getEtat().getClass() != Impossible.class &&
                    platchoisi.get(i).getPlat().getEtat().getClass() != Servi.class)
            {
                throw new FactureException("On ne peux payer qu'une fois les plats servi");
            }
        }
        facture.setEtat(new Payer());
    }
    @Override
    public void ajoutePlat(PlatChoisi p) throws FactureException {
        throw new FactureException("On peut ajouter un plat seulement sur une facture OUVERTE.");
    }
    @Override
    public void ouvrir() throws FactureException {
        facture.setEtat(new Ouverte());
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
    }
}
