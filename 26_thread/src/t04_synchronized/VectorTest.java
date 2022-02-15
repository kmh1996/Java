package t04_synchronized;

import java.util.ArrayList;
import java.util.List;

public class VectorTest {

	public static void main(String[] args) {
		List<String> array = new ArrayList<>();
		//List<String> array = new Vector<>();
		
		Thread t1 = new Thread(()->{
			for(int i=0; i<10000; i++) {
				array.add("최기근");
			}
		});
		Thread t2 = new Thread(()->{
			for(int i=0; i<10000; i++) {
				array.add("천재");
			}
		});
		t1.start();
		t2.start();
		Thread t3 = new Thread(()->{
			while(true) {
				Thread.State state1 = t1.getState();
				Thread.State state2 = t2.getState();
				if(state1 == Thread.State.TERMINATED
						&&
				   state2 == Thread.State.TERMINATED) {
					System.out.println("t1, t2 작업 종료");
					System.out.println("array : "+array.size());
					break;
				}
			}
		});
		t3.start();
	}

}











