package inventaire;

import ingredients.Ingredient;
import ingredients.IngredientInventaire;

import java.util.ArrayList;

public class Inventaire {
    private ArrayList<IngredientInventaire> lesIngredients = new ArrayList<IngredientInventaire>();

    public void ajouter (IngredientInventaire i)
    {
        lesIngredients.add(i);
    }
    public int verifier (IngredientInventaire ingredientInventaire) {
        for(int i=0; i< lesIngredients.size(); i++)
        {
            if(true) {
                return i;
            }
        }
        return -1;
    }
    public void retirer(int index, int quantite){

    }
}
