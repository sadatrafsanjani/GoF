public class AnalystAdapter implements Programmer {

    Analyst analyst;

    public AnalystAdapter(Analyst analyst) {
        this.analyst = analyst;
    }

    @Override
    public void program() {

        analyst.analysis();
    }

    @Override
    public void documentation() {

        analyst.documentation();
    }
}
