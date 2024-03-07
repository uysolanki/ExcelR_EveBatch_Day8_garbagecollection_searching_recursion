package day8;

public class LinearSearchDemo {

	public static void main(String[] args) {
		int arr[] = { 10, 5, 17, 6, 20 };
		int s = 26; // 6
		int i;
//		int flag=0;
		for (i= 0; i < arr.length; i++) 
			{
				if (arr[i] == s) 
				{
				System.out.println("Found");
				//flag=1;
				break;
				} 
			}
		
		if(i==arr.length) 
			System.out.println("Not Found");

	}

}
