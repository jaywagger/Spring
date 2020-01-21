package basic;
public interface Insa {
	public void addUser(MemberDTO user);
	//public생력가능
	MemberDTO getUser(String id);
	void setDao(MemberDAO dao);
}

