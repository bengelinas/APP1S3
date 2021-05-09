package menufact.plats;

import ingredients.Ingredient;
import ingredients.IngredientInventaire;

import java.util.ArrayList;

public class PlatAuMenu {
    private int code;
    private String description;
    private double prix;
    private ArrayList<IngredientInventaire> recette = new ArrayList<IngredientInventaire>();
    private PlatEtat etat;

    public double getProportion(){return 1;};
    public PlatAuMenu(int code, String description, double prix) {
        this.code = code;
        this.description = description;
        this.prix = prix;
        this.etat=null;
    }

    public PlatAuMenu() {
    }

    @Override
    public String toString() {
        return "menufact.plats.PlatAuMenu{" +
                "code=" + code +
                ", description='" + description + '\'' +
                ", prix=" + prix +
                "}\n";
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
    public  ArrayList<IngredientInventaire> getRecette() {
        return recette;
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
