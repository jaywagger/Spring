package basic;
public class TestMain {
	public static void main(String[] args) {
		//1. �����ڸ� ȣ���ϴ� ���
	/*	MemberDAO dao = new MemberDAO();
		Insa insa = new InsaImpl(dao)*/;
		
		//2. setter�޼��带 ȣ���ϴ� ���
		Insa insa = new InsaImpl();
		MemberDAO dao = new MemberDAO();
		insa.setDao(dao);
		
		
		MemberDTO user = new MemberDTO("jang","1234","�嵿��");
		
		insa.addUser(user);

	}

}
