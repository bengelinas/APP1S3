package ingredients;

import ingredients.exceptions.IngredientException;

public class IngredientInventaire {
    private Ingredient ingredient;
    private int quantite;
    private int plat;
    public IngredientInventaire(Ingredient ingredient, int quantite) throws IngredientException {
        this.ingredient = ingredient;
        if (quantite < 0)
            throw new IngredientException("Il n'est pas possible d'avoir une quantité negative");
        else
            this.quantite = quantite;
            this.plat=0;
    }
    public void changerPlat(int etat){this.plat=etat;}
    public int getPlat(){return this.plat;}
    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient i) {
        this.ingredient = i;
    }

    public int getQuantite() {
        return quantite;
    }

    public void retirerQuantite(int pi_QuantiteAEnlever) {
        if ((quantite - pi_QuantiteAEnlever) < 0) {
            System.out.println("ingredients.exceptions.IngredientException: IngredientException: Il n'est pas possible d'en enlever autant");
        } else {
            quantite -= pi_QuantiteAEnlever;
        }
    }



    public void setQuantite(int quantite) throws IngredientException{

        if (quantite < 0)
            throw new IngredientException("Il n'est pas possible d'avoir une quantité negative");
        else
            this.quantite = quantite;
    }
    @Override
    public String toString()
    {
        return "ingredient: "+ingredient.getNom().toString()+" quantite: "+ quantite;
    }
}
