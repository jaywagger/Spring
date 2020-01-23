package book.exam.constructor;

public class SonySpeaker implements Speaker {
	public SonySpeaker() {
		System.out.println("SonySpeaker°´Ã¤»ý¼º");
	}
	
	@Override
	public void soundUp() {
		System.out.println("SonySpeakerÀÇ º¼·ý¾÷");
	}
	
	@Override
	public void soundDown() {
		System.out.println("SonySpeakerÀÇ º¼·ý´Ù¿î");
	}
}
