package book.exam.constructor;

public class AppleSpeaker implements Speaker {
	public AppleSpeaker() {
		System.out.println("AppleSpeaker��ä����");
	}
	
	@Override
	public void soundUp() {
		System.out.println("AppleSpeaker�� ������");
	}
	
	@Override
	public void soundDown() {
		System.out.println("AppleSpeaker�� �����ٿ�");
	}
}
