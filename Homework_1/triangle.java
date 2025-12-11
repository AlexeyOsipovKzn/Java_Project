package Java_Project.Homework_1;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); /*
                                            * не знаю что это, но вроде как очищает консоль, с начала действия
                                            * программы)
                                            */
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter the - n number of the triangle-number: ");
        if (inputScanner.hasNextInt()) {
            Integer number = inputScanner.nextInt();
            String res = String.format("the triangular number %d has the form = %d ", number, TriangleNumber(number));
            System.out.println(res);
            inputScanner.close();
        } else {
            System.out.print("\033[H\033[2J");
            System.out.print("Enter the number !! ");
        }

    }

    public static Integer TriangleNumber(Integer numb) {
        Integer Result = numb * (numb + 1) / 2;
        return Result;
    }
}
