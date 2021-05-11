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

    /**
     * Recevoir la notification de Facture lorsqu'un PlatChoisi est instancié et séparer le PlatChoisi en PlatMenu. Elle débute la vérification.
     * @param l_plat Le PlatChoisi ajouté à la facture.
     */
    @Override public void update(PlatChoisi l_plat)  {
        for(int i=0;i< l_plat.getQuantite();i++){
            verifier(l_plat.getPlat());
        }
    }

    /**
     * Implémentation du Singleton
     * @return L'instance de Chef
     */
    public static Chef getInstance()
    {
        if (instance == null) {
            instance = new Chef();
        }
        return instance;
    }

    /**
     * Retire les ingrédients nécessaire dans l'inventaire et changer l'état des plats dans la liste.
     * @param liste Une liste d'index dans l'inventaire et de quantité, pour s'assurer que Chef est vérifier la présence des ingrédients avant.
     * @param PlatEnPreparation Le plat qui est vérifier et préparer.
     */
    private void Preparation(int[][] liste, PlatAuMenu PlatEnPreparation)  {
        PlatEnPreparation.terminer();
        for (int i = 0; i < liste.length; i++) {
            inventaire.retirer(liste[i][0], liste[i][1]);
        }
        PlatEnPreparation.servir();
    }

    /**
     * Vérifier la possibilité de préparer un plat et à générer la liste d'index d'ingredients nécessaire à la préparation du plat.
     * @param plat Le Plat à vérifier.
     * @return La possibilité si oui ou non, il possible de créer le plat.
     */
    private boolean verifier(PlatAuMenu plat)  {
        int[][] liste = new int[100][2];
        for (int i = 0; i < plat.getRecette().size(); i++) {
            if(plat.getClass()== PlatEnfant.class){
                int temp = inventaire.verifier(plat.getRecette().get(i).getIngredient(),(int)(plat.getRecette().get(i).getQuantite() * (plat.getProportion())));
                if (temp == -1) {
                    plat.impossible();
                    return false;
                } else {
                    liste[i][0] = temp;
                    liste[i][1] = (int)(plat.getRecette().get(i).getQuantite() * (plat.getProportion()));;
                }
            }
            else {
                int temp = inventaire.verifier(plat.getRecette().get(i));
                if (temp == -1) {
                    plat.impossible();
                    return false;
                } else {
                    liste[i][0] = temp;
                    liste[i][1] = plat.getRecette().get(i).getQuantite();
                }
            }
        }
        plat.Preparer();
        Preparation(liste, plat);
        return true;
    }
}
