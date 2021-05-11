package menufact;

import ingredients.Ingredient;
import ingredients.IngredientFactory;
import ingredients.IngredientInventaire;
import ingredients.TypeIngredient;
import inventaire.Inventaire;
import menufact.exceptions.PlatException;
import menufact.facture.Chef;
import menufact.facture.exceptions.FactureException;
import menufact.exceptions.MenuException;
import menufact.facture.Facture;
import menufact.plats.PlatAuMenu;
import menufact.plats.PlatChoisi;
import menufact.plats.PlatEnfant;
import menufact.plats.PlatSante;

public class TestMenuFact02 {

    public static void main(String[] args) {
        boolean trace = true;
        Chef chef=Chef.getInstance();
        TestMenuFact02 t = new TestMenuFact02();
        IngredientFactory factory=new IngredientFactory();

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
        PlatAuMenu p1=null;
        PlatAuMenu p2=null;
        PlatAuMenu p3=null;
        PlatAuMenu p4=null;
        PlatAuMenu p5=null;

        PlatSante ps1=null;
        PlatSante ps2=null;
        PlatSante ps3=null;
        PlatSante ps4=null;
        PlatSante ps5=null;

        PlatEnfant pe1=null;
        PlatEnfant pe2=null;
        PlatEnfant pe3=null;

        try
        {
            p1 = new PlatAuMenu(0, "PlatAuMenu0", 10);
        }catch (PlatException e){
            System.out.println(e);
        }
        try
        {
            p1 = new PlatAuMenu(0, "PlatAuMenu0", 10);
        }catch (PlatException e){
            System.out.println(e);
        }
        try
        {
            p2 = new PlatAuMenu(1, "PlatAuMenu1", 20);
        }catch (PlatException e){
            System.out.println(e);
        }
        try
        {
            p3 = new PlatAuMenu(2, "PlatAuMenu2", 30);
        }catch (PlatException e){
            System.out.println(e);
        }
        try
        {
            p4 = new PlatAuMenu(3, "PlatAuMenu3", 40);
        }catch (PlatException e){
            System.out.println(e);
        }
        try
        {
            p5 = new PlatAuMenu(4, "PlatAuMenu4", 50);
        }catch (PlatException e){
            System.out.println(e);
        }
        try
        {
            ps1 = new PlatSante(10, "PlatSante0", 10, 11, 11, 11);
        }catch (PlatException e)
        {
            System.out.println(e);
        }
        try
        {
            ps2 = new PlatSante(11, "PlatSante1", 20, 11, 11, 11);
        }catch (PlatException e)
        {
            System.out.println(e);
        }
        try
        {
            ps3 = new PlatSante(12, "PlatSante2", -3, -3, 11, 11);
        }catch (PlatException e)
        {
            System.out.println(e);
        }
        try
        {
            ps4 = new PlatSante(13, "PlatSante3", 40, 11, 11, 11);
        }catch (PlatException e)
        {
            System.out.println(e);
        }
        try
        {
            ps5 = new PlatSante(14, "PlatSante4", 50, 11, 11, 11);
        }catch (PlatException e)
        {
            System.out.println(e);
        }
        try
        {
            pe1 = new PlatEnfant(12, "PlatEnfant0", 10, 0.5);
        }catch (PlatException e)
        {
            System.out.println(e);
        }
        try
        {
            pe2 = new PlatEnfant(11, "PlatEnfant1", 20, 0.75);
        }catch (PlatException e)
        {
            System.out.println(e);
        }
        try
        {
            pe3 = new PlatEnfant(13, "PlatEnfant2", 30, 0.25);
        }catch (PlatException e)
        {
            System.out.println(e);
        }

        Menu m1 = Menu.getInstance("menufact.Menu 1");
        Menu m2 = Menu.getInstance("menufact.Menu 2");

        Facture f1 = new Facture("Ma facture");

        Client c1 = new Client(1,"Mr Client","1234567890");

        m1.ajoute(p1);
        m1.ajoute(p2);
        m1.ajoute(p3);
        m1.ajoute(p4);
        m1.ajoute(p5);
        m1.ajoute(ps1);
        m1.ajoute(ps2);
        m1.ajoute(ps3);
        m1.ajoute(ps4);
        m1.ajoute(ps5);

        t.test1_AffichePlatsAuMenu(trace, p1,p2,p3,p4,p5);
        t.test2_AffichePlatsSante(trace, ps1,ps2,ps4,ps5);

        t.test4_AjoutPlatsAuMenu(trace, m1, p1, p2, ps1, ps2, m2, p3, p4, ps4);


        try {
            t.test5_DeplacementMenuAvancer(m1);
        } catch (MenuException e) {
            System.out.println(e.getMessage());
        }
        try {
            t.test6_DeplacementMenuReculer(m1);
        } catch (MenuException e) {
            System.out.println(e.getMessage());
        }
        try {
            t.test7_CreerFacture(f1, m1);
        } catch (FactureException e) {
            System.out.println(e.getMessage());
        }
        t.test8_AjouterClientFacture(f1, c1);

        try {
            t.test8_AjouterPlatsFacture(f1, m1,1);
        } catch (FactureException fe)
        {
            System.out.println(fe.getMessage());
        }
        catch (MenuException me)
        {
            System.out.println(me);
        }
        t.test9_PayerFacture(f1);

        try {
            t.test8_AjouterPlatsFacture(f1, m1,1);
        } catch (FactureException fe)
        {
            System.out.println(fe.getMessage());
        }
        catch (MenuException me)
        {
            System.out.println(me);
        }
        try {
            f1.ouvrir();
        } catch (FactureException fe)
        {
            System.out.println(fe.getMessage());
        }

        System.out.println("FIN DE TOUS LES TESTS...");

        System.out.println(f1.genererFacture());
    }

