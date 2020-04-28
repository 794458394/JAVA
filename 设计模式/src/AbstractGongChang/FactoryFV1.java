package AbstractGongChang;

public class FactoryFV1 implements FruitandVegetables {

	public Fruit1 CreatF() {
		return new Apple2();
	}

	public Vegetable1 CreatV() {
		return new Tomato();
	}

}
