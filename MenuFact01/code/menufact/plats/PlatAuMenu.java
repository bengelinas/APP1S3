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

    public double getProportion()
    {
        return 1;
    }
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

    public PlatAuMenu(){}

    @Override
    public String toString() {
        return "menufact.plats.PlatAuMenu{" +
                "code=" + code +
                ", description='" + description + '\'' +
                ", prix=" + prix +
                "}\n";
    }

    public int getCode()
    {
        return code;
    }

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

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public double getPrix()
    {
        return prix;
    }

    public void setPrix(double prix) throws PlatException {

        if (prix <= 0) {
            throw new PlatException("Le prix du plat ne peut pas etre negatif ou gratuit(on est cheap)");
        } else {
            this.prix = prix;
        }
    }
    public PlatEtat getEtat(){return etat;}
    public  ArrayList<IngredientInventaire> getRecette()
    {
        return recette;
    }
    public void ajouterIngredient(IngredientInventaire ingredient)
    {
        recette.add(ingredient);
    }
    public void commander()
    {
        etat = new Commande();
    }
    public void Preparer()
    {
        etat = new EnPreparation();
    }
    public void terminer()
    {
        etat = new Termine();
    }
    public void servir()
    {
        etat = new Servi();
    }
    public void impossible()
    {
        etat = new Impossible();
    }
}
