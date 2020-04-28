package ShiPeiQi;

public class Adapter extends OldJuicer implements INewJuicer {

	public String newPort(MyFruitS fruit1, MyFruitS fruit2) {
		String str ="»ìºÏ¹ûÖ­:"+ onePort(fruit1);
		str+=onePort(fruit2);
		return str;
	}

}
