package app2;

import app1.MyBeanStyleB;

/*
 * oop�� ����Ǿ� �ִ� ���α׷�
 * oopƯ���� �����ϱ� ���� ����Ŭ������ �����ϰ�  MyBeanStyleXXXŬ������ 
 * ����ϴ� �ŰԺ����� Ÿ���� ����Ÿ������ �����Ͽ� �������� �����ߴ�.
 * ���Ǵ� ��ü�� ����Ǵ��� ����� Ĵü�� ����ϴ� ������
 * �ڵ带 �����ϴ� ������ �پ���
 * 
 * �׷��� ��ü ��ü�� �������Ǵ� �����ؼ� �����ϰ� �ִ�.
 * ����ϴ� ��ü�� �ٲ� �� ���� ��ü�� ���� �����ϴ� �ڵ带 ��� �����ؾ� �Ѵٴ� 
 * ������ �����Ѵ�.
 * 
 * �Ͽ��ϴ� ������ ���� new�ؼ� ��ü�� �����ϴ� �ڵ�� �������� �ϴ� �ڵ��̴�.
*/
public class MyBeanTest {
	public static void main(String[] args) {
		MyBeanStyleA obj = new MyBeanStyleA();
		run(obj);
		show(obj);
	}
	public static void run(MyBeanStyle obj) {
		System.out.println("*****************************");
		obj.hello("����");
		obj.hello("����");
		System.out.println("*****************************");
	}
	public static void show(MyBeanStyle obj) {
		System.out.println("*****************************");
		obj.hello("����");
		obj.hello("����");
		System.out.println("*****************************");
	}
	

}
