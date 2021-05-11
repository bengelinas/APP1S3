package menufact.plats;

import menufact.exceptions.PlatException;
import menufact.plats.PlatAuMenu;

public class PlatChoisi {
    private PlatAuMenu plat;
    private int quantite;

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

    public int getQuantite()
    {
        return quantite;
    }

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

    public PlatAuMenu getPlat()
    {
        return plat;
    }
}
