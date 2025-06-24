import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class MatrixReader {
    public static void main(String[] args) throws IOException {
        // BufferedReader 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 3x3 정수 배열 선언
        int[][] matrix1 = new int[3][3];

        // 3개의 줄에 걸쳐 입력을 받음
        for (int i = 0; i < 3; i++) {
            // 한 줄을 읽고 공백을 기준으로 문자열을 분리하기 위해 StringTokenizer 사용
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                // 다음 토큰(숫자 문자열)을 가져와 정수로 변환하여 행렬에 저장
                matrix1[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] matrix2 = new int[3][3];

        // 3개의 줄에 걸쳐 입력을 받음
        for (int i = 0; i < 3; i++) {
            // 한 줄을 읽고 공백을 기준으로 문자열을 분리하기 위해 StringTokenizer 사용
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                // 다음 토큰(숫자 문자열)을 가져와 정수로 변환하여 행렬에 저장
                matrix2[i][j] = Integer.parseInt(st.nextToken());
            }
        }

         // 3개의 줄에 걸쳐 입력을 받음
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               System.out.print(matrix1[i][j] * matrix2[i][j] + " ");
            }
            System.out.println();
        }
    }
}