package menufact.facture;

import ingredients.exceptions.IngredientException;
import menufact.plats.PlatChoisi;

interface Subscriber {
    public void update(PlatChoisi l_plat) throws IngredientException;
}
