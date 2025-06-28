import java.util.Scanner;

public class KadanesAlgo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        System.out.println(kadanes(arr));


    }

    static int kadanes(int[] arr){
        // we also have an sol for this which is descripted below

        // int max = arr[0];
        // int curr = 0;
        // for(int n : arr){
        //      curr = Math.max(, curr + n);
        //      max = Math.max(max, curr);
        //}
        // return max;



        // Optimized solution
        int n = arr.length;
        int max = arr[0];
        int curr = 0;

        for (int i = 0; i < n; i++) {
            if (curr + arr[i] > arr[i]) {
                curr = curr + arr[i];
            } else {
                curr = arr[i];
            }
        }
        if (max < curr) {
            max = curr;
        } 
        return max;
    }
}