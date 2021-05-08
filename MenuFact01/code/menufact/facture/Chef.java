package menufact.facture;

import inventaire.Inventaire;
import menufact.plats.PlatAuMenu;

public class Chef implements Subscriber{
    private static Chef instance;

    private Chef()
    {
    }
    public void update(){

    }
    public static Chef getInstance()
    {
        if (instance == null) {
            instance = new Chef();
        }
        return instance;
    }
    private void Preparation(int[][] liste, PlatAuMenu PlatEnPreparation)
    {
        for (int i=0;i<liste.length;i++)
        {
            inventaire.retirer(liste[i][0],liste[i][1]);
        }
        //TODO PlatEnPreparation doit etre mis en etat servi
    }
}
