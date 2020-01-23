package di.setter.basic;

public class InsaImpl implements Insa {
	MemberDAO dao;
	
	public InsaImpl() {
		System.out.println("InsaImpl �⺻������");
	}
	
	//������ ���������� MemberDAO ��ü�� ���Թޱ� ���ؼ� �ʿ��� ������
	public InsaImpl(MemberDAO dao) {
		super();
		this.dao = dao;
		System.out.println("InsaImpl �Ű�����1�� ������");
	}
	
	//setter ���������� MemberDAO ��ü�� ���Թޱ� ���ؼ� �ʿ��� ������
	public MemberDAO getDao() {
		System.out.println("�̰Ž� getter ȣ���̿�");
		return dao;
	}
	public void setDao(MemberDAO dao) {
		System.out.println("�̰Ž� setter ȣ���̿�");
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
