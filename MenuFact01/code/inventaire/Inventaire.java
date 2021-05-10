package inventaire;

import ingredients.Ingredient;
import ingredients.IngredientInventaire;
import menufact.facture.Chef;
import ingredients.exceptions.IngredientException;
import java.util.ArrayList;

public class Inventaire {
    private static Inventaire instance;
    private ArrayList<IngredientInventaire> lesIngredients;
    private Inventaire()
    {
        lesIngredients = new ArrayList<IngredientInventaire>();
    }
    public static Inventaire getInstance()
    {
        if (instance == null) {
            instance = new Inventaire();
        }
        return instance;
    }
    public void ajouter (IngredientInventaire IngredientAAjouter) throws IngredientException {
        for(int i = 0;i<lesIngredients.size();i++)
        {
            if (lesIngredients.get(i).getIngredient().getNom() == IngredientAAjouter.getIngredient().getNom()) {
                try {
                    lesIngredients.get(i).setQuantite(lesIngredients.get(i).getQuantite() + IngredientAAjouter.getQuantite());
                } catch (IngredientException e) {
                    throw new IngredientException("Il n'est pas possible d'avoir une quantité negative");
                }
                return;
            }
        }
        lesIngredients.add(IngredientAAjouter);
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
    public void retirer(int Index, int QuantiteAEnlever)  {
        lesIngredients.get(Index).retirerQuantite(QuantiteAEnlever);
    }
}
