package Java_Project.Homework_1;

import java.util.Scanner;

public class equation {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.println("Задано уравнение вида a + b = c");
        RandomEquation();

    }

    public static void RandomEquation() {
        Integer w = 11 + (int) (Math.random() * 41);
        Integer q = 11 + (int) (Math.random() * 41);

        String x = Integer.toString(w);
        String y = Integer.toString(q);

        var ax = new StringBuilder(x);
        var bx = new StringBuilder(y);

        ax.setCharAt(1, '?');
        ax.toString();
        bx.setCharAt(0, '?');
        bx.toString();

        System.out.printf("%s + %s = %d \n", ax, bx, w + q);
        System.out.print("Чему должно равняться число \'a\': ");
        Integer num1 = getInt();
        System.out.print("Чему должно равняться число \'b\': ");
        Integer num2 = getInt();

        if (num1 == w && num2 == q) {
            System.out.println("Верно!");
        } else {
            System.out.print("Не правильно");
            
        }
    }

    public static Integer getInt() {
        Integer num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Ошибка, введите число ! .");
            scanner.next();
            num = getInt();
        }
        return num;
    }


}
