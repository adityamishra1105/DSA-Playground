import java.util.Arrays;
import java.util.Scanner;
public class ReverseArray{
    /**
     * @param args
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements inside the Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter index one: ");
        int index1 = sc.nextInt();
        System.out.print("Enter index two: ");
        int index2 = sc.nextInt();

        swap(arr, index1, index2);
        System.out.println("Array before reversal" + Arrays.toString(arr));
        reverse(arr);
        System.out.print("Array before reversal" + Arrays.toString(arr));

        sc.close();
        
    }
    static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}