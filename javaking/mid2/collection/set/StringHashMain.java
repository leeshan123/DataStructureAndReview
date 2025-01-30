package javaking.mid2.collection.set;

public class StringHashMain {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        //char
        char charA = 'A';
        char charB = 'B';
        System.out.println("charA = " + (int)charA);
        System.out.println("charB = " + (int)charB);

        System.out.println();

        //hashCode
        int hashCode1 = hashCode("A");
        System.out.println("hashCode = " + hashCode1);
        int hashCode2 = hashCode("B");
        int hashCode3 = hashCode("AB");
        System.out.println("hashCode2 = " + hashCode2);
        System.out.println("hashCode3 = " + hashCode3);

        //hashIndex
        int hashCodeA = hashCode1;
        int hashIndex = hashIndex(hashCodeA);
        System.out.println("hashIndex(A) = " + hashIndex);
        System.out.println("hashIndex(B) = " + hashIndex(hashCode("B")));
        System.out.println("hashIndex(AB) = " + hashIndex(hashCode("AB")));

    }

    static int hashCode(String str){
        char[] charArr = str.toCharArray();
        int sum = 0;
        for (char c : charArr) {
            sum += (int)c;
        }
        return sum;
    }

    static int hashIndex(int value){
        return value % CAPACITY;
    }

}
