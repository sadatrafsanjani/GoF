public class Main {

    public static void main(String[] args) {

        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setStateValue("001");
        caretaker.push(originator.save());

        originator.setStateValue("002");
        caretaker.push(originator.save());

        System.out.println("Current State: " + caretaker.peek());
        originator.undo(caretaker.pop());
        System.out.println("Current State: " + caretaker.peek());
    }
}
