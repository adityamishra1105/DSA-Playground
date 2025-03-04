// Java program for Binary Search
package Searching;
import java.util.Arrays;
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 63, 66, 73, 6, 74, 742, 54, 89, 11};
        int target = 11;
        Arrays.sort(arr); //binary search req the array to be sorted.. this function sorts the give array.
        int ans = binarysearch(arr, target);
        System.out.println(ans);

    }
    // return the index
    // return -1 if doesnt exist
    public static int binarysearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
        // int mid = (start + end) / 2; it will give error for larger no if the range of int is exceeded.. what we can do is given below
        int mid = start + (end - start) / 2;
        if(target < arr[mid]){
            end = mid -1;
        }
        else if (target > arr[mid]) {
            start = mid + 1;
        }
        else{
            return mid;
        }
        }
        return -1;
    }
    @Override
    public String toString() {
        return "BinarySearch []";
    }
}