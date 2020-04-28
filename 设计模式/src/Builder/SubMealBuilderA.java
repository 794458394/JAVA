package Builder;

public class SubMealBuilderA extends MealBuilder {
 Meal meal = new Meal() ;
	@Override
	public void buildFood() {
		// TODO 自动生成的方法存根
		meal.setFood("鸡肉卷");
		
	}

	@Override
	public void buildDrink() {
		// TODO 自动生成的方法存根
		meal.setDrink("可乐");
	}

	@Override
	public Meal getMeal() {
		// TODO 自动生成的方法存根
		
		return meal;
	}


}
