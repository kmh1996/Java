package explain;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * 3. 위도, 경도 정보를 가진 Location 클래스를 작성하고, 
 * 도시 이름을 'key'로 하는 HashMap<String, Location> 
   컬렉션을 만들고, 사용자로부터 도시이름, 경도, 위도를 입력받아 저장하고
   입력 완료 후 도시 이름으로 검색하는프로그램을 작성하시오.
   - 도시이름(city)은 String , 경도(longitude)/위도(latitude)는 
   	 Location객체의 double type 으로 저장
   - ‘q’ 입력 시 정보 입력 완료 / ‘q’ 입력 시 도시 검색 완료
   - 도시이름, 위도, 경도 는 한번에 입력받아 split()
     또는 StringTokenizer로 처리
 *
 */
// 경도 , 위도 정보를 저장할 Location 객체
class Location{
	private double longitude;	//경도
	private double latitude;	//위도
	
	public Location(double longitude, double latitude) {
		this.longitude = longitude;
		this.latitude = latitude;
	}
	// 이하  getter // setter / toString()
	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}



	@Override
	public String toString() {
		return "Location [경도=" + longitude + ", 위도=" + latitude + "]";
	}
	
}
// 실행 클래스
public class Explain3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String,Location> manage = new HashMap<>();
		System.out.println("도시, 경도, 위도를 한번에 입력해주세요.( q는 입력 완료)");
		while(true) {
			System.out.print(">> ");
			// , 를 구분자로 도시이름 , 경도 , 위도 를 문자열로 입력받음 
			String strs = sc.nextLine();
			// q를 입력하면 등록 완료
			if(strs.equals("q")) break;
			// split을 이용하여 ,를 기준으로 문자열을 잘라 문자열 배열로 확인
			String[] st = strs.split(",");
			System.out.println(Arrays.toString(st));
			
			// split으로 완성된 배열의 인덱스에 따라 값을 하나씩 꺼내옴
			// 도시이름
			String city = st[0].trim();
			// 경도 위도를 문자열로 전달 받아 double 타입으로 변환
			double longitude = Double.parseDouble(st[1].trim());
			double latitude = Double.parseDouble(st[2].trim());
			System.out.println(city+" "+longitude+" "+latitude);
			
			// StringTokenizer를 이용하여 
			// 입력받은 문자열을 ,를 기준으로 잘라냄
			StringTokenizer stoken = new StringTokenizer(strs,",");
			System.out.println(stoken.countTokens());
			city = stoken.nextToken().trim();
			longitude = Double.valueOf(stoken.nextToken().trim());
			latitude = Double.parseDouble(stoken.nextToken().trim());
			// 도시이름을 key값으로 location 객체(value)를 저장
			manage.put(city,new Location(longitude,latitude));
		}
		
		// map안의 정보를 확인하여 출력
		System.out.println("----------------------------");
		Set<String> key = manage.keySet();
		for(String k : key) {
			Location l = manage.get(k);
			System.out.println(k+" "+l.getLongitude()+" "+l.getLatitude());
		}
		System.out.println("----------------------------");
		
		// 도시이름이 일치하는 정보를 찾아 출력
		while(true) {
			System.out.println("도시 이름( q는 종료 )>>");
			String city = sc.next();
			if(city.equals("q")) break;
			// key값의 equals method를 이용하여
			// key값이 존재하는 지 확인
			// 존재하면 정보를 가지고 와서 출력(get(key))
			if(manage.containsKey(city)) {
				System.out.println(city+" "+manage.get(city));
			}else {
				System.out.println(city+"는 없습니다.");
			}
		}
		System.out.println("시스템 종료");
	}

}
