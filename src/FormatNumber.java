import javax.swing.*;
import java.awt.font.NumericShaper;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class FormatNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入一个数字: ");
        double number=scan.nextDouble();
        System.out.println("该数字用Locale类的以下常量作为格式对象的构造参数，将获得不同的货币格式：");
        NumberFormat format= NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println("Locale.CHINA:"+format.format(number));
        format = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("Locale.US:"+format.format(number));
        format = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
        System.out.println("Locale.ENGLISH:"+format.format(number));
        format = NumberFormat.getCurrencyInstance(Locale.TAIWAN);
        System.out.println("Locale.TAIWAN:"+format.format(number));

    }
}
