package b.string.method;

public class StringSubstringExam {

	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0,6);
		System.out.println(firstNum);
		
		System.out.println(ssn);
		// 7번째 인덱스 부터 (8-1)인덱스 까지 
		String last = ssn.substring(7,8);
		System.out.println(last);
		
		char gender = ssn.charAt(7);
		System.out.println(gender);
		
		String endNum = ssn.substring(7);
		System.out.println(endNum);
	}

}




