package basic;
public class TestMain {
	public static void main(String[] args) {
		//1. 생성자를 호출하는 방식
	/*	MemberDAO dao = new MemberDAO();
		Insa insa = new InsaImpl(dao)*/;
		
		//2. setter메서드를 호출하는 방식
		Insa insa = new InsaImpl();
		MemberDAO dao = new MemberDAO();
		insa.setDao(dao);
		
		
		MemberDTO user = new MemberDTO("jang","1234","장동건");
		
		insa.addUser(user);

	}

}
