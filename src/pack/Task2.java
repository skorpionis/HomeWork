package pack;

import java.util.Random;

/**
 * Created by Ariec on 09.07.2019.
 */
public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 4; i++) {
            int s1 = random.nextInt(9);
            System.out.print(s1);
        }
        for (int i = 0; i < 2; i++) {
            char c = (char) (random.nextInt(26) + 'a');
            System.out.print(c);
        }

        while (true) {
            StringBuilder temp = new StringBuilder();
            for (int j = 0; j < 4; j++) {
                temp.append(random.nextInt(2));
            }
            if (temp.toString().contains("1")) {
                System.out.println(temp);
                break;
            }
        }
    }
}
