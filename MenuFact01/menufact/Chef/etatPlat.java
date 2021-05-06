package menufact.Chef;

public class etatPlat implements State {

    private State etatPlat;

    public void setState(State state)
    {
        this.etatPlat=state;
    }

    public State getState() {
        return this.etatPlat;
    }

    @Override
    public void doAction() {
        this.etatPlat.doAction();
    }
}
