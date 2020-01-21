package exam01;

public class TVUser {
	public static void main(String[] args) {
		TVInterface tv = new SamsungTV();
		tv.turnOn();
		tv.soundUp();
		tv.soundDown();
		tv.turnOff();
		
		System.out.println();
		
		TVInterface lgtv = new LgTV();
		lgtv.turnOn();
		lgtv.soundUp();
		lgtv.soundDown();
		lgtv.turnOff();
	}

}
