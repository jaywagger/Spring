package book.exam.constructor;

public class SonySpeaker implements Speaker {
	public SonySpeaker() {
		System.out.println("SonySpeaker��ä����");
	}
	
	@Override
	public void soundUp() {
		System.out.println("SonySpeaker�� ������");
	}
	
	@Override
	public void soundDown() {
		System.out.println("SonySpeaker�� �����ٿ�");
	}
}
