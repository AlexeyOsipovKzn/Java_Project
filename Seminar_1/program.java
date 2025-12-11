package Java_Project.Seminar_1;

import java.time.LocalTime;
import java.util.Scanner;

// firts step
public class program {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Print your name: ");
        String name = iScanner.nextLine();
        System.out.println(FindTime(name));;
        iScanner.close();

    }

    public static String FindTime(String name) {
        LocalTime time = LocalTime.now();
        if (time.isAfter(LocalTime.of(05, 00)) && time.isBefore(LocalTime.of(11, 59))) {
            return "Morning " + name;
        } else if (time.isAfter(LocalTime.of(12, 00)) && time.isBefore(LocalTime.of(17, 59))) {
            return "Day " + name;
        } else if (time.isAfter(LocalTime.of(18, 00)) && time.isBefore(LocalTime.of(22, 59))) {
            return "Evening " + name;
        } else {
            return "Night " + name;
        }
    }
}