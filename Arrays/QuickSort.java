import java.util.Arrays;
import java.util.Scanner;
public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        
        // Reading elements into the array
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        
        // Printing the array before sorting
        System.out.print("Array before Quick Sort: " + Arrays.toString(array));
        System.out.println();

        // Sorting the array using QuickSort
        quicksort(array, 0, array.length - 1);
        
        // Printing the array after sorting
        System.out.print("Array after Quick Sort: " + Arrays.toString(array));
        System.out.println();
        
        sc.close();
    }

    // QuickSort function
    public static void quicksort(int[] array, int low, int high){
        if (low < high) {
            // Partitioning the array and getting the pivot index
            int pi = partition(array, low, high);

            // Recursively sorting the two halves
            quicksort(array, low, pi - 1);
            quicksort(array, pi + 1, high);
        }
    }

    // Partitioning function to place pivot at correct position
    public static int partition(int[] array, int low, int high){
        // Taking the last element as pivot
        int pivot = array[high];
        int i = (low - 1);

        // Rearranging elements based on the pivot
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                // Swapping elements
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swapping the pivot to its correct position
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // Returning the pivot index
        return i + 1;
    }
}
