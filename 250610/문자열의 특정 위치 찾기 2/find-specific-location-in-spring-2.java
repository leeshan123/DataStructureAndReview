import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] fruits = {"apple", "banana", "grape", "blueberry", "orange"};

        char ch = br.readLine().charAt(0); // 문자 하나 입력받기
        int count = 0;

        for (String fruit : fruits) {
            // 길이가 3 이상인지 확인한 후, 세 번째 또는 네 번째 문자 검사
            boolean match = 
                (fruit.length() >= 3 && fruit.charAt(2) == ch) || 
                (fruit.length() >= 4 && fruit.charAt(3) == ch);

            if (match) {
                System.out.println(fruit);
                count++;
            }
        }

        System.out.println(count);
    }
}