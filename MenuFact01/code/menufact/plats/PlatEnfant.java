package menufact.plats;

import menufact.exceptions.PlatException;

public class PlatEnfant extends PlatAuMenu{
    private double proportion;

    public PlatEnfant() {
    }

    public PlatEnfant(int code, String description, double prix, double proportion) throws PlatException
    {
        super(code, description, prix);
        if (proportion < 0 || proportion > 1)
            {
                throw new PlatException("La proportion doit etre en 0 et 1");
            }
        this.proportion = proportion;
    }

    public double getProportion() {
        return proportion;
    }

    @Override
    public String toString() {
        return "PlatEnfant{" +
                "proportion=" + proportion +
                "} " + super.toString();
    }
}
