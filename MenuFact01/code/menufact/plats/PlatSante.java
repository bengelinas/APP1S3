package menufact.plats;

import menufact.exceptions.PlatException;
import menufact.plats.PlatAuMenu;

public class PlatSante extends PlatAuMenu {
    private double kcal;
    private double chol;
    private double gras;

    public PlatSante(int code, String description, double prix, double kcal, double chol, double gras) throws PlatException
    {
        super(code, description, prix);
        if(kcal<0){throw new PlatException("kcal ne peut pas etre negatif");}
        else if(chol<0){throw new PlatException("chol ne peut pas etre negatif");}
        else if(gras<0){throw new PlatException("gras ne peut pas etre negatif");};
        this.kcal = kcal;
        this.chol = chol;
        this.gras = gras;
    }

    public PlatSante() {
    }

    @Override
    public String toString() {
        return "menufact.plats.PlatSante{" +
                "kcal=" + kcal +
                ", chol=" + chol +
                ", gras=" + gras +
                "} " + super.toString();
    }

    public double getKcal() {
        return kcal;
    }

    public double getChol() {
        return chol;
    }

    public double getGras() {
        return gras;
    }
}
