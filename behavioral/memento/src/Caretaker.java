import java.util.Stack;

/**
 * Caretaker tracks and recover state changes
 */
public class Caretaker {

    private Stack<Memento> history = new Stack<>();

    public void push(Memento memento) {
        history.push(memento);
    }

    public Memento pop() {
        return history.pop();
    }

    public String peek() {
        return history.peek().getState();
    }
}
