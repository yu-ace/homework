public class ReverseSort {
    public static void main(String[] args) {
        String[] array=new String[]{"12","68","94","82","16","34","14","84","33"};
        int len= array.length;
        for(int i=0;i<len/2;i++){
            String temp=array[i];
            array[i]=array[len-1-i];
            array[len-1-i]=temp;
            for(String string:array) {
                System.out.print(string+" ");
            }
            System.out.print("\n");
        }
    }
}
