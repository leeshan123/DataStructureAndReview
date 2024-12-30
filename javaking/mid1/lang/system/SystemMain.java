package javaking.mid1.lang.system;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        //현재 시간을 밀리초로 가져온다
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        //현재 시간을 나노초로 가져온다
        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano = " + currentTimeNano);

        //환경 변수를 읽는다
        System.out.println("getenv= " +System.getenv());

        //시스템 속성을 읽는다.
        System.out.println("proterties = " + System.getProperties());
        System.out.println("Java version: " + System.getProperty("java.version"));

        //배열을 고속으로 복사한다.
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originalArray,0,copiedArray,0,originalArray.length);

        //배열 출력
        System.out.println("copiedArray = " + Arrays.toString(copiedArray));

    }

}
