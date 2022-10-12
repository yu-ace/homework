public class hanshu {
    public static void main(String[] args) {
        double sinh = Math.sinh(5);
        System.out.println(sinh);
        System.out.println(sinh(5));
    }

    public static double sinh(int x){
        double sum = 0;
        double sum2 = 0;
        for (int k = 0;k <= 5;k++){
            int a = pow(-1,k);
            int b = fact(2*k);
            double c = pow(x,2*k+1);
            int d = pow(4,k);
            int e = fact(k);
            int f = pow(e,2);
            int g = 2 * k + 1;
            sum = sum + ((a*b*c) / ((double)d*f*g));

            sum2 = sum2 +
                (
                        (pow(-1, k) * fact(2 * k) * pow(x, 2 * k + 1))
                                /
                                ((double) pow(4, k) * pow(fact(k), 2) * (2 * k + 1))
                );
            System.out.println(2);
        }


        return sum;
    }




    public static int fact (int n){
        int z = 1;
        for(int k = 1;k <= n;k++){
            z = z * k;
        }
        return z;
    }




    public static int pow(int a, int n){
        int z = 1;
        for(int k = 1;k <= n;k++){
            z = z * a;
        }
        return z;
    }

}
