package behavior_pattern.observer_;

public class ObserverTest {

	public static void main(String[] args) {
			Subject sub = new MySubject();
			sub.add(new Observer1());
			sub.add(new Observer2());
			
			sub.operation();
			
			sub.operation();
	
	}
	
}