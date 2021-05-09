package menufact.facture;


import ingredients.exceptions.IngredientException;
import menufact.plats.*;
import inventaire.Inventaire;

public class Chef implements Subscriber{
    private static Chef instance;
    private Inventaire inventaire;
    private Chef()
    {
        inventaire = Inventaire.getInstance();
    }

    @Override public void update(PlatChoisi l_plat)
    {
        for(int i=0;i< l_plat.getQuantite();i++){
            verifier(l_plat.getPlat());
        }
    }
    public static Chef getInstance()
    {
        if (instance == null) {
            instance = new Chef();
        }
        return instance;
    }
    private void Preparation(int[][] liste, PlatAuMenu PlatEnPreparation) {
        PlatEnPreparation.terminer();
        for (int i = 0; i < liste.length; i++) {
            inventaire.retirer(liste[i][0], liste[i][1]);
        }
        PlatEnPreparation.servir();
    }

    private boolean verifier(PlatAuMenu plat)
    {
        int[][] liste = new int[0][2];
        for (int i = 0; i < plat.getRecette().size(); i++) {
            if(plat.getClass()== PlatEnfant.class){
                try
                {
                    plat.getRecette().get(i).setQuantite((int) (plat.getRecette().get(i).getQuantite() * (plat.getProportion())));
                }
                catch (IngredientException exception) {};
            }
            int temp = inventaire.verifier(plat.getRecette().get(i));
            if (temp == -1) {
                plat.impossible();
                return false;
            } else {
                liste[i][0] = temp;
                liste[i][1] = plat.getRecette().get(i).getQuantite();
            }
        }
        plat.Preparer();
        Preparation(liste, plat);
        return true;
    }
}
