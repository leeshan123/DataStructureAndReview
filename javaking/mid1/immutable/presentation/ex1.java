package javaking.mid1.immutable.presentation;

public class ex1 {

    public static void main(String[] args) {
        String easyCode = "쉬운코드";
        String sameRef = easyCode;

        System.out.println(easyCode == sameRef); //true

        easyCode = "구독마렵네";
        System.out.println(easyCode == sameRef); //false


    }


}
