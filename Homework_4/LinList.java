package Homework_4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinList {
    public static String[] str = { "meow", "wow", "yee", "what", "like" };
    public static List<String> word = new LinkedList<>(Arrays.asList(str));

    public static void main(String[] args) {
        System.out.printf("Первоначальный LinkedList: %s\n", word);
        System.out.printf("Перевернутый LinkedList: %s", reversLinkedList(word));

        reversLinkedList(word);
    }

    public static<T> List<T> reversLinkedList(List<T> list) {
        List<T> reverse = new LinkedList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            reverse.add(list.get(i));
        }
        return reverse;
    }
}
