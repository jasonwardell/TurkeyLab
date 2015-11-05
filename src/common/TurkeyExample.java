package common;

import java.util.Set;
import java.util.TreeSet;
import java.util.*;


/**
 *
 * @author jwardell
 */
public class TurkeyExample {
    public static void main(String[] args) {
      
    Turkey t1 = new Turkey("10", "1234", "Butterball");
    Turkey t2 = new Turkey("12", "1111", "Tyson");

    Set<Turkey> set = new TreeSet<>();
    set.add(t1);
    set.add(t2);
    
    List<Turkey> list = new ArrayList<>(set);

    Collections.sort(list, new TurkeyByWeight());
    
    for (Turkey t : list) {
            System.out.println(t);
        }
    }
}
