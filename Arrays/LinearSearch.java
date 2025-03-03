import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter elements in the array: ");
        for (int i = 0; i < size; i++) { // taking user input
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the element you want to search for: ");
        int target = sc.nextInt(); // element to be searched

        int ans = linearsearch(arr, target); // calling the function

        if (ans != -1) { // printing the target element if found
            System.out.println("Element was found at index: " + ans);
            System.out.println("The element found at index " + ans + " is " + arr[ans]);
        } else {
            System.out.println("Element was not found in the array.");
        }
        sc.close();
    }

    public static int linearsearch(int[] arr, int target) { // creating a method for linear search
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return index; // return the index immediately when found
            }
        }
        return -1; // return -1 if not found
    }
}
