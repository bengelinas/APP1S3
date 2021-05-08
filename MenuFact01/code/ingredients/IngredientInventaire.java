package ingredients;

import ingredients.exceptions.IngredientException;

public class IngredientInventaire {
    private Ingredient ingredient;
    private int quantite;

    public IngredientInventaire(IngredientInventaire ingredientInventaire, int quantite) {
        this.ingredient = ingredient;
        this.quantite = quantite;
    }
    public Ingredient getIngredient()
    {
        return ingredient;
    }
    public void setIngredient(Ingredient i)
    {
        this.ingredient = i;
    }
    public int getQuantite() {
        return quantite;
    }
    public void retirerQuantite(int pi_QuantiteAEnlever){quantite-=pi_QuantiteAEnlever;};

    public void setQuantite(int quantite) throws IngredientException{

        if (quantite < 0)
            throw new IngredientException("Il n'est pas possible d'avoir une quantité negative");
        else
            this.quantite = quantite;
    }
}
