package menufact.facture;

import menufact.Client;
import menufact.facture.exceptions.FactureException;
import menufact.plats.PlatChoisi;
import menufact.plats.Servi;

import java.util.ArrayList;
import java.util.Date;

/**
 * Une facture du systeme Menufact
 * @author Domingo Palao Munoz
 * @version 1.0
 */
public class Facture {
    private Date date;
    private String description;
    private FactureEtat etat;
    private ArrayList<PlatChoisi> platchoisi;
    private int courant;
    private Client client;
    private ArrayList<Subscriber> subscriber;

    /**********************Abonnements ************/
    /**
     * Permet d'enregistré le Chef dans la liste comme une personne à être notifié.
     * @param s La personne notifié
     */
    public void subscribe(Subscriber s ){
        subscriber.add(s);
    }

    /**
     * Enleve une personne de la liste à être notifié.
     * @param s La personne notifié
     */
    public void unsubscribe(Subscriber s){
        for(int i=0; i< subscriber.size() -1; i++){
            if(subscriber.get(i) == s){
                subscriber.remove(i);
            }
        }
    }

    /**
     * Notifie les personnes dans la liste, que PlatChoisi a été ajouté à la facture.
     * @param l_plat Le PlatChoisi ajouté à la facture.
     */
    public void notifySubscriber(PlatChoisi l_plat)
    {
        Chef.getInstance().update(l_plat);
    }
    /**********************Constantes ************/
    private final double TPS = 0.05;
    private final double TVQ = 0.095;

    /**
     *
     * @param client le client de la facture
     */
    public void associerClient (Client client)
    {
        this.client = client;
    }

    /**
     * Calcul du sous total de la facture
     * @return le sous total
     */
    public double sousTotal() {
        double soustotal = 0;
        int compteur = 0;
        for (PlatChoisi p : platchoisi){
            if (platchoisi.get(compteur).getPlat().getEtat().getClass() == Servi.class) {
                soustotal += p.getQuantite() * p.getPlat().getPrix();
            }
        compteur++;
        }

        return soustotal;
    }

    /**
     *
     * @return le total de la facture
     */
    public double total()
    {
        return sousTotal()+tps()+tvq();
    }

    /**
     *
     * @return la valeur de la TPS
     */
    protected double tps()
    {
        return TPS*sousTotal();
    }

    /**
     *
     * @return la valeur de la TVQ
     */
    protected double tvq()
    {
        return TVQ*(TPS+1)*sousTotal();
    }

    /**
     * Permet de chager l'état de la facture à PAYEE
     */
    public void payer() throws FactureException
    {

        etat.payer();
    }
    /**
     * Permet de chager l'état de la facture à FERMEE
     */
    public void fermer() throws FactureException
    {

       etat.fermer();
    }

    /**
     * Permet de changer l'état de la facture à OUVERTE
     * @throws FactureException en cas que la facture soit PAYEE
     */
    public void ouvrir() throws FactureException
    {
        /*if (etat.getEtat() == "Payer")
            throw new FactureException("La facture ne peut pas être reouverte.");
        else
            etat = new Ouverte();*/


        etat.ouvrir();
    }

    /**
     *
     * @return l'état de la facture
     */
    public FactureEtat getEtat()
    {
        return etat;
    }

    /**
     * Permet de changer l'état de la Facture.
     * @param newEtat Le nouvel état de la Facture.
     */
    public void setEtat(FactureEtat newEtat) { etat = newEtat; }
    /**
     *
     * @param description la description de la Facture
     */
    public Facture(String description)
    {
        date = new Date();
        etat = new Ouverte(this);
        platchoisi = new ArrayList<PlatChoisi>();
        courant = -1;
        this.description = description;
        subscriber = new ArrayList<Subscriber>();
        subscribe(Chef.getInstance());
    }

    /**
     *
     * @param p un plat choisi
     * @throws FactureException Seulement si la facture est OUVERTE
     */
    public void ajoutePlat(PlatChoisi p) throws FactureException
    {
        /*if (etat.getEtat() == "Ouverte")
        {
            p.getPlat().commander();
            platchoisi.add(p);
            notifySubscriber(p);
        }
        else
        {
            throw new FactureException("On peut ajouter un plat seulement sur une facture OUVERTE.");
        }*/

        etat.ajoutePlat(p);

    }

    /**
     *
     * @return le contenu de la facture en chaîne de caracteres
     */
    @Override
    public String toString()
    {
        return "menufact.facture.Facture{" +
                "date=" + date +
                ", description='" + description + '\'' +
                ", etat=" + etat +
                ", platchoisi=" + platchoisi +
                ", courant=" + courant +
                ", client=" + client +
                ", TPS=" + TPS +
                ", TVQ=" + TVQ +
                '}';
    }

    /**
     *
     * @return une chaîne de caractères avec la facture à imprimer
     */
    public String genererFacture()
    {
        String lesPlats = new String();
        String factureGenere = new String();

        int i =0;


        factureGenere =   "Facture generee.\n" +
                          "Date:" + date + "\n" +
                          "Description: " + description + "\n" +
                          "Client:" + client.getNom() + "\n" +
                          "Les plats commandes:" + "\n" + lesPlats;

        factureGenere += "Seq   Plat         Prix   Quantite\n";
        for (PlatChoisi plat : platchoisi)
            if(platchoisi.get(i).getPlat().getEtat().getClass() == Servi.class)
            {
                factureGenere +=  i + "     " + plat.getPlat().getDescription() +  "  " + plat.getPlat().getPrix() +  "      " + plat.getQuantite() + "\n";
                i++;
            }

        factureGenere = etat.genereFacture(factureGenere);
        return factureGenere;
    }

    /**
     *
     * @return Le Client du moment
     */
    public Client getClient() {
        return client;
    }

    /**
     *
     * @return La Date du moment
     */
    public Date getDate() {
        return date;
    }

    /**
     *
     * @return La description de la facture
     */
    public String getDescription() {
        return description;
    }

    /**
     * Ajoute un plat à la facture
     * @param p Le PlatChoisi
     */
    public void addPlat(PlatChoisi p)
    {
        platchoisi.add(p);
    }
}
