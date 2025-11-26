package Examples.Data_Collections.Sets;

import java.util.HashSet;
import java.util.Set;

public class AdvancedSets {
    public static void main(String[] args) {
        //union of 2 classes
        Set<Integer> a = Set.of(1, 2, 3);
        Set<Integer> b = Set.of(3, 4, 5);

        Set<Integer> union = new HashSet<>(a);
        union.addAll(b);
        System.out.println(union);

        //intersection(the number that are same in both sets)
        Set<Integer> intersection = new HashSet<>(a);
        intersection.retainAll(b);
        System.out.println(intersection);

        //difference
        Set<Integer> diff = new HashSet<>(a);
        diff.removeAll(b);
        System.out.println(diff);
    }
}
