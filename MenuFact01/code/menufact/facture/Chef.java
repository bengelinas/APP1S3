package menufact.facture;

public class Chef implements Subscriber{
    private static Chef instance;
    private Chef()
    {

    }
    public void update(){

    }
    public static Chef getInstance()
    {
        if (instance == null) {
            instance = new Chef();
        }
        return instance;
        }
}
