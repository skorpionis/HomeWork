package pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Ariec on 09.07.2019.
 */
public class Task6 {

    public static boolean vihDen(Calendar calendar){
        if(calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY||calendar.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
            return true;
        else return false;
    }

    public static boolean belMet(Calendar d, int a){
        if(a<40)
            return false;

        else if (a>60&!vihDen(d))
            return false;

        return true;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        int b = Integer.parseInt(s);
        String [] mas = s.split(" ");
        Calendar cal = GregorianCalendar.getInstance();
        cal.set(Integer.parseInt(mas[2]), Integer.parseInt(mas[1])-1, Integer.parseInt(mas[0]));
        System.out.println(belMet(cal,b));
    }
}