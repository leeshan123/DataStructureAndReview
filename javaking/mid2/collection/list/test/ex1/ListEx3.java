package javaking.mid2.collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {

    public static void main(String[] args) {
        System.out.println("n개의 정수를 입력하세요(종료 0)");
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (true) {
            int input = sc.nextInt();
            if (input == 0) {
                break;
            } else {
                list.add(input);
            }

        }

        int total = 0;
        for(int i=0; i< list.size(); i++){
            total += list.get(i);
        }

        System.out.println("입력한 정수의 합계: "+ total);
        System.out.println("입력한 정수의 평균: "+ (double)total/list.size());

    }
}
