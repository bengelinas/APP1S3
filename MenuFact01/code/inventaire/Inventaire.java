package inventaire;

import ingredients.Ingredient;
import ingredients.IngredientInventaire;
import ingredients.exceptions.IngredientException;

import java.util.ArrayList;

public class Inventaire {
    private ArrayList<IngredientInventaire> lesIngredients = new ArrayList<IngredientInventaire>();

    public void ajouter (IngredientInventaire IngredientAAjouter) throws IngredientException {
        for(int i = 0;i<lesIngredients.size();i++)
        {
            if (lesIngredients.get(i).getIngredient().getNom() == IngredientAAjouter.getIngredient().getNom()) {
                try {
                    lesIngredients.get(i).setQuantite(lesIngredients.get(i).getQuantite() + IngredientAAjouter.getQuantite());
                } catch (IngredientException e) {
                    throw e;
                }
                return;
            }
        }
        lesIngredients.add(IngredientAAjouter);
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
    public void retirer(int Index, int QuantiteAEnlever)
    {
        lesIngredients.get(Index).retirerQuantite(QuantiteAEnlever);
    }
}
