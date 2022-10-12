public class new1 {
    public static void main (String[] args) {
        System.out.println(fact(-2));
        System.out.println(exp(1));
    }


    public  static double exp(int x){
        double sum = 0;
        for (int i =0;i<= 10;i = i + 1){
            int a = pow (x,i );
            int b = fact (i);

            sum = sum  + (a/(double)b);
        }
        return sum;
    }

    public static int fact (int n){
        if(n==0){
            return 1;
        }
        if(n <= 0){
           return -1;
        }
        int z = 1;
        for (int k =1;k<= n;k++){
            z = z * k;
        }
        return z;
    }

    public static int pow (int x,int n){
        if(n==0){
            return 1;
        }
        int z = 1;
        for (int k =1;k<= n;k++){
            z = z * x;
        }
        return z;
    }

}
