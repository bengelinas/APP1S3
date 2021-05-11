package menufact.facture;

import menufact.facture.exceptions.FactureException;
import menufact.plats.PlatChoisi;

public interface FactureEtat {
    public void fermer() throws FactureException;
    public void payer() throws FactureException;
    public void ouvrir() throws FactureException;
    public void ajoutePlat(PlatChoisi p) throws FactureException;
    /*public String genereFacture() throws FactureException;*/

}
