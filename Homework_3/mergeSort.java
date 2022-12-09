package Homework_3;

public class mergeSort {
    public static void main(String[] args) {
        int[] array = { 5, 9, 210, 842, 8, 1, 4, 6, 5 };
        Sort(array);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void Sort(int[] arr) {
        if (arr.length == 1) {
            return;
        }

        int[] left = new int[arr.length / 2];
        int[] right = new int[arr.length - arr.length / 2];

        for (int i = 0; i < arr.length / 2; i++) {
            left[i] = arr[i];
        }

        for (int j = arr.length / 2; j < arr.length; j++) {
            right[j - arr.length / 2] = arr[j];
        }
        Sort(left);
        Sort(right);
        Merge(arr, left, right);
    }

    public static void Merge(int[] arr, int[] a, int[] b) {
        int i = 0;
        int j = 0;
        int idx = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                arr[idx] = a[i];
                i++;
                idx++;
            } else {
                arr[idx] = b[j];
                j++;
                idx++;
            }
        }

        for (int ll = i; ll < a.length; ll++) {
            arr[idx++] = a[ll];
        }

        for (int rr = j; rr < b.length; rr++) {
            arr[idx++] = b[rr];
        }
    }
}