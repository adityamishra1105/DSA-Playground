import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Rows in the Array: ");
        int n = sc.nextInt();            // Number of Rows in 2D array
        System.out.print("Enter the number of Columns in the Array: ");
        int m = sc.nextInt();            // Number of Columns in 2D array
        int[][] arr = new int[n][m];     // Initializing the array

        System.out.print("Enter the elements inside the Array: ");
        // For taking the input, we'll run two For loops
        // the first For loop iterates for number of rows and second iterates for number of columns
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();     // Taking input from the user
            }
        }

        // Printing the Array
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        sc.close();
    }
}