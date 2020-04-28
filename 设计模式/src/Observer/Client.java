package Observer;

public class Client {
	public static void main(String[] args) {
		SubjectS subject = new CSB();
		ObserverO obs1 = new CO1();
		ObserverO obs2 = new CO2();
		subject.Add(obs1);
		subject.Add(obs2);
		subject.notifyObserver();
	}
}
