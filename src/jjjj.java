public class jjjj {
    public static void main(String[] args) {
        System.out.println(sinx(3));
    }

    public static double sinx(int x){
        double sum = 0;
         for(int k = 0;k <= 5;k++){
                int m = 2*k +1;
                int a = pow(x,m);
                int b = fact(m);
                int c = pow(-1,k);
                sum = sum + (c*a/(double)b);
        }
        return sum;
    }



    public static int pow (int a,int n){
        int z = 1;
        for(int k = 1;k <= n;k++){
            z = z * a;
        }
        return z;
    }


    public static int fact(int n){
        int z = 1;
        for(int k = 1;k <= n;k++){
            z = z * k;
        }
        return z;
    }

}
