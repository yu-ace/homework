import java.sql.SQLOutput;

public class TypeConversion {
    public static void main(String[] args) {
        long a1 = 0x57;
        long b1 = 0x4e20;
        long s2 =  a1 ^ b1;
        byte b =127;
        char c ='W';
        short s = 23561;
        int i = 3333;
        long l = 400000L;
        float f = 3.14159F;
        double d = 54.523;
        System.out.println("累加 byte 等于："+b);
        System.out.println("累加 char 等于："+(b+c));
        System.out.println("累加 short 等于："+(b+c+s));
        System.out.println("累加 int 等于："+(b+c+s+i));
        System.out.println("累加 long 等于："+(b+c+s+i+l));
        System.out.println("累加 float 等于："+(b+c+s+i+l+f));
        System.out.println("累加 double 等于："+(b+c+s+i+l+f+d));
        System.out.println("把long强制类型转换为int："+(int)l);
        System.out.println("把long强制类型转换为short："+(short)l);
        System.out.println("把double强制类型转换为int："+(int)d);
        System.out.println("把short强制类型转换为char："+(char)s);



    }


}
