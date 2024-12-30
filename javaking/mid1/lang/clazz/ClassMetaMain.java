package javaking.mid1.lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.SQLOutput;

public class ClassMetaMain {
    public static void main(String[] args) throws ClassNotFoundException {
        //Class 조회
        Class clazz = String.class; // 1. 클래스에서 조회
        Class calzz1 = new String().getClass(); //2. 인스턴스에서 조회
        Class clazz2 = Class.forName("java.lang.String"); //3. 문자열로 조회

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field: "+ field.getType() +" " + field.getName());
        }

        //모든 메서드 출력
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println("method = " + method);
        }

        System.out.println("Superclass: " + clazz.getSuperclass().getName());

        Class[] interfaces = clazz.getInterfaces();
        for (Class Interface : interfaces) {
            System.out.println("Interface = " + Interface.getName());
        }

    }

}
