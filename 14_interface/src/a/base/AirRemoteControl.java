package a.base;

public class AirRemoteControl implements RemoteControl{
	
	int temperature = 24;

	@Override
	public void turnOff() {
		System.out.println("에어콘이 꺼집니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("에어콘이 켜집니다.");
	}

	@Override
	public void setValue(int value) {
		temperature = value;
		System.out.println(temperature+"로 온도를 설정합니다.");
	}

}






