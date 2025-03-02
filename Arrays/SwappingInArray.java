import java.util.Arrays;
public class SwappingInArray{
    public static void main(String[] args){
        int[] arr = {1, 4, 6, 6, 96, 25, 642, 730};
        swap(arr, 0, 3);
        System.out.print(Arrays.toString(arr));
    }
    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}