    private void test1_AffichePlatsAuMenu(boolean trace, PlatAuMenu p1, PlatAuMenu p2,
                                                 PlatAuMenu p3, PlatAuMenu p4, PlatAuMenu p5)
    {
        System.out.println("=== test1_AffichePlatsAuMenu");
        if(trace)
        {
            System.out.println(p1);
            System.out.println(p2);
            System.out.println(p3);
            System.out.println(p4);
            System.out.println(p5);
        }
    }


   private void test2_AffichePlatsSante(boolean trace, PlatSante ps1, PlatSante ps2, PlatSante ps4, PlatSante ps5)
    {
        System.out.println("=== test2_AffichePlatsSante");

        if(trace)
        {
            System.out.println(ps1);
            System.out.println(ps2);
            System.out.println(ps4);
            System.out.println(ps5);
        }
    }


    private static void test3_AjoutMenu(boolean trace, Menu m1, Menu m2)
    {

        System.out.println("=== test3_AjoutMenu");

        if(trace) {
            System.out.println(m1);
            System.out.println(m2);
        }
    }


    private void test4_AjoutPlatsAuMenu(boolean trace, Menu m1,
                                        PlatAuMenu p1, PlatAuMenu p2,
                                        PlatSante ps1, PlatSante ps2,
                                        Menu m2,
                                        PlatAuMenu p3, PlatAuMenu p4, PlatSante ps4)
    {
        System.out.println("=== test4_AjoutPlatsAuMenu");
        System.out.println("=== Ajout de plats au menu 1");
        m1.ajoute(p1);
        m1.ajoute(p2);
        m1.ajoute(ps1);
        m1.ajoute(ps2);


        System.out.println("=== Ajout de plats au menu 2");
        m2.ajoute(p3);
        m2.ajoute(p4);
        m2.ajoute(ps4);

        if(trace) {
            System.out.println(m1);
            System.out.println(m2);
        }
    }


    private void test5_DeplacementMenuAvancer(Menu m1) throws MenuException
    {
        System.out.println("=== test5_DeplacementMenuAvancer");

        System.out.println("===Selectionner un plat du menu 0");
        m1.position(0);

        System.out.println("=== Afficher le plat courant");
        System.out.println(m1.platCourant());
        try {

            System.out.println("=== Avancer le plat courant");
            System.out.println("1.");
            m1.positionSuivante();
            System.out.println("2.");
            m1.positionSuivante();
            System.out.println("3.");
            m1.positionSuivante();
            System.out.println("4.");
            m1.positionSuivante();
            System.out.println("5.");
            m1.positionSuivante();
        }
        catch (MenuException me)
        {
                throw me;
        }
    }


    private void test6_DeplacementMenuReculer(Menu m1) throws MenuException
    {
        System.out.println("===test6_DeplacementMenuReculer");

        System.out.println("===Selectionner un plat du menu 3");
        m1.position(3);

        System.out.println("=== Afficher le plat courant");
        System.out.println(m1.platCourant());
        try {

            System.out.println("=== Reculer le plat courant");
            System.out.println("2.");
            m1.positionPrecedente();
            System.out.println("1.");
            m1.positionPrecedente();
            System.out.println("0.");
            m1.positionPrecedente();
            System.out.println("-1.");
            m1.positionPrecedente();
            System.out.println("-2.");
            m1.positionPrecedente();
        }
        catch (MenuException me)
        {
            throw me;
        }
    }

    private void test7_CreerFacture(Facture f1, Menu m1) throws FactureException
    {
        System.out.println("===test7_CreerFacture");
        PlatChoisi platChoisi=null;
        try
        {
            platChoisi = new PlatChoisi(m1.platCourant(), 5);
        }catch(PlatException e){
            System.out.println(e);
        }
        try
        {
            f1.ajoutePlat(platChoisi);
        }
        catch (FactureException fe)
        {
            throw fe;
        }
        System.out.println(f1);
    }


    private void test8_AjouterClientFacture(Facture f1,Client c1) {
        System.out.println("===test8_AjouterClientFacture");
        f1.associerClient(c1);
        System.out.println(f1);
    }
    private void test8_AjouterPlatsFacture(Facture f1, Menu m1, int pos) throws MenuException,FactureException
    {
        System.out.println("===test8_AjouterPlatsFacture");

        try{
            for (int i=0; i< pos; i++)
                m1.positionSuivante();
        }
        catch (MenuException me)
        {
            throw me;
        }

        PlatChoisi platChoisi=null;
        try
        {
            platChoisi = new PlatChoisi(m1.platCourant(), 5);
        }catch (PlatException e){
            System.out.println(e);
        }
        try
        {
            f1.ajoutePlat(platChoisi);
        }
        catch (FactureException fe)
        {
            throw fe;
        }
        System.out.println(f1);
    }

    private void test9_PayerFacture(Facture f1)
    {
        System.out.println("===test9_PayerFacture");

        System.out.println("Avant payer la facture");
        System.out.println(f1);
        try
        {
            f1.payer();
        }catch (FactureException e)
        {
            System.out.println(e);
        }
        System.out.println("Apres avoir paye la facture");
        System.out.println(f1);
    }
}
