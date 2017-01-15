package behavioral.state.states;

public class FireState implements TransformerState {
    @Override
    public void action() {
        System.out.println("fire!");
    }
}
