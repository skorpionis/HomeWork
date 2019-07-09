package pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ariec on 09.07.2019.
 */
public class Task5 {

    public static boolean inArr(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        int sum1=0;
        for (int i = arr.length-1; i >0 ; i--) {
            sum1+=arr[i];
            sum-=arr[i];
            if (sum==sum1){
                for (int j = 0; j < i; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
                for (int j = i; j < arr.length; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
                System.out.println("Сумма1 = " + sum + " " + "Сумма2 = " + sum1);
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) throws IOException {


        int[] a = {1,0,0,1};
        System.out.println(inArr(a));

    }
}