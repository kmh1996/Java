package operator;

public class OperatorEuqualsTest {

	public static void main(String[] args) {
		// 비교 or 관계연산자
		// > , >= , < , <=  좌,우변의 값을 비교
		// 동등 비교연산자
		// == , !=
		int num1 = 10;
		int num2 = 20;
		
		boolean result = num1 > num2;
		System.out.println("num1 > num2 : " + result);
		result = num1 == num2;
		System.out.println("num1 == num2 : " + result);
		
		String s = "최기근";
		String s1 = "최기근";
		String s2 = "잠자는 심현석";
		System.out.println(s == s2);
		System.out.println(s == s1);
		System.out.println("=========================");
		System.out.println(s);
		System.out.println(s1);
		String s3 = new String("최기근");
		System.out.println(s3);
		System.out.println(s == s3);
		result = s.equals(s3);
		System.out.println(result);
		result = s.equals(s2);
		System.out.println(result);
		
	}

}











