import java.util.Scanner;

public class re {
    public static void main(String[] args) {
        String a = "awe";
        a.indexOf("a" );
        Scanner scan =new Scanner(System.in);
        System.out.println("输入数字");
        String s = scan.nextLine();
        boolean isnum = re.isNumber(s);
        if(isnum){
            System.out.println("null"+"输入正确，是数字格式");
        }else{
            System.out.println("null"+"输入错误，请确认格式");
        }
    }

    private static boolean isNumber(String str) {
        String mask = "0123456789";
        char[] chars =str.toCharArray();
        for(int i=1;i<chars.length;i++){
            for(int j=1;j<chars.length;j++){
                if(mask.indexOf(String.valueOf(chars[j]))==-1){
                    return false;
                }else{
                    continue;
                }
            }
        }return true;
    }
}