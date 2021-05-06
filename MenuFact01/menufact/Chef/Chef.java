package menufact.Chef;

public class Chef {

    private static Chef instance;
    private Chef(){};

    public static Chef getInstance()
    {
        if(instance==null)
        {
            instance = new Chef();
        }
        return instance;
    }
}
