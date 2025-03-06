import java.util.Arrays;
import java.util.Scanner;
public class SwappingInArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        // Taking the length of the Array from the user
        System.out.print("Enter the length of the Array: ");
        int n = sc.nextInt();

        // Initialising the Array
        int[] arr = new int[n]; 
        System.out.println("Enter elements inside the Array: ");

        // Taking input from the user 
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the index of numbers you want to Swap: ");
        System.out.print("Enter number 1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int n2 = sc.nextInt();
        swap(arr, n1, n2);
        System.out.print("Array after Swapping is: " + Arrays.toString(arr));

        sc.close();
    }
    // Creating a temporary variable to swap
    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}