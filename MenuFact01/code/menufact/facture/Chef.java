package menufact.facture;

import menufact.plats.PlatAuMenu;
import menufact.plats.PlatChoisi;
import inventaire.Inventaire;

public class Chef implements Subscriber{
    private static Chef instance;
    private Inventaire inventaire;
    private Chef()
    {
        inventaire = Inventaire.getInstance();
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

    private boolean verifier(PlatAuMenu plat)
    {
        int[][] liste = new int[0][2];
        for(int i=0; i < plat.getRecette().size(); i++ )
        {
            int temp=inventaire.verifier(plat.getRecette().get(i));
            if(temp == -1){
                //TODO changer état plat pour impossible
                return false;
            }
            else {
                liste[i][0] = temp;
                liste[i][1] = plat.getRecette().get(i).getQuantite();
            }
        }
        //TODO changer état plat pour en préparation
        Preparation(liste);
        return true;
    }
}
