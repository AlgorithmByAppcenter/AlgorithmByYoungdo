package interfaceExample;

public class zooKeeper {
	public void feed(Predator predator){//predator�̶�� �������̽��� ��ü�� �� �ִ�.
		System.out.println("feed "+predator.getName());
	}
	public static void hi(){
		
	}
	public static void main(String[] args){
		Tiger tiger = new Tiger();//Predator �������̽� ��ü���� Tiger Ŭ������ ��ü
		Lion lion = new Lion();//Predator �������̽� ��ü���� Lion Ŭ���� ��ü
		//�̷��� ��ü�� �� �� �̻��� �ڷ��� Ÿ���� ���ԵǴ� Ư���� ������
		
		zooKeeper zookeeper = new zooKeeper();
		
		zookeeper.feed(tiger);
		zookeeper.feed(lion);
		
		System.out.format("%03x", 255);  
	}
}
