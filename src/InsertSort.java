public class InsertSort {
    public static void main(String[] args) {
        int array[]=new int[]{12,1,94,82,16,34,14,84,33};
        int tmp;
        int j;
        for(int i=0;i<array.length;i++){
            tmp=array[i];
            for(j=i-1;j>=0&&array[j]>tmp;j--){
                array[j+1]=array[j];
            }
            array[j+1]=tmp;
        }
        for(int i = 0;i< array.length;i++){
            System.out.print(array[i]+"\n");
        }
    }


}
