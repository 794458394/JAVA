package Builder;

public class Client {
public static void main(String[] args) {
	MealBuilder mb = new SubMealBuilderA();
	KFCWaiter waiter = new KFCWaiter(); 
	waiter.setMealBuilder(mb);  //服务员准备送出套餐
	Meal meal = waiter.construct();//服务员上菜
	System.out.println(meal.getDrink()+"\n"+meal.getFood());
}
}
