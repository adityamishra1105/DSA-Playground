import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before Insertion Sort: " + Arrays.toString(arr));
        intsertionsort(arr);
        System.out.println("Array after Insertion Sort: " + Arrays.toString(arr));
        sc.close();
    }
    public static void intsertionsort(int[] arr){
        int n =arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j -1;
            }
            arr[j + 1] = key;
        }
    }
}

