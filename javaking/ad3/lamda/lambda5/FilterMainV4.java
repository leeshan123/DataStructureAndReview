package javaking.ad3.lamda.lambda5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterMainV4 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //짝수만 거르기
        List<Integer> evenNumbers = IntegerFilter.filter(numbers, (o)-> o %2 == 0);
        System.out.println("evenNumbers = " + evenNumbers);

        List<Integer> oddNumbers = IntegerFilter.filter(numbers, (o) -> o %2 == 1);
        System.out.println("oddNumbers = " + oddNumbers);


    }


}
