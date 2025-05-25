public class Main {
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private void bubbleSort(int[] arr) {
        int len = arr.length;

        for (int i = 0; i < len - 1; i++) {
            for (int j = i+ 1; j < len ; j++) {
                if (arr[j] < arr[i]) {
                    swap(arr, i, j);
                }
            }
        }

        printArray(arr);
    }

    private void selectionSort(int[] arr) {
        int len = arr.length;

        for (int i = 0; i < len - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }

        printArray(arr);
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 6, 3, 9, 0, 10};
        Main ma = new Main();
        int[] arrCopy = arr.clone();
        ma.bubbleSort(arrCopy);
        arrCopy = arr.clone();
        ma.selectionSort(arrCopy);
    }
}