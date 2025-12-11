import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class sort {
    static Scanner scanner = new Scanner(System.in);
    static Logger logger = Logger.getLogger(sort.class.getName());
    static XMLFormatter xml = new XMLFormatter();

    public static void main(String[] args) throws IOException, SecurityException {
        FileHandler info = new FileHandler("sort_log.xml");
        logger.addHandler(info);

        info.setFormatter(xml);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        BubbleSort(InputArr(size));
        scanner.close();
    }

    public static void BubbleSort(Integer[] sortArr) {
        for (int i = 0; i < sortArr.length - 1; i++) {
            for (int j = 0; j < sortArr.length - i - 1; j++) {
                if (sortArr[j + 1] < sortArr[j]) {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }
                logger.logp(Level.INFO, "sort", "BubbleSort", "INFO");

            }
        }
        // вывод с консоли
        for (int i = 0; i < sortArr.length; i++) {
            System.out.print(sortArr[i] + " ");
        }
    }

    // ввод с консоли
    public static Integer[] InputArr(Integer size) {
        Integer array[] = new Integer[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Введите элемент: ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

}
