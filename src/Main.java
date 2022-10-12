public class Main {
    public static void main(String[] args) {

        System.out.println(sinx(3));
    }
    public static double sinx(int x){
        double sum = 0;
        int f = -1;


        for (int i =1;i<=10;i = i + 1){
            if (i % 2 ==1){
                f = -1 *f;
                int s = pow(x,i);
                int c = fact(i);

                sum =sum + f*(s/(double)c);
            }
        }
        return sum;
    }


        public static int pow ( int x, int n ){
            int z = 1;
            for (int k = 1; k <= n; k++) {
                z = z * x;
            }
            return z;
        }


        public static int fact(int n ){
            int z = 1;
            for (int k = 1; k <= n; k++) {
                z = z * k;
            }
            return z;
        }







}
