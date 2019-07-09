package pack;

/**
 * Created by Ariec on 09.07.2019.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Task4 {

    private static Integer[] arr;

    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr1;
        int[] arr2;
        while(true) {
            String s = reader.readLine();

            int sch = Integer.parseInt(s);
            if (sch < 4) {
                continue;
            }
            arr1 = new int[sch];
            String[] s1 = reader.readLine().split(" ");
            if(s1.length!=sch){
                System.out.println("Error");
                continue;
            }
            for (int i = 0; i < sch; i++) {
                arr1[i] = Integer.parseInt(s1[i]);
            }
            break;
        }
        while(true){
            int sch1 = Integer.parseInt(reader.readLine());
            if (sch1<4){
                continue;
            }
            arr2 = new int[sch1];
            String[] s2 = reader.readLine().split(" ");
            if(s2.length!=sch1){
                System.out.println("Error again");
                continue;
            }
            for(int i=0; i<sch1; i++){
                arr2[i]=Integer.parseInt(s2[i]);
            }
            break;
        }
        reader.close();

        set(arr1, arr2);
        System.out.println("Result" + Arrays.toString(getM()));
    }

    public static Integer[] getM(){
        return arr;
    }

    public static void set(int[] x, int[] y){
        int pol1 = 0;
        int pol2 = 0;

        if (x.length%2==0){
            pol1=x.length/2;
        }
        else pol1=x.length/2+1;

        if (y.length%2==0){
            pol2=y.length/2;
        }
        else pol2=y.length/2+1;

        arr = new Integer[pol1 + pol2];
        int result = 0;
        for(int i = (x.length-pol1)/2; i<(x.length+pol1)/2; i++) {
            arr[result++] = x[i];
        }
        for(int i = (y.length-pol2)/2; i<(y.length+pol2)/2; i++) {
            arr[result++] = y[i];
        }

        Random random = new Random();
        Arrays.sort(arr, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return random.nextInt(3)-1;
            }
        });
    }
}