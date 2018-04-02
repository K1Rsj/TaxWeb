package my.app.model;

import java.util.Comparator;

public class TaxComparator implements Comparator<Tax> {
    @Override
    public int compare(Tax o1, Tax o2) {
        return o1.value.compareTo(o2.value);
    }
}
