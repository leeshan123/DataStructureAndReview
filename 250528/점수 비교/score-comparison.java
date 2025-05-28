import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line1 = br.readLine();
        String[] nums = line1.split(" ");
        int aMath = Integer.parseInt(nums[0]);
        int aEng = Integer.parseInt(nums[1]);

        String line2 = br.readLine();
        String[] nums2 = line2.split(" ");
        int bMath = Integer.parseInt(nums2[0]);
        int bEng = Integer.parseInt(nums2[1]);

        if(aMath > bMath && aEng > bEng){
            System.out.println(1);
        }else System.out.println(0);
    


    }
}