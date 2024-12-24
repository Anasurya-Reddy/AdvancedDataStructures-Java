import java.util.Scanner;

class insertionSort {
    void Sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
		    while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

        System.out.println();
	}
	void print(int a[]) {
        System.out.println("Sorted array:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

    }
}

public class InsertionSort {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int n = sc.nextInt();
		System.out.println("Enter elements into array");
		int[] a = new int[n];
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		insertionSort is = new insertionSort();
		
		long startTime = System.nanoTime();
		is.Sort(a);
        	long endTime = System.nanoTime();
        	long isorttime = endTime - startTime;

		is.print(a);
		
		System.out.println("Insertion Sort Time : " + isorttime + " nanoseconds");
	}
}
