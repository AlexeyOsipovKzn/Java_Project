package Java_Project.Seminar_1;

import java.util.Scanner;

public class seminar1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int[] arr = new int[10];
        FillMas(arr);
        for (var item : arr) {
            System.out.print(item + " ");
        }
        iScanner.close();
        Founder(arr);
    }

    public static void FillMas(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 11);
        }
    }

    public static void Founder(int[] array) {
        int count = 0;
        int tmp = 0;
        int itm = array[1];
        for (var item : array) {
            if (item == itm) {
                count++;
            } else {
                if(tmp < count) tmp = count;
            }
            itm ++;
        }
        System.out.println("Max = " + tmp);
    }
}
