package menufact;

import ingredients.Ingredient;
import ingredients.IngredientFactory;
import ingredients.IngredientInventaire;
import ingredients.TypeIngredient;
import inventaire.Inventaire;
import menufact.exceptions.PlatException;
import menufact.facture.Chef;
import menufact.facture.Facture;
import menufact.plats.PlatAuMenu;
import menufact.plats.PlatChoisi;
import menufact.plats.PlatEnfant;
import menufact.plats.PlatSante;

public class TestMenuFact01 {
    public static void main(String[] args) {
        IngredientFactory factory=new IngredientFactory();

        Chef chef=Chef.getInstance();
        Ingredient ingredient_chef1=null;
        Ingredient ingredient_chef2=null;
        Ingredient ingredient_chef3=null;
        Ingredient ingredient_chef4=null;
        Ingredient ingredient_chef5=null;
        try {
            ingredient_chef1=factory.createingredient(TypeIngredient.VIANDE);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            ingredient_chef2=factory.createingredient(TypeIngredient.LEGUME);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            ingredient_chef3=factory.createingredient(TypeIngredient.FRUIT);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            ingredient_chef4=factory.createingredient(TypeIngredient.LAITIER);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            ingredient_chef5=factory.createingredient(TypeIngredient.EPICE);
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            ingredient_chef1.setNom("poulet");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            ingredient_chef1.setDescription("cuisse");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            ingredient_chef2.setNom("patate");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            ingredient_chef2.setDescription("jaune");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            ingredient_chef3.setNom("pomme");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            ingredient_chef3.setDescription("rouge");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            ingredient_chef4.setNom("creme");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            ingredient_chef4.setDescription("35%");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            ingredient_chef5.setNom("curcuma");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            ingredient_chef5.setDescription("indien");
        } catch (Exception e) {
            System.out.println(e);
        }
        IngredientInventaire ingredient_inventaire1=null;
        IngredientInventaire ingredient_inventaire2=null;
        IngredientInventaire ingredient_inventaire3=null;
        IngredientInventaire ingredient_inventaire4=null;
        IngredientInventaire ingredient_inventaire5=null;
        try {
            ingredient_inventaire1 = new IngredientInventaire(ingredient_chef1, 100);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            ingredient_inventaire2 = new IngredientInventaire(ingredient_chef2, 100);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            ingredient_inventaire3 = new IngredientInventaire(ingredient_chef3, 100);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            ingredient_inventaire4 = new IngredientInventaire(ingredient_chef4, 100);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            ingredient_inventaire5 = new IngredientInventaire(ingredient_chef5, 100);
        } catch (Exception e) {
            System.out.println(e);
        }

        IngredientInventaire ingredient_plat1=null;
        IngredientInventaire ingredient_plat2=null;
        IngredientInventaire ingredient_plat3=null;
        IngredientInventaire ingredient_plat4=null;
        IngredientInventaire ingredient_plat5=null;
        try {
            ingredient_plat1 = new IngredientInventaire(ingredient_chef1, 100);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            ingredient_plat2 = new IngredientInventaire(ingredient_chef2, 100);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            ingredient_plat3 = new IngredientInventaire(ingredient_chef3, 100);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            ingredient_plat4 = new IngredientInventaire(ingredient_chef4, 100);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            ingredient_plat5 = new IngredientInventaire(ingredient_chef5, 100);
        } catch (Exception e) {
            System.out.println(e);
        }
        Inventaire inventaire=Inventaire.getInstance();
        try {
            Inventaire.getInstance().ajouter(ingredient_inventaire1);
        } catch (Exception e){System.out.println(e);}
        try {
            Inventaire.getInstance().ajouter(ingredient_inventaire2);
        } catch (Exception e){System.out.println(e);}
        try {
            Inventaire.getInstance().ajouter(ingredient_inventaire3);
        } catch (Exception e){System.out.println(e);}
        try {
            Inventaire.getInstance().ajouter(ingredient_inventaire4);
        } catch (Exception e){System.out.println(e);}
        try {
            Inventaire.getInstance().ajouter(ingredient_inventaire5);
        } catch (Exception e){System.out.println(e);}

        PlatAuMenu plat_chef = null;
        PlatSante plat_sante = null;
        PlatEnfant plat_enfant = null;
        try {
            plat_chef = new PlatAuMenu(0, "PlatChefNormal", 10);
        } catch (PlatException e) {
            System.out.println(e);
        }
        try {
            plat_sante = new PlatSante(0, "PlatChefSante", 20,10,10,10);
        } catch (PlatException e) {
            System.out.println(e);
        }
        try {
            plat_enfant = new PlatEnfant(0, "PlatChefEnfant", 10,0.5);
        } catch (PlatException e) {
            System.out.println(e);
        }
        try {
            plat_chef.ajouterIngredient(ingredient_plat1);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            plat_sante.ajouterIngredient(ingredient_plat2);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            plat_enfant.ajouterIngredient(ingredient_plat3);
        } catch (Exception e) {
            System.out.println(e);
        }
        PlatChoisi plat_chef_choisi=null;
        PlatChoisi plat_sante_choisi=null;
        PlatChoisi plat_enfant_choisi=null;
        PlatChoisi plat_impossible_choisi=null;
        try {
            plat_chef_choisi= new PlatChoisi(plat_chef, 1);
        } catch (Exception e){System.out.println(e);}
        try {
            plat_sante_choisi= new PlatChoisi(plat_sante, 1);
        } catch (Exception e){System.out.println(e);}
        try {
            plat_enfant_choisi= new PlatChoisi(plat_enfant, 1);
        } catch (Exception e){System.out.println(e);}
        try {
            plat_impossible_choisi= new PlatChoisi(plat_chef, 1);
        } catch (Exception e){System.out.println(e);}
        try {
            System.out.println("===menufact.plats.PlatAuMenu Constructeur 3 arguments");
            PlatAuMenu p1 = new PlatAuMenu(0, "Frites sauce", 11.50);
            System.out.println(p1);

            System.out.println("===menufact.plats.PlatAuMenu Constructeur 3 arguments");
            PlatAuMenu p2 = new PlatAuMenu(1, "Frites", 10.25);
            System.out.println(p2);

            System.out.println("===menufact.plats.PlatSante Constructeur 5 arguments");
            PlatSante ps1 = new PlatSante(2, "Salade", 5.25, 100, 10, 1);
            System.out.println(ps1);

            System.out.println("===menufact.plats.PlatSante Constructeur 5 arguments");
            PlatSante ps2 = new PlatSante(3, "Salade Cesar", 8.25, 100, 10, 1);
            System.out.println(ps2);

            System.out.println("===menufact.Menu ajout avec 4 plats");
            Menu menu = Menu.getInstance("Menu1");
            menu.ajoute(p1);
            menu.ajoute(p2);
            menu.ajoute(ps1);
            menu.ajoute(ps2);
            System.out.println(menu);

            System.out.println("===menufact.Menu position 1, plat à la position 0");
            menu.position(0);
            System.out.println(menu.platCourant());

            System.out.println("===menufact.Menu position 1, plat à la position suivante 1");
            menu.positionSuivante();
            System.out.println(menu.platCourant());

            System.out.println("== Plat choisi");
            PlatChoisi pch1 = new PlatChoisi(p1, 5);
            System.out.println(pch1);

            System.out.println("== New menufact.facture.Facture");
            Facture facture = new Facture("Ma facture");
            System.out.println(facture);

            System.out.println("== Ajout d'un plat choisie à la facture");
            facture.ajoutePlat(plat_chef_choisi);
            System.out.println(facture);
            System.out.println(facture.sousTotal());

            System.out.println("== Ajout d'un plat choisie à la facture");
            PlatChoisi pch2 = new PlatChoisi(plat_enfant, 1);
            facture.ajoutePlat(pch2);
            System.out.println(facture);
            System.out.println(facture.sousTotal());

            System.out.println(facture.total());
            facture.ouvrir();
            System.out.println(facture);
            System.out.println("Etat = " + facture.getEtat());

            facture.fermer();
            System.out.println(facture);
            System.out.println("Etat = " + facture.getEtat());

            facture.ouvrir();
            System.out.println(facture);
            System.out.println("Etat = " + facture.getEtat());

            facture.payer();
            System.out.println(facture);
            System.out.println("Etat = " + facture.getEtat());

            facture.ouvrir();
            System.out.println(facture);
            System.out.println("Etat = " + facture.getEtat());
        } catch(Exception e){System.out.println(e);}

    }
}
