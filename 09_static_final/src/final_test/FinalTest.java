package final_test;

public class FinalTest {
	
	int a = 10;
	final int b = 10;
	final int c;
	
	static final double PI = 3.14;
	final static int MAX_NUMBER = 25;
	
	FinalTest(){
		c = 100;
	}
	
	public static void main(String[] args) {
		FinalTest finalTest = new FinalTest();
		System.out.println(finalTest);
		finalTest.a = 30; 
		System.out.println(finalTest.a);
		//finalTest.b = 40;
		System.out.println(finalTest.b);
		
		final int v;
		v = 100;
		System.out.println(v);
		// v = 101;
		final int b = 100;
		System.out.println(b);
		//static int a;
		System.out.println(PI);
		System.out.println(FinalTest.PI);
		//Math.PI = 100;
		System.out.println(Math.PI);
	}

}






