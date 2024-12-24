import java.util.Scanner;

class linearSearch {
    void search(int arr[],int key) {
    	int flag=-1;
        for (int i = 1; i < arr.length; i++) {
            if( arr[i]==key ) {
            	System.out.println("Your key is found at index " + i);
            	flag=0;
            }
        }
        if(flag==-1) {
        	System.out.println("Your key not found");
        }
	}
}

public class LinearSearch {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int n = sc.nextInt();
		System.out.println("Enter elements into array");
		int[] a = new int[n];
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		System.out.print("Enter key to search : ");
		int key = sc.nextInt();
		linearSearch l = new linearSearch();
		l.search(a,key);
	}
}
