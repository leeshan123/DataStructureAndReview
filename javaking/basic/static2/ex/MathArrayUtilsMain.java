package javaking.basic.static2.ex;

public class MathArrayUtilsMain {

    public static void main(String[] args) {
        int[] values = {1,2,3,4,5};
        System.out.println("sum=" + MathArryUtils.sum(values));
        System.out.println("average=" + MathArryUtils.average(values));
        System.out.println("min=" + MathArryUtils.min(values));
        System.out.println("max=" + MathArryUtils.max(values));

    }

    private static class MathArryUtils {

        private MathArryUtils() {
            //인스턴스 생성을 막는다.
        }

        static int sum(int[] values){
            int sum = 0;
            for (int value : values) {
                sum += value;
            }
            return sum;
        }

        public static double average(int[] values) {
            return (double) sum(values) / values.length;
        }


        public static int min(int[] values) {
            int min = values[0];

            for (int value : values) {
                if(min > value){
                    min = value;
                }
            }
            return min;
        }

        public static int max(int[] values) {
            int max = values[0];

            for (int value : values) {
                if(max < value){
                    max = value;
                }
            }
            return max;
        }
    }
}
