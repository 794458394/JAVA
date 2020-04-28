package GongChang;

public class Client {
	public static void main(String[] args) {
		Factory factoryA = new FactoryA();
		Fruit fruitA = factoryA.CreatFruit();
		fruitA.eat();
	}
}
