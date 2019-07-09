package pack;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Ariec on 09.07.2019.
 */
public class Task3 {

    public static void asd(String s){

        List<String> arr = Arrays.asList(s.split("\\s+"));
        arr.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });
        System.out.println(arr.size());
        for (String str : arr){
            System.out.println(s);
        }

    }
    public static void main(String[] args) {
        asd("к цк цук цк цкцук");
    }

}