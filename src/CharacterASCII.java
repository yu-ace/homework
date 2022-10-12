import org.w3c.dom.ls.LSOutput;

public class CharacterASCII {
    public static void main(String[] args) {
        String text =("a");
        char[] charArray=text.toCharArray();
        StringBuilder builder = new StringBuilder();
        for(char c : charArray){
            builder.append((int)c+"");
        }
        System.out.println(builder.toString());

        Number value = 99;
        long code = value.longValue();
        System.out.println(((char)code)+"");
    }
}
