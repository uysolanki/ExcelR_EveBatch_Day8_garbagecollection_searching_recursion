package day8;

public class Student {
	
		static int counter;
		int rno;
		String sname;
		
		@Override
		protected void finalize() throws Throwable {
		counter++;
		System.out.println("Object Destroyed "+counter);
		}
}
