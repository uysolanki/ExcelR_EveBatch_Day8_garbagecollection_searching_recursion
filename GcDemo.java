package day8;

public class GcDemo {

	public static void main(String[] args) {
//		Runtime rt=Runtime.getRuntime();
//		System.out.println("Total Memory "+rt.totalMemory()/10000);
//		System.out.println("Before Free Memory" + rt.freeMemory()/10000);
		
		for(int i=1;i<=100;i++)
		{
			Student s1=new Student();
			s1=null;
		}
		System.gc();
//		System.out.println("After Free Memory" + rt.freeMemory()/10000);
		
	}

}
