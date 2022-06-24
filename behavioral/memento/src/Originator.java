/**
 * Originator saves the current state in a Memento object
 */
public class Originator {

    private String stateValue;

    public void setStateValue(String stateValue) {
        this.stateValue = stateValue;
    }

    public Memento save(){

        return new Memento(stateValue);
    }

    public void undo(Memento memento) {
        stateValue = memento.getState();
    }
}
