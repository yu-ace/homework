public class cf {

    public static void main(String[] args) {
        int a = 2;

        int b = a % 2 ;
        if(a==0){
            System.out.println("0既不是奇数也不是偶数");
        }else if(b == 0){
            System.out.println("a是偶数");
        }else{
            System.out.println("a是奇数");
        }


        // 求pi
        double sum = 0;
        int f = -1;
        for (int i = 1; i <= 100000; i = i + 1) {
            if (i % 2 == 1) {
                f = -1 * f;
                sum = sum + f*(1/(double)i);
            }
        }
        System.out.println(sum*4);

        // 素数
        for(int j = 2 ; j <= 1000 ;j++){
            if(isSusu(j)== true){
                System.out.println(j+"是素数");
            }
        }

    }

    public static int pow(int x ,int n ){
        int z = 1;
        for(int k = 1 ; k <=n ;k++){
            z = z * x;
        }
        return z;
    }

    public static boolean isSusu(int c){
        for(int d = 2 ; d < c;d=d+1){
            if(c%d == 0){
                return false;
            }
            if(d == (c-1)){
                return true;
            }
        }
        return false;
    }
}
