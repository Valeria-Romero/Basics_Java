import java.util.ArrayList;

public class Basics{

    // Print 1-255
    public static void printNumbers(int number){
        for(int i = 0; i < number + 1; i++) {
            System.out.println(i);
        }
    }

    // Print odd numbers between 1-255
    public static void printOddNumbers(int number){
        for(int i=0; i<= number; i++){
            if( i%2 == 1){
                System.out.println(i);
            }
        }
    }

    // Sigma of 255 AKA Sum to 255
    public static int sumOfNumbers(int number){
        int sum = 0;
        for(int i=0; i<= number; i++){
            sum = sum + i;
        }
        return sum;
    }

    // Iterating through an array
    public static void iterateArray(int arr[]){

        for( int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    // Find Max
    public static void findMaxValue(int maxNumber[]){
        int num = maxNumber[0];
        for(int i=0; i<maxNumber.length; i++){
            if(maxNumber[i]> num){
                num = maxNumber[i];
            }
        }
        System.out.println(num);
    }

    // Array with Odd Numbers 
    public static void arrayOfOdds(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i =0; i<=255; i++){
            if(i%2==1){
                list.add(i);
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        printNumbers(255);
        printOddNumbers(255);
        System.out.println(sumOfNumbers(255)); 
        int nums[] = {1, 10, 2, 20, 3, 30};
        iterateArray(nums);
        int arr[]= {-1,0,2,8,-17,5};
        findMaxValue(arr);
        arrayOfOdds();
    }
}