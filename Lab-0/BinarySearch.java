import java.util.Scanner;

class bubbleSort {
    void Sort(int a[]) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    void print(int a[]) {
        System.out.println("Sorted array:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}

public class Bsort {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int n = sc.nextInt();
		System.out.println("Enter elements into array");
		int[] a = new int[n];
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		bubbleSort b = new bubbleSort();
		
		long startTime = System.nanoTime();
		b.Sort(a);
        	long endTime = System.nanoTime();
        	long bsorttime = endTime - startTime;

		b.print(a);
		
		System.out.println("Bubble Sort Time : " + bsorttime + " nanoseconds");
		
	}
}
