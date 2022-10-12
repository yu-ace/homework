public class Random {
    public static void main(String[] args) {
        int array[]=new int[]{55,16,94,106,5,87,22,3};
        int index;
        for(int i=1;i< array.length;i++){
            index = 0;
            for(int j =1;j<= array.length-i;j++){
                if(array[j]>array[index]){
                    index = j;
                }
            }
            int temp=array[array.length-i];
            array[array.length-i]=array[index];
            array[index]=temp;
        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
