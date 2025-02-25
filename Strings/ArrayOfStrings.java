//This program will take n number of strings as input and would return them in an Array
//array of objects (String Type)
package Strings;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfStrings {
    public static void main(String[] args){
        String[] str = new String[5];
        final Scanner sc = new Scanner(System.in);
        for(int i = 0; i < str.length; i++){
            str[i] = sc.next();
        }
        System.out.print(Arrays.toString(str));
        sc.close();
    }
    
}
