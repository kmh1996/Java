package b.args;

public class RamdaArgsExam {

	public static void main(String[] args) {
		MyInterface i = new MyInterface() {
			@Override
			public void method(int x, int y) {
				int sum = x + y;
				System.out.println("sum : "+sum);
			}
		};
		i.method(1, 10);
		
		i = (a,b)->{
			int result = a*b;
			System.out.println("result : " + result);
		};
		i.method(10,30);
	}

}



