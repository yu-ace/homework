public class StringReplace {
    public static void main(String[] args) {
        String searchStr = "你是猪,你是一只猪,你是一只大笨猪";
        String replaceStr ="你";
        String text = "他";
        String newText =text.replace(searchStr,replaceStr);
        System.out.println(newText);
    }



}
