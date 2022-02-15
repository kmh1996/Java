package iteration_statement;

public class ForStatementTest {

	public static void main(String[] args) {
		// 연속된 연산을 반복하며 수행하는 문장
		int sum = 1+2+3+4+5+6+7+8+9+10;
		sum = 0;
		int i;
		for(i=1; i<11; i++) {
			sum = sum + i;
		}
		System.out.println(i);
		System.out.println("1~10의 합은 : " + sum);
		
		//for(;;)System.out.println("무한히 반복");
		
		i = 1;
		sum = 0;
		for(;i<11; i+=2)sum+=i;
		
		System.out.println(i);
		System.out.println(sum);
		
		i = 1;
		sum = 0;
		for(;;i++) {
			if(i > 10) {
				break;
			}
			sum+=i;
		}
		System.out.println(i);
		System.out.println(sum);
		
		// 이중 for문
		// 외부 for문 1회반복 시 내부 포문 지정횟수만큼 반복
		outter : for(i = 2; i<=9; i++) {
			System.out.print(i+"단\t|");
			for(int j=1; j<=9; j++) {
				// 줄바꿈을 하지 않는 출력문
				System.out.print(i+"*"+j+"="+(i*j)+"\t|");
				if(i % 3 == 0) {
					//break outter;
					continue outter;
				}
			}
			System.out.println("\n");
		}
		System.out.println("Main 종료");
	} // main 종료
}




