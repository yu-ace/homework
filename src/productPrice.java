import java.util.Scanner;

public class productPrice {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("请输入您的金额：");
        double money= scan.nextDouble();
        String rebate="";
        if(money>200){
            int grade= (int) (money/200);
            switch(grade){
                case 1:
                    rebate="九五折";
                    break;
                case 2:
                    rebate="九折";
                    break;
                case 3:
                    rebate="八五折";
                    break;
                case 4:
                    rebate="八三折";
                    break;
                case 5:
                    rebate="八折";
                    break;
                case 6:
                    rebate="七五折";
                    break;
                default:
                    rebate="七折";
            }
            System.out.println("您的累计金额为："+money);
            System.out.println("您将享受"+rebate+"优惠！");
        }else {
            System.out.println("您的累计金额为："+money);
            System.out.println("您太穷了，快点多花点钱吧！");
        }

    }

}
