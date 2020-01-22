package dl.exam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		/*
		 * 스프링컨테이너에 의해 생성해서 객체를 전달 받아 사용할 수 있도록 수정하기
		 * Dependency Lookup 적용
		 * 설정파일 : config/bean.xml
		 * 빈 등록: 
		 * 			SamsungTV = samsung
		 * 			LgTV = lg
		 * 
		 * getBean으로 얻어와서 작업하도록 코드 수정하기
		*/
		ApplicationContext factory = 
				new GenericXmlApplicationContext("/config/bean.xml");
		
		TVInterface tv = (TVInterface) factory.getBean("tv",TVInterface.class);
		
		tv.turnOn();
		tv.soundUp();
		tv.soundDown();
		tv.turnOff();
		
		System.out.println();
		
	}

}
