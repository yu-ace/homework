public class jihehanshu {
    public static void main (String[] args) {
        System.out.println(ac(0.5));
    }

    public static double ac(double x){
      double sum = 0;
        for(int i = 0;i<= 100;i = i + 1){
            double a = pow (x,i);
            sum = sum + a;
        }
        return sum;
    }

    public static double pow(double x,int n){
        double z = 1;
      for (int k =1;k<= n;k++){
           z = z * x;
      }
      return z;
    }













}

