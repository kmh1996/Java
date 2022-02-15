package c4_tree;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<Integer,String> map = new TreeMap<>();
		map.put(100, "최기근");
		map.put(15, "심현석");
		map.put(89, "김유신");
		map.put(97, "유관순");
		map.put(80, "최기근");
		map.put(15, "김재관");
		System.out.println(map);
		
		Map.Entry<Integer, String> entry = null;
		entry = map.firstEntry();
		System.out.println("가장 낮은 수 : "+entry.getKey()+"  "+entry.getValue());
		
		entry = map.lastEntry();
		System.out.println("가장 높은 수 : "+entry.getKey()+"  "+entry.getValue());
		
		entry = map.higherEntry(90);
		System.out.println("90보다 높은 키값을 가진 entry : "+entry.getKey()+"  "+entry.getValue());
		
		entry = map.lowerEntry(90);
		System.out.println("90보다 낮은 키값을 가진 entry : "+entry.getKey()+"  "+entry.getValue());
		
		
		
	}

}
