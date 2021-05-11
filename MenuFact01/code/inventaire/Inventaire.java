package inventaire;

import ingredients.Ingredient;
import ingredients.IngredientFactory;
import ingredients.IngredientInventaire;
import menufact.facture.Chef;
import ingredients.exceptions.IngredientException;
import menufact.plats.PlatAuMenu;

import java.util.ArrayList;

public class Inventaire {
    private static Inventaire instance;
    private ArrayList<IngredientInventaire> lesIngredients;
    private Inventaire()
    {
        lesIngredients = new ArrayList<IngredientInventaire>();
    }

    /**
     * Implémentation du Singleton
     * @return L'instance de l'inventaire
     */
    public static Inventaire getInstance()
    {
        if (instance == null) {
            instance = new Inventaire();
        }
        return instance;
    }

    /**
     * Ajouter un nouveau sorte d'ingrédient
     * @param IngredientAAjouter Un ingrédient inventaire qui permet de garder le nombre d'un ingrédient dans l'inventaire
     * @throws IngredientException
     */
    public void ajouter (IngredientInventaire IngredientAAjouter) throws IngredientException {
        if(IngredientAAjouter.getPlat()==1){
            throw new IngredientException("Impossible d'utiliser un ingredient deja assigne");
        }
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
        IngredientAAjouter.changerPlat(-1);
        lesIngredients.add(IngredientAAjouter);
    }

    /**
     * Permet de vérifier qu'il y a au moins la quantité demandé d'un ingrédient dans l'inventaire
     * @param ingredientInventaire Type d'ingrédient et la quantité à demander
     * @return La position dans l'inventaire de l'ingrédient en question ou -1 si il n'y a pas d'ingrédient n'en contient pas assez
     */
    public int verifier (IngredientInventaire ingredientInventaire) {
        for(int i=0; i< lesIngredients.size(); i++)
        {
            if(ingredientInventaire.getIngredient().getNom()==lesIngredients.get(i).getIngredient().getNom() && ingredientInventaire.getIngredient().getTypeIngredient()==lesIngredients.get(i).getIngredient().getTypeIngredient() && lesIngredients.get(i).getQuantite() >= ingredientInventaire.getQuantite()) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Une autre façon de faire une demande à inventaire
     * @param ingredient Type d'ingrédient
     * @param Quantite la quantité à demander
     * @return La position dans l'inventaire de l'ingrédient en question ou -1 si il n'y a pas d'ingrédient n'en contient pas assez
     */
    public int verifier (Ingredient ingredient, int Quantite) {
        for(int i=0; i< lesIngredients.size(); i++)
        {
            if(ingredient.getNom()==lesIngredients.get(i).getIngredient().getNom() && ingredient.getTypeIngredient()==lesIngredients.get(i).getIngredient().getTypeIngredient() && lesIngredients.get(i).getQuantite() >= Quantite) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Retirer la quantité demander d'une certaine sorte d'ingrédient
     * @param Index La position dans l'inventaire, on demande l'index pour s'assurer que le programme est fait une vérification avant de retirer
     * @param QuantiteAEnlever La quantité à enlever
     */
    public void retirer(int Index, int QuantiteAEnlever)  {
        lesIngredients.get(Index).retirerQuantite(QuantiteAEnlever);
    }
    @Override
    public String toString()
    {
        String message="";
        for(int i =0; i< lesIngredients.size();i++)
        {
            message+=lesIngredients.get(i)+", ";
        }
        return message;
    }
}
