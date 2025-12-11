package Homework_4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class queueue {
    public static String[] str = { "meow", "wow", "yee", "what", "like" };
    public static LinkedList<String> word = new LinkedList<>(Arrays.asList(str));
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String input = scan.next();

        System.out.println(enqueue(input));

        System.out.println(dequeue());

        System.out.println(first());
    }

    public static LinkedList<String> enqueue(String elem) {
        word.addLast(elem);

        System.out.printf("Элемент %s был помещен в конец очереди", elem);

        return word;
    }

    public static LinkedList<String> dequeue() {
        System.out.printf("Удаленный элемент: %s ", word.getFirst());

        word.removeFirst();

        return word;
    }

    public static LinkedList<String> first() {
        System.out.printf("Первый элемент очереди: %s", word.getFirst());

        return word;
    }
}
