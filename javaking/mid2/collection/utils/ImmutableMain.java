package javaking.mid2.collection.utils;

import java.util.ArrayList;
import java.util.List;

public class ImmutableMain {

    public static void main(String[] args) {
        //불편 리스트 생성
        List<Integer> list = List.of(1,2,3);

        //가변 리스트
        List<Integer> mutableList = new ArrayList<>(list);
        mutableList.add(4);
        System.out.println("mutableList = " + mutableList);
        System.out.println("mutableList.getClass() = " + mutableList.getClass());
    }

}
