package menufact.plats;

import ingredients.Ingredient;
import ingredients.IngredientInventaire;
import menufact.exceptions.PlatException;
import java.util.ArrayList;

public class PlatAuMenu {
    private int code;
    private String description;
    private double prix;
    private ArrayList<IngredientInventaire> recette;
    private PlatEtat etat;

    /**
     * Retourne une proportion
     * @return Une proportion
     */
    public double getProportion()
    {
        return 1;
    }

    /**
     * Instanciation de PlatAuMenu
     * @param code Le code du plat
     * @param description La description du plat
     * @param prix Le prix du plat
     * @throws PlatException Si le code est négatif ou le prix est négatif
     */
    public PlatAuMenu(int code, String description, double prix) throws PlatException
    {
        if(code<0){throw new PlatException("code ne peut pas etre negatif");}
        else if(prix<0){throw new PlatException("prix ne peut pas etre negatif");}
        this.code = code;
        this.description = description;
        this.prix = prix;
        this.etat=null;
        recette = new ArrayList<IngredientInventaire>();
    }

    /**
     * Constructeur de PlatAuMenu
     */
    public PlatAuMenu(){}

    @Override
    public String toString() {
        return "menufact.plats.PlatAuMenu{" +
                "code=" + code +
                ", description='" + description + '\'' +
                ", prix=" + prix +
                "}\n";
    }

    /**
     *
     * @return Retourne le code du PlatAuMenu
     */
    public int getCode()
    {
        return code;
    }

    /**
     * Envoi un code pour le PlatAuMenu
     * @param code Le code
     * @throws PlatException Le code ne peut être négatif
     */
    public void setCode(int code) throws PlatException
    {
        if (code<0)
        {
            throw new PlatException("Le code du plat ne peut pas etre negatif");
        }
        else
        {
            this.code = code;
        }
    }

    /**
     * Retourne la description
     * @return Retourne la description
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * Envoi une nouvelle description d'un plat au menu
     * @param description La description d'un plat au menu
     */
    public void setDescription(String description)
    {
        this.description = description;
    }

    /**
     * Retourne le prix d'un plat au menu
     * @return Le prix d'un plat au menu
     */
    public double getPrix()
    {
        return prix;
    }

    /**
     * Envoi un nouveau prix pour un plat au menu
     * @param prix Le nouveau prix
     * @throws PlatException Prix ne peut pas être négatif
     */
    public void setPrix(double prix) throws PlatException {

        if (prix <= 0) {
            throw new PlatException("Le prix du plat ne peut pas etre negatif ou gratuit(on est cheap)");
        } else {
            this.prix = prix;
        }
    }

    /**
     * Retourne l'état du plat au menu.
     * @return L'état du plat au menu
     */
    public PlatEtat getEtat(){return etat;}

    /**
     * Retourne la recette du plat au menu
     * @return La recette du plat au menu
     */
    public  ArrayList<IngredientInventaire> getRecette()
    {
        return recette;
    }

    /**
     * Ajoute un ingredient a un plat au menu et empêche le même ingrédient d'être assigné à Ingrédient Inventaire dans le futur
     * @param ingredient La sorte d'ingrédient
     * @throws PlatException
     */
    public void ajouterIngredient(IngredientInventaire ingredient) throws PlatException {
        if (ingredient.getPlat()==-1) {
            throw new PlatException("On ne peut assigne un ingredient de l'inventaire");
        }

        ingredient.changerPlat(1);
        recette.add(ingredient);
    }

    /**
     * État Commander
     */
    public void commander()
    {
        etat = new Commande();
    }

    /**
     * État Préparer
     */
    public void Preparer()
    {
        etat = new EnPreparation();
    }

    /**
     * État Terminer
     */
    public void terminer()
    {
        etat = new Termine();
    }

    /**
     * État Servi
     */
    public void servir()
    {
        etat = new Servi();
    }

    /**
     * État Impossible
     */
    public void impossible()
    {
        etat = new Impossible();
    }
}
