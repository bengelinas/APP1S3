package inventaire;

import ingredients.Ingredient;
import ingredients.IngredientInventaire;
import menufact.facture.Chef;

import java.util.ArrayList;

public class Inventaire {
    private static Inventaire instance;
    private ArrayList<IngredientInventaire> lesIngredients = new ArrayList<IngredientInventaire>();
    private Inventaire()
    {

    }
    public static Inventaire getInstance()
    {
        if (instance == null) {
            instance = new Inventaire();
        }
        return instance;
    }
    public void ajouter (IngredientInventaire i)
    {
        lesIngredients.add(i);
    }
    public int verifier (IngredientInventaire ingredientInventaire) {
        for(int i=0; i< lesIngredients.size(); i++)
        {
            if(ingredientInventaire.getIngredient().getNom()==lesIngredients.get(i).getIngredient().getNom() && ingredientInventaire.getIngredient().getTypeIngredient()==lesIngredients.get(i).getIngredient().getTypeIngredient() && lesIngredients.get(i).getQuantite() >= ingredientInventaire.getQuantite()) {
                return i;
            }
        }
        return -1;
    }
    public void retirer(int index, int quantite){

    }
}
