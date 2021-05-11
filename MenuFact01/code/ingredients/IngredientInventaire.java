package ingredients;

import ingredients.exceptions.IngredientException;

public class IngredientInventaire {
    private Ingredient ingredient;
    private int quantite;
    private int plat;

    /**
     * Instanciation de IngredientInventaire
     * @param ingredient La sorte d'ingrédient
     * @param quantite La quantité de l'ingrédient
     * @throws IngredientException Ne peut pas être négative
     */
    public IngredientInventaire(Ingredient ingredient, int quantite) throws IngredientException {
        this.ingredient = ingredient;
        if (quantite < 0)
            throw new IngredientException("Il n'est pas possible d'avoir une quantité negative");
        else
            this.quantite = quantite;
            this.plat=0;
    }

    /**
     * Si état est égale à 1, il est assigné à un plat, si égale à -1, il est assigné à un inventaire et si égale à 0, il est assigné à rien.
     * @param etat
     */
    public void changerPlat(int etat){this.plat=etat;};

    /**
     * Retourne l'état d'un plat
     * @return l'état si assigné ou non
     */
    public int getPlat(){return this.plat;}

    /**
     * Retourne une sorte d'ingrédient
     * @return Sorte d'ingrédient
     */
    public Ingredient getIngredient() {
        return ingredient;
    }

    /**
     * Envoi une sorte d'ingrédient
     * @param i
     */
    public void setIngredient(Ingredient i) {
        this.ingredient = i;
    }

    /**
     * Retourne une quantité
     * @return quantité
     */
    public int getQuantite() {
        return quantite;
    }

    /**
     * Retirer une quantité à celle présente
     * @param pi_QuantiteAEnlever
     */
    public void retirerQuantite(int pi_QuantiteAEnlever) {
        if ((quantite - pi_QuantiteAEnlever) < 0) {
            System.out.println("ingredients.exceptions.IngredientException: IngredientException: Il n'est pas possible d'en enlever autant");
        } else {
            quantite -= pi_QuantiteAEnlever;
        }
    }

    /**
     * Envoi une quantité pour changement
     * @param quantite
     * @throws IngredientException
     */
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
