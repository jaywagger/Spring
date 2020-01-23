package book.exam.constructor;

public class SamsungTV implements TVInterface{
	Speaker speaker; //메소드안에서 스피커를 사용할 수 있도록

	public SamsungTV(Speaker speaker) { //생성자로 스피커 받기
		super();
		this.speaker = speaker;
		System.out.println("삼성티비에서 스피커를 받았다");
	}

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
		speaker.soundUp();
		
	}

	@Override
	public void soundDown() {
		System.out.println("SamsungTV---소리 내린다.");
		speaker.soundDown();
	}
}
