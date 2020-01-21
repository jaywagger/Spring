package app2;

import app1.MyBeanStyleB;

/*
 * oop가 적용되어 있는 프로그램
 * oop특성을 적용하기 위해 상위클래스를 정의하고  MyBeanStyleXXX클래스를 
 * 사용하는 매게변수의 타입을 상위타입으로 변경하여 다형성을 적용했다.
 * 사용되는 객체가 변경되더라도 변경된 캑체를 사용하는 곳에서
 * 코드를 수정하는 범위가 줄어든다
 * 
 * 그러나 실체 객체를 곳에서ㅗ는 생성해서 전달하고 있다.
 * 사용하는 객체가 바뀔 때 마다 객체를 직접 생성하는 코드를 모두 수정해야 한다는 
 * 담점은 존재한다.
 * 
 * 하용하는 곳에서 직접 new해서 객체를 생성하는 코드는 없어져야 하는 코드이다.
*/
public class MyBeanTest {
	public static void main(String[] args) {
		MyBeanStyleA obj = new MyBeanStyleA();
		run(obj);
		show(obj);
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
