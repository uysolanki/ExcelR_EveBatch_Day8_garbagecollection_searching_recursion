package day8;

public class RecursionDemo {

	public static void main(String[] args) {
		int n=3;
		//System.out.println("Factorial of  "+ n +" is " +factorial(n));
		int factorial=1;
		for(int i=1;i<=n;i++)
		{
			factorial=factorial*i;
		}
		System.out.println(factorial);
	}
}

