package ZhuangShi;

public class Client {
	public static void main(String[] args) {
		IBirthdayCake birthdaycake = new Cake();
		birthdaycake.Show();
		Cream cream=new Cream(birthdaycake);
		cream.PutCream();
		FruitofCake f = new FruitofCake(cream);
		f.PutFruit();
	}
	
}
