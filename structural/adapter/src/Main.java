public class Main {

    public static void main(String[] args) {

        Programmer dba = new DatabaseProgrammer();
        Analyst systemAnalyst = new SystemAnalyst();
        Programmer programmer = new AnalystAdapter(systemAnalyst);

        dba.documentation();
        dba.program();

        programmer.program();
        programmer.documentation();
    }
}
