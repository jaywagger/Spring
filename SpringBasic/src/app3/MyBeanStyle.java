package app3;

public abstract class MyBeanStyle {
	public abstract void hello(String name);
	
	//��ü�� ������ �� �ѹ� ȣ��Ǵ� �޼ҵ�
	public void myInit() {
		System.out.println("Init...");
	}
	//��ü�� �Ҹ�� �� �ѹ� ȣ��Ǵ� �޼ҵ�
	public void myDestroy() {
		System.out.println("Destroy...");
	}
	
	
	
}

