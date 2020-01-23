package book.exam.constructor;

public class SamsungTV implements TVInterface{
	Speaker speaker; //�޼ҵ�ȿ��� ����Ŀ�� ����� �� �ֵ���

	public SamsungTV(Speaker speaker) { //�����ڷ� ����Ŀ �ޱ�
		super();
		this.speaker = speaker;
		System.out.println("�ＺƼ�񿡼� ����Ŀ�� �޾Ҵ�");
	}

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
		speaker.soundUp();
		
	}

	@Override
	public void soundDown() {
		System.out.println("SamsungTV---�Ҹ� ������.");
		speaker.soundDown();
	}
}
