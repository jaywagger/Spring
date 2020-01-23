package di.setter.basic;

public class InsaImpl implements Insa {
	MemberDAO dao;
	
	public InsaImpl() {
		System.out.println("InsaImpl 기본생성자");
	}
	
	//생성자 인젝션으로 MemberDAO 객체를 주입받기 위해서 필요한 생성자
	public InsaImpl(MemberDAO dao) {
		super();
		this.dao = dao;
		System.out.println("InsaImpl 매개변수1개 생성자");
	}
	
	//setter 인젝션으로 MemberDAO 객체를 주입받기 위해서 필요한 생성자
	public MemberDAO getDao() {
		System.out.println("이거슨 getter 호출이오");
		return dao;
	}
	public void setDao(MemberDAO dao) {
		System.out.println("이거슨 setter 호출이오");
		this.dao = dao;
	}
	

	@Override
	public void addUser(MemberDTO user) {
		dao.add(user);		
	}



	@Override
	public MemberDTO getUser(String id) {
		dao.getUser("id");
		return null;
	}

}
