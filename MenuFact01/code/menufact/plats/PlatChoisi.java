package menufact.plats;

import menufact.exceptions.PlatException;
import menufact.plats.PlatAuMenu;

public class PlatChoisi {
    private PlatAuMenu plat;
    private int quantite;

    public PlatChoisi(PlatAuMenu plat, int quantite) throws PlatException
    {
        this.plat = plat;
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
