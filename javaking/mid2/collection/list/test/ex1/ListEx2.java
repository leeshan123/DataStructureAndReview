package javaking.mid2.collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {

    public static void main(String[] args) {
        System.out.println("n개의 정수를 입력하세요(종료 0)");
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (true){
            int input = sc.nextInt();
            if(input == 0){
                break;
            }else {
                list.add(input);
            }

        }

        System.out.println(list);

    }

}
