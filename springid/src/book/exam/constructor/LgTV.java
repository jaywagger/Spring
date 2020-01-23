package book.exam.constructor;

public class LgTV implements TVInterface{
	
	Speaker speaker; //메소드에서 사용할 수 있도록

	public LgTV(Speaker speaker) { //생성자로 스피커 받기
		super();
		this.speaker = speaker;
		System.out.println("LG티비에서 스피커를 받았다");
	}
	
	public void turnOn() {
		System.out.println("LgTV---전원 켠다.");
	}

	public void turnOff() {
		System.out.println("LgTV---전원 끈다.");
	}

	public void soundUp() {
		System.out.println("LgTV---소리 올린다.");
		speaker.soundUp();
	}

	public void soundDown() {
		System.out.println("LgTV---소리 내린다.");
		speaker.soundDown();
	}
}
