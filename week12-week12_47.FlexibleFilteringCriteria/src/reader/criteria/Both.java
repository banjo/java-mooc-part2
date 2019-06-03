package reader.criteria;

public class Both implements Criterion {
    private Criterion criteria1;
    private Criterion criteria2;

    public Both(Criterion criteria1, Criterion criteria2) {
        this.criteria1 = criteria1;
        this.criteria2 = criteria2;
    }

    @Override
    public boolean complies(String line) {
        if (!criteria1.complies(line)) {
            return false;
        }

        if (!criteria2.complies(line)) {
            return false;
        }

        return true;
    }
}
