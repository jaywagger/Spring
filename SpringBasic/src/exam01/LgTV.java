package exam01;

public class LgTV implements TVInterface{
	
	public void turnOn() {
		System.out.println("LgTV---���� �Ҵ�.");
	}

	public void turnOff() {
		System.out.println("LgTV---���� ����.");
	}

	public void soundUp() {
		System.out.println("LgTV---�Ҹ� �ø���.");
	}

	public void soundDown() {
		System.out.println("LgTV---�Ҹ� ������.");
	}
}