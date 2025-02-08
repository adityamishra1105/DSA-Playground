import java.util.Scanner;

public class LinearSearch{
    /**
     * @param args
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int sum = 0;
        int[] arr = new int[size];
        System.out.println("Enter elements in the array: ");
        for(int i = 0; i < size; i++){                   // taking user input
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("Enter the element you want to search for: ");
        int target = sc.nextInt();                      // elment to be searched
        int ans = linearsearch(arr, target);            //calling the function
        if(ans != -1){                                  //printing the target element if found
            System.out.println("Element was found at index: " + ans);
            System.out.println("The element found at index " + ans + " is " + arr[ans]);
        }
        else{
            System.out.println("Element was not found in the array.");
        }
        System.out.println("Sum of the element of the array is: "+sum);
    }
    public static int linearsearch(int[] arr, int target){        //creating a method for linear search
        if(arr.length == 0){
            return -1;
        }
        for(int index = 0; index < arr.length; index++){
            int element = arr[index];
            if( target == element){
                return index;
            }
        }
    return -1;

    }
    @Override
    public String toString() {
        return "LinearSearch []";
    }
    sc.close();
}