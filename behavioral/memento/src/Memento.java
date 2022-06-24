/**
 * Memento holds the current state
 */
public class Memento {

    private String state;

    public Memento(){

    }

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    @Override
    public String toString() {
        return "State = " + state;
    }
}
