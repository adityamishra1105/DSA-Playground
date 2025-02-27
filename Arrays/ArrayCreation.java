import java.util.Scanner;
import java.util.Arrays;
public class ArrayCreation {
    /**
     * @param args
     */
    public static void main(String[] args){
        System.out.print("Enter the length of the Array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        // Populate the array with user input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); // Read each element of the array
        }
        // Print the array using a traditional for loop
        System.out.print("Output of Array using a traditional for loop: ");
        for (int i = 0; i < arr.length; i++) { // Traditional for loop to iterate through the array
            System.out.print(arr[i] + " "); // Print each element
        }
        System.out.println();
        // Print the array using an enhanced for loop
        System.out.print("Output of Array using an enhanced for loop: ");
        for (int num : arr) { // Enhanced for loop (foreach loop) for iterating through the array
            System.out.print(num + " "); // Print each element
        }
        System.out.println();
        // Print the array using the built-in Arrays.toString() method
        System.out.print("Output of Array using prebuilt function: ");
        System.out.print(Arrays.toString(arr)); // Uses Arrays.toString to get a string representation of the array
        sc.close(); // Close the Scanner object to release resources
    }
}