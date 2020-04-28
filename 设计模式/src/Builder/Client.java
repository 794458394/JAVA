package Builder;

public class Client {
public static void main(String[] args) {
	MealBuilder mb = new SubMealBuilderA();
	KFCWaiter waiter = new KFCWaiter(); 
	waiter.setMealBuilder(mb);  //����Ա׼���ͳ��ײ�
	Meal meal = waiter.construct();//����Ա�ϲ�
	System.out.println(meal.getDrink()+"\n"+meal.getFood());
}
}
