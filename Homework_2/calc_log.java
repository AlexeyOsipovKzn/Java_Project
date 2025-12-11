import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;
import java.io.IOException;
import java.util.Scanner;

public class calc_log {
    static Scanner scanner = new Scanner(System.in);
    static Logger logger = Logger.getLogger(calc_log.class.getName());
    static XMLFormatter xml = new XMLFormatter();

    public static void main(String[] args) throws IOException, SecurityException{
        System.out.print("\033[H\033[2J");
        Double number1 = getNum();
        Double number2 = getNum();
        Character operation = getOperation();
        Double result = calc(number1, number2, operation);

        FileHandler info = new FileHandler("calc_log.xml");
        logger.addHandler(info);

        info.setFormatter(xml);
        // проверка на выводимый тип данных
        if (result - Math.floor(result) > 0) {
            System.out.printf("Result of calculation : %.4f\n ", result);
            System.out.println("");
            logger.info("\ncalc_log");
        } else {
            System.out.printf("Result of calculation : %.0f\n ", result);
            System.out.println("");
            logger.info("\ncalc_log");
        }
        scanner.close();
    }

    public static Double getNum() {
        System.out.print("Enter Number (If the number is real use \",\" but not \".\"): ");
        Double num;
        if (scanner.hasNext()) {
            num = scanner.nextDouble();
        } else {
            System.out.println("Error, try again .");
            scanner.next();
            num = getNum();
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

    public static Double calc(Double num1, Double num2, Character operation) {
        Double result;
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