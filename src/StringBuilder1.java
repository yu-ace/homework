public class StringBuilder1 {
    public static void main(String[] args) {
        String appendStr="";
        long startTime = System.nanoTime();
        for(int i=20000;i<50000;i++){
            appendStr+=(char)i;
        }
        long endTime = System.nanoTime();
        System.out.println("String追加字符3万个。");

        System.out.println("用时："+(endTime-startTime)/1000000d+"毫秒");

        StringBuilder strBuilder = new StringBuilder();
        startTime = System.nanoTime();
        for(int i =20000;i<50000;i++){
            strBuilder.append((char)i);
        }
        endTime = System.nanoTime();
        System.out.println("字符串构建器追加字符3万个.");
        System.out.print("用时："+(endTime-startTime)/1000000d+"毫秒");
    }
}
