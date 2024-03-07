package day8;

public class BinarySearchUsingRecursion {
public static void main(String[] args) {
	int arr[]= {10,20,30,40,50};
	int s=77;
	int ans=binarySearch(arr,0,arr.length-1,s);
	if(ans==-1)
		System.out.println("NOT FOUND");
	else
		System.out.println("FOUND at index "+ans);
	
	
}

private static int binarySearch(int[] arr, int first, int last, int s) {
	int mid;
	if(first>last)  //base case
		return -1;
	else
	{
		mid=(first+last)/2;
		if(arr[mid]==s)
		{
			System.out.println("Found");
			return mid;
		}
		else if(s>arr[mid])
		{
			return(binarySearch(arr, mid+1,last, s));
		}
		else
			return(binarySearch(arr, first,mid-1, s));
			
	}
	
}
}
