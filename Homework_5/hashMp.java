import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class hashMp {
    static public HashMap<String, List<String>> list = new HashMap<>();
    static public Scanner scaner = new Scanner(System.in);

    public static void main(String[] args) {
        addPhoneAndNames();
        System.out.print("Enter the name you want to search:");
        String input = scaner.nextLine();
        findInList(input);

        scaner.close();
    }

    public static void findInList(String name) {
        System.out.printf("%s = > %s", name, list.get(name));
    }

    public static void addPhoneAndNames() {
        //Кол-во в книге имен с телефонами 
        Integer count = 10;

        for (int i = 0; i < 1; i++) {
            System.out.printf("Enter your full name: ");
            String inputName = scaner.nextLine();
            System.out.printf("Enter your phone number(if there is a second number then enter it with space): ");
            String inputNumb = scaner.nextLine();
            String[] array = inputNumb.split(" ");
            list.put(inputName, List.of(array[0], array[1]));
        }
    }
}
