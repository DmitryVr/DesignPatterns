package behavioral.state;

import behavioral.state.context.TransformerContext;
import behavioral.state.states.FireState;
import behavioral.state.states.MoveState;
import behavioral.state.states.TransformerState;

public class Main {
    public static void main(String[] args) {
        TransformerContext context = new TransformerContext();

        TransformerState stateMove = new MoveState();
        TransformerState stateFire = new FireState();

        context.setState(stateFire);
        context.action();

        context.setState(stateMove);
        context.action();
    }
}
