import java.util.Scanner;

public class QuickSort {
    
    public static int partition(int[] a, int low, int high) {
        int pivotIndex = low + (int)(Math.random() * (high - low + 1)); // Random Pivot
        interchange(a, low, pivotIndex);
        int pivot = a[low];
        int i = low + 1, j = high;

        while (i <= j) {
            while (i <= j && a[i] <= pivot) i++;
            while (i <= j && a[j] >= pivot) j--;
            if (i < j) interchange(a, i, j);
        }
        interchange(a, low, j);
        return j;
    }

    public static void interchange(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int j = partition(a, low, high);
            quickSort(a, low, j - 1);
            quickSort(a, j + 1, high);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        quickSort(array, 0, array.length - 1);

        System.out.println("Sorted Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
