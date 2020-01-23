package di.setter01;
//Player�� ���� �ִ� Dice�� �ܺο���(�����������̳�) Injection �޾� ����ؾ�
// �ϹǷ� Injection ���� �� �ֵ��� �̸� �غ��ؾ� �Ѵ�.
// ==> Constructor or Setter �޼ҵ�� ����
public class Player implements AbstractPlayer {
	
	public Player() {
		
	}
	
	public Player(AbstractDice d) {
		super();
		this.d = d;
	}
	
	AbstractDice d;
	
	int totalValue=0;
	
	@Override
	public void play(){
		totalValue=0;
		for (int i = 0; i < 3; i++) {
			totalValue+=d.getDiceValue();
		}
	}
	@Override
	public int getTotalValue(){
		return totalValue;
	}
	public AbstractDice getD() {
		return d;
	}
	public void setD(AbstractDice d) {
		this.d = d;
	}
	
	
	
}