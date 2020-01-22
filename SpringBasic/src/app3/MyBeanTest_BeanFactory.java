package app3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
//BeanFactory컨테이너가 객체를 관리하는 방법 - 언제 객체를 생성할까?

public class MyBeanTest_BeanFactory {
	public static void main(String[] args) {
		
		System.out.println("******리소스 생성 전********");
		Resource res = new ClassPathResource("/config/bean.xml");
		
		System.out.println("******BeanFactory생성 전********");
		BeanFactory factory = new XmlBeanFactory(res);
		
		System.out.println("*****getBean 호출 전********");
		MyBeanStyle obj1 = (MyBeanStyle) factory.getBean("myBean1");
		MyBeanStyle obj2 = (MyBeanStyle) factory.getBean("myBean1");
		
		if(obj1==obj2) {
			System.out.println("같다.");
		}else {
			System.out.println("다르다");
		}
		
		run(obj1);
		show(obj1);
	}
	public static void run(MyBeanStyle obj) {
		System.out.println("*****************************");
		obj.hello("현빈");
		obj.hello("현빈");
		System.out.println("*****************************");
	}
	public static void show(MyBeanStyle obj) {
		System.out.println("*****************************");
		obj.hello("현빈");
		obj.hello("현빈");
		System.out.println("*****************************");
	}
	

}
