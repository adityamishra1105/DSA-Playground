import java.util.Scanner;
public class MaxValueInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 4, 7, 3, 87, 35};
        int start = 1;
        int end = 3;
        System.out.println("Max in full array: " + max(arr)); // Prints max in the full array
        System.out.println("Max in range (" + start + ", " + end + "): " + maxrange(arr, start, end)); // Prints max in the range
    }

    // Method to find the max value in the whole array
    public static int max(int[] arr) {
        int max = arr[0]; // Assuming the first element is the max
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if a larger element is found
            }
        }
        return max; // Return the max value found
    }

    // Method to find the max value in a specific range of indices in the array
    public static int maxrange(int[] arr, int start, int end) {
        int max = arr[start]; // Set the initial max to the start index
        for (int i = start; i <= end; i++) { // Ensure the loop includes the element at the end index
            if (arr[i] > max) {
                max = arr[i]; // Update max if a larger element is found
            }
        }
        return max; // Return the max value in the range
    }
}
