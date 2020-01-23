package book.exam.constructor;

public class AppleSpeaker implements Speaker {
	public AppleSpeaker() {
		System.out.println("AppleSpeaker°´Ã¤»ý¼º");
	}
	
	@Override
	public void soundUp() {
		System.out.println("AppleSpeakerÀÇ º¼·ý¾÷");
	}
	
	@Override
	public void soundDown() {
		System.out.println("AppleSpeakerÀÇ º¼·ý´Ù¿î");
	}
}
