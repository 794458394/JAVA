package ZhuangShi;

public class FruitofCake extends Decorating {

	public FruitofCake(IBirthdayCake birthdayCake) {
		super(birthdayCake);
	}
	public void PutFruit() {
		System.out.println("Add Fruit......");
	}
}
