package commondemos;

import java.util.Arrays;

public class ZerosAndOnes {
    public static void main(String[] args) {
        int[] array={0,1,0,1,0,1,0,1,1};
        int i=0;
        int j=array.length-1;
        int temp;
        while(i<j){
            if(array[i]<array[j]){
                temp=array[i];
                array[i]=array[j];
                array[j]=temp;
                i++;
                j--;
            }else if(array[i]==array[j]){
                if(array[i]==0){
                    j--;
                }else if(array[i]==1){
                    i++;
                }
            }else{
                i++;
                j--;
            }
        }
        Arrays.stream(array).forEach(System.out::println);
    }
}
