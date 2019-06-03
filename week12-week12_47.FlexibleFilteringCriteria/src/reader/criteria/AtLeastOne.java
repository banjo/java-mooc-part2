package reader.criteria;

import java.util.ArrayList;

public class AtLeastOne implements Criterion {

    private ArrayList<Criterion> criterions;

    public AtLeastOne(Criterion... criteria) {

        criterions = new ArrayList<Criterion>();

        for (Criterion crit : criteria){
            criterions.add(crit);
        }

    }

    @Override
    public boolean complies(String line) {
        for (Criterion crit : criterions) {
            if (crit.complies(line)) {
                return true;
            }
        }

        return false;
    }
}
