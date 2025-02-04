package javaking.mid2.collection.iterable;

import java.util.Iterator;

public class MyArrayMain {

    public static void main(String[] args) {
        MyArray myArray = new MyArray(new int[]{1,2,3,4});
        Iterator<Integer> iterator = myArray.iterator();

        while (iterator.hasNext()){
            Integer value = iterator.next();
            System.out.println("value = " + value);
        }

        //추가
        System.out.println("for-each 사용");
        for (Integer a : myArray) {
            System.out.println("a = " + a);
        }


    }

}
