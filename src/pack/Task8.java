package pack;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Ariec on 09.07.2019.
 */
public class Task8 {

    static class  Student{
        public String Name;
        public String Familia;
        public String FatherName;
        public int Number;
        public int [] Balls = new int[5];
        public int MidlBall;

        public int Midl(){
            int i=0;
            for (int x = 0; x < 5; x++) {
                i+=Balls[x];
            }
            i=i/5;
            return i;
        }
        public static void main(String[] args) {
            Random random = new Random();
            String[] Familia = {"Ara1", "Vasia1", "Ara2", "Vasia2", "Ara3", "Vasia3", "Ara4", "Vasia4", "Ara5", "Vasia5"};
            String[] Name = {"G", "D", "V", "S", "H", "J", "N", "B", "I", "M"};
            Student[] Students = new Student[10];
            for (int y = 0; y < 10; y++) {
                Students[y] = new Student();
            }
            for (int y = 0; y < 10; y++) {
                Students[y].Name = Familia[random.nextInt(9)];
                Students[y].Familia = Name[random.nextInt(9)];
                Students[y].FatherName = Name[random.nextInt(9)];
                Students[y].Number = random.nextInt(9);

                for (int t = 0; t < 5; t++) {
                    Students[y].Balls[t] = random.nextInt(5);
                }
                Students[y].MidlBall = Students[y].Midl();
            }
            System.out.println("Чтобы вывести всех учеников жмите q, если с оценкой 4 и выше то z");
            Scanner sc = new Scanner(System.in);
            while (true) {
                String str = sc.next();
                String str1 = sc.next();

                if ("q".equals(str)) {
                    for (int y = 0; y < 10; y++) {
                        System.out.println("Имя " + Students[y].Name + " " + Students[y].Familia + "." + Students[y].FatherName);
                        System.out.printf("Оценки:\n Математика:{0} \n Язык:{1} \n Литература:{2} \n История:{3} \n География:{5} \n",
                                Students[y].Balls[0], Students[y].Balls[1], Students[y].Balls[2], Students[y].Balls[3], Students[y].Balls[4]);
                        System.out.println("Средний балл: " + Students[y].MidlBall);
                        System.out.println("Группа номер: " + Students[y].Number);
                        System.out.println("");
                    }
                } else if ("z".equals(str1)) {
                    for (int u = 0; u < 10; u++) {
                        if (Students[u].MidlBall >= 4) {
                            System.out.println("Имя  " + Students[u].Name + " " + Students[u].Familia + "." + Students[u].FatherName);
                            System.out.printf("Оценки:\n Математика:{0} \n Язык:{1} \n Литература:{2} \n История:{3} \n География:{5} \n",
                                    Students[u].Balls[0], Students[u].Balls[1], Students[u].Balls[2], Students[u].Balls[3], Students[u].Balls[4]);
                            System.out.println("Средний балл: " + Students[u].MidlBall);
                            System.out.println("Группа номер: " + Students[u].Number);
                            System.out.println("");
                        }
                    }
                }
            }
        }
    }
}


