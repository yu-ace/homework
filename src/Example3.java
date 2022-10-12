import java.math.BigDecimal;

public class Example3 {
    public static void main(String[] args) {
        BigDecimal sum=new BigDecimal(0.0);
        BigDecimal factorial=new BigDecimal(1.0);
        int i =1;
        while(i<=20){
            sum=sum.add(factorial);
            i++;
            factorial=factorial.multiply(new BigDecimal(1.0/i));
        }
        System.out.println("1+1/2!+1/3!+1/4!···1/20!的计算结果等于：\n"+sum);
    }
}
