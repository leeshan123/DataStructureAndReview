package javaking.mid2.collection.set.test;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniqueNamesTest3 {
    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<>(List.of(30,20,20,10,10));

        for (Integer x : set) {
            System.out.println(x);
        }

    }
}
