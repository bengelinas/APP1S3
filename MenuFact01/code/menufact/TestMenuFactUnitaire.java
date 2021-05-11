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


public class TestMenuFactUnitaire {
    public static void main(String[] args) {
        /*----------------- test plat-----------------*/
        System.out.println("========================================================================================================");
        System.out.println("Creation de Plat au menu");
        System.out.println("=================================================");


        PlatAuMenu p1 = null;
        PlatAuMenu p2 = null;
        PlatAuMenu p3 = null;

        System.out.println();
        System.out.println("Creation d'un plat valide");
        try {
            p1 = new PlatAuMenu(0, "PlatAuMenu0", 10);
        } catch (PlatException e) {
            System.out.println(e);
        }
        try {
            System.out.println(p1.toString());
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println();
        System.out.println("Creation d'un plat invalide");
        try {
            p2 = new PlatAuMenu(-1, "PlatAuMenu1", 20);
        } catch (PlatException e) {
            System.out.println(e);
        }
        try {
            System.out.println(p2.toString());
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println();
        System.out.println("Creation d'un plat invalide");
        try {
            p3 = new PlatAuMenu(2, "PlatAuMenu2", -30);
        } catch (PlatException e) {
            System.out.println(e);
        }
        try {
            System.out.println(p3.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("\n========================================================================================================\n");
        /*------------test de set--------------*/
        System.out.println("========================================================================================================");
        System.out.println("Assignation et accession du code de Plat au menu");
        System.out.println("================================================");
        System.out.println();System.out.println();

        System.out.println("Assignation valide");
        try {
            p1.setCode(1);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println(p1.getCode());
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Assignation valide");
        try {
            p2.setCode(2);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println(p2.getCode());
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Assignation invalide");
        try {
            p3.setCode(-1);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println(p3.getCode());
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("\n========================================================================================================\n");

        /*------------test de set--------------*/
        System.out.println("========================================================================================================");
        System.out.println("Assignation et accession de la description du Plat au menu");
        System.out.println("==========================================================");
        System.out.println();System.out.println();

        System.out.println("Assignation valide");
        try {
            p1.setDescription("test");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println(p1.getDescription());
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println();System.out.println();

        System.out.println("Assignation invalide");
        try {
            p2.setDescription("test");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println(p2.getDescription());
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println();System.out.println();

        System.out.println("Assignation invalide");
        try {
            p3.setDescription("test");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println(p3.getDescription());
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("\n========================================================================================================\n");
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
            p3.setPrix(-1);
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
        try {
            ii3 = new IngredientInventaire(i1, 100);
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
            ii1.setQuantite(1000);
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
            ii1.retirerQuantite(50000);
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
            p1.ajouterIngredient(ii1);
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
            Inventaire.getInstance().ajouter(ii3);
        } catch (Exception e){System.out.println(e);}
        try {
            Inventaire.getInstance().ajouter(ii3);
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
/*--------------- test plat choisi ---------------*/
        System.out.println("test plat choisi");
        PlatChoisi pc1= null;
        PlatChoisi pc2= null;
        try {
            pc1= new PlatChoisi(p1, 2);
        } catch (Exception e){System.out.println(e);}

        try {
            pc2= new PlatChoisi(p1, -1);
         } catch (Exception e){System.out.println(e);}

        try {
            System.out.println(pc1.getPlat());
        } catch (Exception e){System.out.println(e);}
        try {
            pc1.setQuantite(1);
        } catch (Exception e){System.out.println(e);}

        try {
            System.out.println(pc1.getQuantite());
        } catch (Exception e){System.out.println(e);}
        /*--------------test Client----------------*/
        System.out.println("test client");
        Client client1= null;
        Client client2= null;
        Client client3= null;
        try {
            client1= new Client(1,"Phil","123412341234");
        } catch (Exception e){System.out.println(e);}
        try {
            client2= new Client(2,"Ben","456456456");
        } catch (Exception e){System.out.println(e);}
        try {
            client3= new Client(3,"Domingo","789789789");
        } catch (Exception e){System.out.println(e);}
        try {
            System.out.println(client1.getIdClient());
        } catch (Exception e){System.out.println(e);}
        try {
            System.out.println(client1.getNom());
        } catch (Exception e){System.out.println(e);}
        try {
            System.out.println(client1.getNumeroCarteCredit());

        } catch (Exception e){System.out.println(e);}
        try {
            client2.setIdClient(4);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            client2.setNom("Chad McCool");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            client2.setNumeroCarteCredit("over 9000");
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            System.out.println(client2.getIdClient());
        } catch (Exception e){System.out.println(e);}
        try {
            System.out.println(client2.getNom());
        } catch (Exception e){System.out.println(e);}
        try {
            System.out.println(client2.getNumeroCarteCredit());}
            catch(Exception e){System.out.println(e);}

        try {
            System.out.println(client3.toString());}
        catch(Exception e){System.out.println(e);}
        /*--------------test Menu---------------*/
        System.out.println("test menu");
        Menu.getInstance("le meilleur menu");
        try {
            System.out.println(Menu.getInstance("le pire menu").toString());}
        catch(Exception e){System.out.println(e);}
        Menu menu=Menu.getInstance("Le pire menu");
        try {
            menu.positionPrecedente();}
        catch(Exception e){System.out.println(e);}

        try {
            menu.positionSuivante();}
        catch(Exception e){System.out.println(e);}

        try {
            menu.ajoute(p1);}
        catch(Exception e){System.out.println(e);}

        try {
            menu.ajoute(p1);}
        catch(Exception e){System.out.println(e);}

        try {
            System.out.println(menu.platCourant());}
        catch(Exception e){System.out.println(e);}
        try {
            menu.positionSuivante();}
        catch(Exception e){System.out.println(e);}

        try {
            System.out.println(menu.platCourant());}
        catch(Exception e){System.out.println(e);}

        try {
            menu.position(0);}
        catch(Exception e){System.out.println(e);}

        try {
            System.out.println(menu.platCourant());}
        catch(Exception e){System.out.println(e);}

        /*--------------test Plat sante---------*/
        System.out.println("=======================================================================");
        System.out.println("Les test de plats sante initialise quatre plat sante,");
        System.out.println("dont trois vont revenir invalide car sont rentree des valeurs negatives");
        System.out.println("=======================================================================");
        PlatSante l_ps1=null;
        PlatSante l_ps2=null;
        PlatSante l_ps3=null;
        PlatSante l_ps4=null;
        System.out.println("Voici un plat valide:");
        try {
            l_ps3 = new PlatSante(1, "Plat Sante numero 1",1000,1500,50,50000);
        }
        catch(Exception e){System.out.println(e);}

        System.out.println();
        System.out.println(l_ps3.toString());

        System.out.println("Voici un plat invalide:");
        try {
            l_ps1 = new PlatSante(1, "Plat Sante numero 1",1000,-500,50,50000);
        }
        catch(Exception e){System.out.println(e);}


        System.out.println("Voici un plat invalide:");
        try {
            l_ps2 = new PlatSante(1, "Plat Sante numero 1",1000,1500,-50,50000);
        }
        catch(Exception e){System.out.println(e);}

        System.out.println("Voici un plat invalide:");
        try {
            l_ps4 = new PlatSante(1, "Plat Sante numero 1",1000,1500,50,-50000);
        }
        catch(Exception e){System.out.println(e);}

        System.out.println();System.out.println();

        System.out.println("Essayon d'afficher un plat sante invalide");
        try{
            System.out.println(l_ps1.toString());
        }catch(Exception e){System.out.println(e);}
        System.out.println("Essayon d'afficher un plat sante valide");
        try{
            System.out.println(l_ps3.toString());
        }catch(Exception e){System.out.println(e);}
        System.out.println("Essayon d'afficher ses attribut individuellement");
        System.out.print("Cholesterol:");
        System.out.println(l_ps3.getChol());
        System.out.print("Kcal:");
        System.out.println(l_ps3.getKcal());
        System.out.print("Gras:");
        System.out.println(l_ps3.getGras());

        /*--------------test Plat enfant----------*/
        PlatEnfant pe1=null;
        PlatEnfant pe2=null;

        try {
            pe1 = new PlatEnfant(0, "PlatAuMenu0", 10,0.5);
        } catch (PlatException e) {
            System.out.println(e);
        }
        try {
            pe2 = new PlatEnfant(0, "PlatAuMenu0", 10,-0.5);
        } catch (PlatException e) {
            System.out.println(e);
        }
        try {
            System.out.println(pe1.toString());}
        catch(Exception e){System.out.println(e);}
        try {
            System.out.println(pe2.toString());}
        catch(Exception e){System.out.println(e);}
        try {
            System.out.println(pe1.getProportion());}
        catch(Exception e){System.out.println(e);}
        try {
            System.out.println(pe2.getProportion());}
        catch(Exception e){System.out.println(e);}

        /*----------------test chef---------------*/
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
        System.out.println("inventaire plein");
        System.out.println(inventaire.toString());
        /*---------test plat normal------------*/
        System.out.println("plat normal");
        try {
        chef.update(plat_chef_choisi);
        } catch (Exception e){System.out.println(e);}
        System.out.println(inventaire.toString());
        System.out.println(plat_chef_choisi.getPlat().getEtat());
        /*---------test plat sante----------------*/
        System.out.println("plat sante");
        try {
        chef.update(plat_sante_choisi);
        } catch (Exception e){System.out.println(e);}
        System.out.println(inventaire.toString());
        System.out.println(plat_chef_choisi.getPlat().getEtat());
        /*---------test plat Enfant----------------*/
        System.out.println("plat enfant");
        try {
        chef.update(plat_enfant_choisi);
        } catch (Exception e){System.out.println(e);}
        System.out.println(inventaire.toString());
        System.out.println(plat_chef_choisi.getPlat().getEtat());
        /*----------deuxieme test plat enfant-------*/
        System.out.println("plat enfant 2");
        try {
        chef.update(plat_enfant_choisi);
        } catch (Exception e){System.out.println(e);}
        System.out.println(inventaire.toString());
        System.out.println(plat_chef_choisi.getPlat().getEtat());
        /*-----------test plat impossible car pas assez d'ingredient---------*/
        System.out.println("plat impossible");
        try {
        chef.update(plat_impossible_choisi);
        } catch (Exception e){System.out.println(e);}
        System.out.println(inventaire.toString());
        System.out.println(plat_chef_choisi.getPlat().getEtat());
        System.out.println(plat_impossible_choisi.getPlat().getEtat());
        /*---------------test Facture--------------*/
        Facture l_f1 = new Facture("Facture de test numero 1");
        
}
}
