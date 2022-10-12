import java.util.Scanner;

public class matches {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
        System.out.println("请输入需要计算的数字");
       int number = scan.nextInt();
        System.out.println("转换后的数字为:\n"+number*number+"");
    }
}
