import java.util.regex.Pattern;

public class ChineseAmount {
    public static void main(String[] args) {
        String text = "你是猪";
        int amount = 0;
        for(int i=0;i<text.length();i++){
            Boolean matches = Pattern.matches("^[\u4E00-\u9FA5]{0,}$",text.charAt(i)+"");
            if(matches){
                amount++;
            }
        }
        System.out.println(amount+"");
    }
}
