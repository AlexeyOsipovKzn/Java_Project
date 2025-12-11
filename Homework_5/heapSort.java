public class heapSort {
    public static void main(String[] args) {
        int [] array = {901, 2141, 23, 3, 221, 32, 213, 12, 1, 12, 2, 6, 9};

        heapSrt(array);

        for (var i : array) {
            System.out.print(i + " ");
        }
    }

    public static void heapSrt(int[] array) {
        int length = array.length;

        for (int i = length / 2 - 1; i >= 0; i--) {
            heapify(array, i, length);
        }

        for (int i = length - 1; i >= 0; i--) {
            int swp = array[i];
            array[i] = array[0];
            array[0] = swp; 

            heapify(array, 0, i);
        }
    }

    public static void heapify(int[] array, int i, int length) {
        int l = i * 2 + 1;
        int r = i * 2 + 2 ;
        int largest = i;

        if(l < length && array[l] > array[largest]){
            largest = l;
        }
        if (r < length && array[r] > array[largest]) {
            largest = r;
        }

        if(i != largest) {
            int swp = array[i];
            array[i] = array[largest];
            array[largest] = swp;

            heapify(array, largest, length);
        }
    }
}