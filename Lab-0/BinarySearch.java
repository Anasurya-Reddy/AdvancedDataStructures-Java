import java.util.Scanner;

class binarySearch {
    void search(int arr[],int key) {
    	int flag = -1;
        int low = 0;
        int high = arr.length-1;
        while(low <= high) {
        	int mid = (low+high)/2;
        	if(arr[mid]==key) {
        		System.out.println("Your key found at index " + mid);
        		flag = 0;
        		break;
        	}
        	else if(arr[mid] < key) {
        		low = mid+1;
        	}
        	else {
        		high = mid-1;
        	}
        }
        if(flag == -1) {
        	System.out.println("Your key not found");
        }
	}
}

public class BinarySearch {
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
		binarySearch b = new binarySearch();
		b.search(a,key);
	}
}
