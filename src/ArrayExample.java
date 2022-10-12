public class ArrayExample {
    public static void main(String[] args) {

        String lucky []=new String[]{"马里奥","小红","小蓝","路易","耀西","炸弹彬"};
        int index=(int)(Math.random()* lucky.length);
        String formatArg = "本次抽取观众人员：\n\t%1$s\n 恭喜%1$s成为本次观众抽奖的大奖得主。"+
                "\n\n 我们将为%1$s颁发：\n\t过期的酸奶二十箱。";
        String info = String.format(formatArg,lucky[index]);
        System.out.println(info);
        String s = "C:/Program Files/Microsoft Office 15";
    }


}
