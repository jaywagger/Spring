package dl.exam01;

public class SamsungTV implements TVInterface{

	@Override
	public void turnOn() {
		System.out.println("SamsungTV---���� �Ҵ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("SamsungTV---���� ����.");
	}

	@Override
	public void soundUp() {
		System.out.println("SamsungTV---�Ҹ� �ø���.");
	}

	@Override
	public void soundDown() {
		System.out.println("SamsungTV---�Ҹ� ������.");
	}
}
