package ingredients;

import ingredients.exceptions.IngredientException;

public class Ingredient {
    private String nom;
    private String description;
    private TypeIngredient typeIngredient;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TypeIngredient getTypeIngredient() {
        return typeIngredient;
    }

    public void setTypeIngredient(TypeIngredient typeIngredient) {
        this.typeIngredient = typeIngredient;
    }

    public Ingredient Ingredient (TypeIngredient typeIngredient) {
        switch (typeIngredient) {
            case EPICE:
                return new Epice();
            case FRUIT:
                return new Fruit();
            case LAITIER:
                return new Laitier();
            case LEGUME:
                return new Legume();
            case VIANDE:
                return new Viande();
            default:
                return new Ingredient();
        }
    }
}
