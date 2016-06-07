package interfaceExample;

public class zooKeeper {
	public void feed(Predator predator){//predator이라는 인터페이스로 대체할 수 있다.
		System.out.println("feed "+predator.getName());
	}
	public static void hi(){
		
	}
	public static void main(String[] args){
		Tiger tiger = new Tiger();//Predator 인터페이스 객체이자 Tiger 클래스의 객체
		Lion lion = new Lion();//Predator 인터페이스 객체이자 Lion 클래스 객체
		//이렇게 객체가 한 개 이상의 자료형 타입을 갖게되는 특성을 다형성
		
		zooKeeper zookeeper = new zooKeeper();
		
		zookeeper.feed(tiger);
		zookeeper.feed(lion);
		
		System.out.format("%03x", 255);  
	}
}
