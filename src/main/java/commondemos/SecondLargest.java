package commondemos;

public class SecondLargest {

    public static void main(String[] args) {
        int[] input= {95,9,22,10,42};
        int largest=input[0];
        int secondLargest=0;
        for(int i=1;i<input.length;i++){
            if(input[i]>largest){
                secondLargest=largest;
                largest=input[i];
            }else if(input[i]>secondLargest){
                secondLargest=input[i];
            }
        }
        System.out.println(secondLargest);
    }

}
