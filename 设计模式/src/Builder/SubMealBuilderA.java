package Builder;

public class SubMealBuilderA extends MealBuilder {
 Meal meal = new Meal() ;
	@Override
	public void buildFood() {
		// TODO �Զ����ɵķ������
		meal.setFood("�����");
		
	}

	@Override
	public void buildDrink() {
		// TODO �Զ����ɵķ������
		meal.setDrink("����");
	}

	@Override
	public Meal getMeal() {
		// TODO �Զ����ɵķ������
		
		return meal;
	}


}
