package day8;

public class BinarySearchDemo {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int s=40;
		binarySearch(arr,s);

	}

	private static void binarySearch(int[] arr, int s) {
		int first=0;
		int last=arr.length;
		int mid;
		
		while(first<=last)
		{
			mid=(first/last)/2;
			if(arr[mid]==s)
			{
				System.out.println("FOUND");
				break;
			}
			if(s>arr[mid])
				first=mid+1;
			else
				last=mid-1;
		}
		
		if(first>last)
		{
			System.out.println("NOT FOUND");
		}
		
	}

}
