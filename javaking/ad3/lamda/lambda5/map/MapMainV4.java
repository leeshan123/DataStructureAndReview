package javaking.ad3.lamda.lambda5.map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import static javaking.ad3.lamda.lambda5.map.StringToIntegerMapper.map;

public class MapMainV4 {

    public static void main(String[] args) {
        List<String> list = List.of("1", "12", "123", "1234");

        //문자열을 숫자로 변환
        List<Integer> numbers = map(list, (s) -> Integer.valueOf(s));
        System.out.println("numbers = " + numbers);

        //문자열의 길이
        List<Integer> numberLength = map(list, (s)-> s.length());
        System.out.println("numbers = " + numberLength);

    }




}
