import java.util.Scanner;

class SelectionSort {
    void Sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int m = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[m]) {
                    m = j; 
                }
            }

            if (m != i) {
                int temp = arr[m];
                arr[m] = arr[i];
                arr[i] = temp;
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

public class Ssort {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int n = sc.nextInt();
		System.out.println("Enter elements into array");
		int[] a = new int[n];
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		SelectionSort s = new SelectionSort();
		s.Sort(a);
		s.print(a);
		
	}
}