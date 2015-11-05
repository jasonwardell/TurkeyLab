
package common;

import java.util.Comparator;

/**
 *
 * @author jwardell
 */
public class TurkeyByWeight implements Comparator<Turkey> {

    @Override
    public int compare(Turkey o1, Turkey o2) {
        return o1.getWeight().compareTo(o2.getWeight());
    }
    
}
