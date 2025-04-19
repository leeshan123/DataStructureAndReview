package javaking.ad3.lamda.lambda5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class IntegerFilter {

    public static List<Integer> filter(List<Integer> list, Predicate<Integer> predicate){
        List<Integer> filtered = new ArrayList<>();
        for (Integer number : list) {
            if(predicate.test(number)){
                filtered.add(number);
            }
        }
        return filtered;
    }

}
