import java.util.Scanner;

public class InputCode {
    public static void main(String[] args) {
        System.out.println("请输入你的身份证号：");
        Scanner scan =new Scanner(System.in);
        String line= scan.nextLine();
        System.out.println("原来你身份证号是"+line.length()+"为数字的啊");
    }
}
