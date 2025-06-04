import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] words = br.readLine().split(" ");

        String word1 = words[0];
        String word2 = words[1];

        if (word1.length() == word2.length()) {
            System.out.println("same");
        } else if (word1.length() > word2.length()) {
            System.out.println(word1 + " " + word1.length());
        } else {
            System.out.println(word2 + " " + word2.length());
        }
    }
}