package book.exam.constructor;

public class LgTV implements TVInterface{
	
	Speaker speaker; //�޼ҵ忡�� ����� �� �ֵ���

	public LgTV(Speaker speaker) { //�����ڷ� ����Ŀ �ޱ�
		super();
		this.speaker = speaker;
		System.out.println("LGƼ�񿡼� ����Ŀ�� �޾Ҵ�");
	}
	
	public void turnOn() {
		System.out.println("LgTV---���� �Ҵ�.");
	}

	public void turnOff() {
		System.out.println("LgTV---���� ����.");
	}

	public void soundUp() {
		System.out.println("LgTV---�Ҹ� �ø���.");
		speaker.soundUp();
	}

	public void soundDown() {
		System.out.println("LgTV---�Ҹ� ������.");
		speaker.soundDown();
	}
}
