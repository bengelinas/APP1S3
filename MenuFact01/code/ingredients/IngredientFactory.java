package ingredients;

public class IngredientFactory {
    public IngredientFactory(){}
    public Ingredient createingredient (TypeIngredient typeIngredient) {
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
