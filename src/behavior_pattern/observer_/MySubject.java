package behavior_pattern.observer_;

public class MySubject extends AbstractSubject {

	@Override
	public void operation() {
		System.out.println("update self!");
		notifyObservers();
	}
	
}
