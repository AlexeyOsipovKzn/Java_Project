package Homework_3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class arrayList {
    public static ArrayList<Integer> list = new ArrayList<>();
    public static Scanner scan = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        System.out.print("Введите размер ArrayList: ");

        int number = scan.nextInt();

        System.out.print("Ваш список случайных чисел размера: " + number + " => " + createRandomArrayList(number) + "\n");

        minMaxAverageArrayList();
    }

    public static ArrayList<Integer> createRandomArrayList(Integer num) {
        int random = rand.nextInt(31);

        for (int i = 0; i < num; i++) {
            list.add(random);
            random = rand.nextInt(31);
        }
        return list;
    }

    public static void minMaxAverageArrayList() {
        int min = list.get(0);
        int max = list.get(0);
        double average = 0;

        for (int i : list) {
            average += i;
           if (i < min) min = i;
           if (i > max) max = i;
        }

        average /= list.size();

        System.out.println("Минимум = " + min + "\n" + "Максимум = " + max + "\n" + "Среднее = " + average);

    }
}
