// two dimensional array
import java.util.Scanner;
import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args){
        /* it will look like this: first [] is rows, second [] is columns.. necessary to add no of rows.. check arr2d.
         * 123 
         * 456  
         * 789
         */ 
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        // int[][] arr2d = {
        //     {1, 2, 3},         //0th index
        //     {4, 5},            //1st index
        //     {6, 7, 8, 9}       //2nd index
        for(int row = 0; row < arr.length; row++){ //input
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = sc.nextInt();

            }
        }
        System.out.println("Traditional for loop answer: ");
        for(int row = 0; row < arr.length; row++){              //output, traditional loop
            for(int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
        };
        System.out.println();
        
        
        }
        System.out.println("Enhanced for loop answer: ");
    
        for(int[] a : arr){                                       //output, enhanced for loop
            System.out.println(Arrays.toString(a));
        }
        System.out.println("Best method answer: ");
        for(int row = 0; row < arr.length; row++){                //output, best method
            System.out.println(Arrays.toString(arr[row]));
        }

        sc.close();
}
}