package GongChang;

public class FactoryB extends Factory {
	public Fruit CreatFruit() {
		return new Banana1();
	}
}
