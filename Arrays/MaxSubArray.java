/*
Kadane's Algorithm is used to find the maximum sum subarray within a one-dimensional array of numbers. 
In other words, it helps you find the contiguous subarray (a sequence of consecutive elements) that has the largest sum.
 */

 import java.util.Scanner;

import org.xml.sax.SAXException;

public class MaxSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int maxSum = MaxSubArraySum(nums);
        System.out.println("Maximum contiguous sum is:" + maxSum);

    }
    public static int MaxSubArraySum(int[] nums){
        int maxCurrent = nums[0];
        int maxGlobal = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxCurrent = Math.max(nums[i], maxCurrent + nums[i]);
            if (maxCurrent > maxGlobal) {
                maxGlobal = maxCurrent;
            }
        }
        return maxGlobal;
    }
}
