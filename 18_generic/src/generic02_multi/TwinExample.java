package generic02_multi;

public class TwinExample {

	public static void main(String[] args) {
		Twin<TV, String> tv = new Twin<TV,String>();
		tv.setType(new TV());
		tv.setModel("LG 스마트 TV");
		
		Twin<Car, Integer> car = new Twin<>();
		car.setType(new Car());
		car.setModel(520);
		
		
	}

}
	
	
	
	
