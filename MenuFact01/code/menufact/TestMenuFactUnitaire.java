package menufact;

import ingredients.Ingredient;
import ingredients.IngredientFactory;
import ingredients.IngredientInventaire;
import ingredients.TypeIngredient;
import inventaire.Inventaire;
import menufact.exceptions.PlatException;
import menufact.plats.PlatAuMenu;

public class TestMenuFactUnitaire {
    public static void main(String[] args) {
        /*----------------- test plat-----------------*/
        PlatAuMenu p1 = null;
        PlatAuMenu p2 = null;
        PlatAuMenu p3 = null;
        /*---------test creation--------*/
        System.out.println("test creation");
        try {
            p1 = new PlatAuMenu(0, "PlatAuMenu0", 10);
        } catch (PlatException e) {
            System.out.println(e);
        }
        try {
            p2 = new PlatAuMenu(-1, "PlatAuMenu1", 20);
        } catch (PlatException e) {
            System.out.println(e);
        }
        try {
            p3 = new PlatAuMenu(2, "PlatAuMenu2", -30);
        } catch (PlatException e) {
            System.out.println(e);
        }
        /*----------------test print----------------*/
        System.out.println("test print");
        try {
            System.out.println(p1.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println(p2.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println(p3.toString());
        } catch (Exception e) {
            System.out.println(e);
        }

        /*------------test de set--------------*/
        System.out.println("test setcode");
        try {
            p1.setCode(1);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            p2.setCode(2);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            p1.setCode(-1);
        } catch (Exception e) {
            System.out.println(e);
        }
        /*-----------test de get--------------*/
        System.out.println("test getcode");
        try {
            System.out.println(p1.getCode());
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println(p2.getCode());
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println(p3.getCode());
        } catch (Exception e) {
            System.out.println(e);
        }
        /*------------test de set--------------*/
        System.out.println("test setdescription");
        try {
            p1.setDescription("test");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            p2.setDescription("test");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            p1.setDescription("test");
        } catch (Exception e) {
            System.out.println(e);
        }
        /*-----------test de get--------------*/
        System.out.println("test getdescription");
        try {
            System.out.println(p1.getDescription());
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println(p2.getDescription());
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println(p3.getDescription());
        } catch (Exception e) {
            System.out.println(e);
        }
        /*------------test de set--------------*/
        System.out.println("test setprix");
        try {
            p1.setPrix(1);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            p2.setPrix(2);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            p1.setPrix(-1);
        } catch (Exception e) {
            System.out.println(e);
        }
        /*-----------test de get--------------*/
        System.out.println("test getprix");
        try {
            System.out.println(p1.getPrix());
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println(p2.getPrix());
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println(p3.getPrix());
        } catch (Exception e) {
            System.out.println(e);
        }
        /*-----------test d'etat--------------*/
        System.out.println("test etat");
        try {
            p1.commander();
            System.out.println(p1.getEtat());
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            p1.Preparer();
            System.out.println(p1.getEtat());
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            p1.servir();
            System.out.println(p1.getEtat());
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            p1.terminer();
            System.out.println(p1.getEtat());
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            p1.impossible();
            System.out.println(p1.getEtat());
        } catch (Exception e) {
            System.out.println(e);
        }
        /*---------test ingredients------------*/
        System.out.println("test factory");
        IngredientFactory factory = new IngredientFactory();
        Ingredient i1 = null;
        Ingredient i2 = null;
        Ingredient i3 = null;
        try {
            i1 = factory.createingredient(TypeIngredient.VIANDE);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            i2 = factory.createingredient(TypeIngredient.LEGUME);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            i3 = factory.createingredient(TypeIngredient.FRUIT);
        } catch (Exception e) {
            System.out.println(e);
        }
        /*--------getter et setter----------*/
        System.out.println("test setter");
        try {
            i1.setNom("steak");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            i1.setDescription("Medium-saignant");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            i1.setTypeIngredient(TypeIngredient.VIANDE);
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            i2.setNom("patate");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            i2.setDescription("pile");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            i2.setTypeIngredient(TypeIngredient.LEGUME);
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            i3.setNom("Creme");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            i3.setDescription("sauce au poivre");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            i3.setTypeIngredient(TypeIngredient.LAITIER);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("test getter");

        try {
            System.out.println(i1.getNom());
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println(i1.getDescription());
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println(i1.getTypeIngredient());
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            System.out.println(i2.getNom());
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println(i2.getDescription());
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println(i2.getTypeIngredient());
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            System.out.println(i3.getNom());
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println(i3.getDescription());
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println(i3.getTypeIngredient());
        } catch (Exception e) {
            System.out.println(e);
        }
        /*-----------test ingredient inventaire--------------*/
        System.out.println("test creation ingredients inventaire");
        IngredientInventaire ii1 = null;
        IngredientInventaire ii2 = null;
        IngredientInventaire ii3 = null;
        try {
            ii1 = new IngredientInventaire(i2, 500);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            ii2 = new IngredientInventaire(i1, 250);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            ii3 = new IngredientInventaire(i1, -100);
        } catch (Exception e) {
            System.out.println(e);
        }

        /*-----------test getter setter------------------*/
        System.out.println("test getter setter");
        try {
            ii1.setIngredient(i1);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            ii2.setIngredient(i2);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            ii3.setIngredient(i3);
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            ii1.setQuantite(100);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            ii2.setQuantite(-200);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            ii3.setQuantite(300);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            ii1.retirerQuantite(25);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            ii1.retirerQuantite(500);
        } catch (Exception e) {
            System.out.println(e);
        }
        /*---------------------------get ------------------------------*/
        try {
            System.out.println(ii1.getIngredient());
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println(ii2.getIngredient());
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println(ii3.getIngredient());
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println(ii3.getQuantite());
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            System.out.println(ii1.getQuantite());
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println(ii2.getQuantite());
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println(ii3.getQuantite());
        } catch (Exception e) {
            System.out.println(e);
        }


        /*-----------test recette plat menu--------------*/
        System.out.println("test recette plat");
        try {
            p1.ajouterIngredient(ii1);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            p1.ajouterIngredient(ii2);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            p1.ajouterIngredient(ii3);
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            System.out.println(p1.getRecette());
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println(p2.getRecette());
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println(p3.getRecette());
        } catch (Exception e) {
            System.out.println(e);
        }
        /*-------------test inventaire-----------*/
        System.out.println("test inventaire");
        Inventaire.getInstance();
        try {
            Inventaire.getInstance().ajouter(ii1);
        } catch (Exception e){System.out.println(e);}
        try {
            Inventaire.getInstance().ajouter(ii1);
        } catch (Exception e){System.out.println(e);}
        try {
            Inventaire.getInstance().retirer(0,25);
        } catch (Exception e){System.out.println(e);}
        try {
            Inventaire.getInstance().retirer(20,25);
        } catch (Exception e){System.out.println(e);}
        try {
            System.out.println(Inventaire.getInstance().verifier(ii1));
        } catch (Exception e){System.out.println(e);}
        try {
            System.out.println(Inventaire.getInstance().verifier(ii2));
        } catch (Exception e){System.out.println(e);}
        Inventaire.getInstance();
        try {
            System.out.println(Inventaire.getInstance().verifier(ii1));
        } catch (Exception e){System.out.println(e);}
        try {
            System.out.println(Inventaire.getInstance().verifier(ii2));
        } catch (Exception e){System.out.println(e);}
    }
}
