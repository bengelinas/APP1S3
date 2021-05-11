package menufact.plats;

import menufact.exceptions.PlatException;
import menufact.plats.PlatAuMenu;

public class PlatChoisi {
    private PlatAuMenu plat;
    private int quantite;

    /**
     * Instanciation d'un plat choisi
     * @param platrecu Un plat au menu
     * @param quantite La quantité de plat au menu choisi
     * @throws PlatException Ne peut pas avoir de quantité négative
     */
    public PlatChoisi(PlatAuMenu platrecu, int quantite) throws PlatException
    {
        if(platrecu.getClass()==PlatEnfant.class){
            plat = new PlatEnfant(platrecu.getCode(), platrecu.getDescription(), platrecu.getPrix(), platrecu.getProportion());
        }
        else{
        plat = new PlatAuMenu(platrecu.getCode(), platrecu.getDescription(), platrecu.getPrix());
    }
        for(int i=0; i<platrecu.getRecette().size();i++)
        {
            plat.ajouterIngredient(platrecu.getRecette().get(i));
        }
        if(quantite<0){throw new PlatException("La quantite ne doit pas etre negative");};
        this.quantite = quantite;
    }

    @Override
    public String toString() {
        return "menufact.plats.PlatChoisi{" +
                "quantite=" + quantite +
                ", plat=" + plat +
                '}';
    }

    /**
     * Retourne la quantité
     * @return quantité
     */
    public int getQuantite()
    {
        return quantite;
    }

    /**
     * Envoi une quantité demandé
     * @param quantite Quantité demandé
     * @throws PlatException La quantité ne peut pas être négative
     */
    public void setQuantite(int quantite) throws PlatException
    {
        if (quantite<0)
        {
            throw new PlatException("La quantite commande ne doit pas etre zero");
        }
        else
        {
            this.quantite = quantite;
        }

    }

    /**
     * Retourne le plat au menu
     * @return Plat au menu
     */
    public PlatAuMenu getPlat()
    {
        return plat;
    }
}
