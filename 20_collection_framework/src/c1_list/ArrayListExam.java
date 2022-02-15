package c1_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExam {

	public static void main(String[] args) {
		// 순서(index)가 존재하고 데이터 중복 저장이 가능한 List Collection
		// generic이 지정되어 있지않으면 Object Type
		// 값이 들어갈때 Type을 검증 할 수 없고
		// 값을 꺼내올때도 확인을 해야함.
		ArrayList array = new ArrayList();
		array.add("문자열");
		array.add(100);
		String s = (String)array.get(0);
		System.out.println(array);
		
		// List를 선언할때 generic을 지정하면
		// 선언할때 저장할 data type 자료형을 지정할 수 있음
		// 저장할 data type을 지정하여 값을 넣을 때
		// 컴파일러를 통해 검증이 가능하며 값을 꺼내올때도 
		// 해당되는 데이터 타입으로 바로 꺼내올 수 있음.
		ArrayList<String> strs = new ArrayList<>();
		int strLength = strs.size();
		System.out.println("size : " + strLength);
		// add(data) 배열에 마지막 인덱스에 자동으로 데이터 추가 
		strs.add("java");
		strs.add("JDBC");
		// size() list에 저장된 데이터의 크기를 반환
		System.out.println(strs.size());
		strs.add("MYSQL");
		strs.add("mysql");
		
		// get(index) 해당 인덱스에 저장된 값을 읽어옴.
		// index를 벗어나면 오류 발생
		String str = strs.get(1);
		// strs.get(20); 
		// 존재하지 않는 인덱스 이므로 
		// Runtime(프로그램 실행)시 오류 발생
		System.out.println(strs);
		System.out.println("1번째 인덱스의 값 : " + str);
		
		// add(index, data)
		// 해당 인덱스에 data를 추가 하고
		// 해당 위치에 있는 데이터 부터 뒤로 이동
		strs.add(2,"Servlet/JSP");
		System.out.println(strs);
		
		// set(index,data)
		// 해당 인덱스 위치에 값을 data로 교체
		strs.set(3, "Oracle");
		System.out.println(strs);
		
		// remove(index) index위치에 값 삭제
		String result = strs.remove(1);
		System.out.println(strs);
		System.out.println(result);
		
		strs.remove("java");
		System.out.println(strs.size());
		System.out.println(strs);
		
		// list안에 해당 값이 존재 하는지 확인하여 boolean 값으로 반환
		boolean isCheck = strs.contains("java");
		System.out.println(isCheck);
		
		isCheck = strs.contains("mysql");
		System.out.println(isCheck);
		
		// 값이 비어있으면 true, 하나라도 값이 존재하면 false
		isCheck = strs.isEmpty();
		System.out.println(strs);
		System.out.println("isEmpty : "+isCheck);
		
		// List안의 모든 값을 제거
		strs.clear();
		System.out.println();
		
		isCheck = strs.isEmpty();
		System.out.println("isCheck : " + isCheck);
		
		strs.add("JAVA");
		strs.add("Java");
		strs.add("JaVa");
		
		// list안의 data를 배열로 변환하여 반환
		String[] ss = new String[strs.size()];
		strs.toArray(ss);
		System.out.println(Arrays.toString(ss));
		
		// 배열을 List로 변환
		List<String> list = Arrays.asList(ss);
		System.out.println(list);
		
	}

}






