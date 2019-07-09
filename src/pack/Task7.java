package pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

/**
 * Created by Ariec on 09.07.2019.
 */
public class Task7 {
    public static void main(String[] args) throws IOException {
        System.out.println(speed(240));
    }

    public static int speed(int speed) throws IOException {
        int speed1=60;
        int speed2=80;
        Calendar calendar = GregorianCalendar.getInstance();
        Calendar calendar1 = GregorianCalendar.getInstance();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        Random r = new Random();
        int god = 1980+r.nextInt(40);
        int mes = r.nextInt(12);
        int day=0;
        DateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
        if (mes==1&&VisokocniyYear(god))
            day = r.nextInt(29)+1;
        calendar.set(god,mes,day);
        System.out.println("Tekushaya data " + dateFormat.format(calendar.getTime()));

        String[] arr = s.split(" ");
        calendar1.set(Integer.parseInt(arr[2]), Integer.parseInt(arr[1]) - 1, Integer.parseInt(arr[0]));
        ////
        if(calendar.get(Calendar.DAY_OF_MONTH)==calendar1.get(Calendar.DAY_OF_MONTH)&&calendar.get(Calendar.MONTH)==calendar1.get(Calendar.MONTH)){
            speed1=speed1 + 5;
            speed2=speed2 + 5;
        }if(speed<=speed1){
            return 0;
        }else if(speed>speed1&&speed<=speed2){
            return 1;
        }else return 2;
    }

    public static boolean VisokocniyYear(int god){
        if (god % 4 == 0) return false;{
            if ((god % 100 != 0) || (god % 400 == 0)) {
                System.out.println("високосный");
                return true;
            }else  return false;
        }
    }



}
