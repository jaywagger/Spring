package dl.exam01;

public class SamsungTV implements TVInterface{

	@Override
	public void turnOn() {
		System.out.println("SamsungTV---전원 켠다.");
	}

	@Override
	public void turnOff() {
		System.out.println("SamsungTV---전원 끈다.");
	}

	@Override
	public void soundUp() {
		System.out.println("SamsungTV---소리 올린다.");
	}

	@Override
	public void soundDown() {
		System.out.println("SamsungTV---소리 내린다.");
	}
}
