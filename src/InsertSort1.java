import java.util.Arrays;

public class InsertSort1 {
    public static void main(String[] args) {
        String[]arrayStr = new String[]{"12","68","94","82","16","34","14","84","33"};
        int array[]=new int[arrayStr.length];
        for(int i=0;i< array.length;i++){
            array[i]=Integer.parseInt(arrayStr[i]);
        }
        System.out.println("\n");
        Arrays.sort(array);
        System.out.println("数组排序后的内容：\n");
        for(int value : array){
            System.out.print(value+"   ");
        }
    }



}
