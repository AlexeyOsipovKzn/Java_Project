package Java_Project.Homework_1;

import java.util.Scanner;

public class calc {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Integer number1 = getInt();
        Integer number2 = getInt();
        Character operation = getOperation();
        Integer result = calc(number1, number2, operation);
        System.out.println("Result of calculation : " + result);
    }

    public static Integer getInt() {
        System.out.print("Enter Number: ");
        Integer num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Error, try again .");
            scanner.next();
            num = getInt();
        }
        return num;
    }

    public static Character getOperation() {
        System.out.print("Enter Action: ");
        Character operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Error, try again.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static Integer calc(Integer num1, Integer num2, Character operation) {
        Integer result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0 || (num1 == 0 && num2 == 0)) {
                    System.out.println("Undefined");
                    result = null;
                    break;
                } else {
                    result = num1 / num2;
                    break;
                }
            default:
                System.out.println("Error, try again.");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }
}
