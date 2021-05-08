package menufact.facture;

public interface FactureEtat {
    /*

    POSSIBILITE D'INCLURE LE ENUM AUSSI MAIS JE L'AI FAIT AVEC UN STRING POUR LE getEtat EN BAS.

    public enum State { OUVERTE, PAYEE, FERMEE };

     */
    public void updateFacture();
    public String getEtat();
}
