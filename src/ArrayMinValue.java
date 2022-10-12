import javax.swing.*;
import java.util.Scanner;

public class ArrayMinValue {
    public static void main(String[] args) {
        String arrayStr[]=new String[]{"12","26","4","84","45","32","68"};
        int [] numArray = new int[arrayStr.length];
        for(int i = 0;i< numArray.length;i++){
            numArray[i]= Integer.valueOf(arrayStr[i]);
        }
        int min = numArray[0];
        for(int j = 0;j< numArray.length;j++){
            if(min>numArray[j]){
                min = numArray[j];
            }
        }
        System.out.println("数组中最小的数是："+min);

    }
}
