package JieShiQi;

public class client {
	public static void main(String[] args) {
		Expression isMale = getMaleExpression();
		Expression isMarriedWoman=getMarriedWomanExpression();
		
		System.out.println("Max is male?"+isMale.interpret("Robert Max"));
	}
	private static Expression getMaleExpression() {
		Expression robert=new TermianlEx("Robert");
		Expression max=new TermianlEx("Max");
		return new OrEx(robert,max);
	}
	private static Expression getMarriedWomanExpression() {
		Expression lily=new TermianlEx("Lily");
		Expression married=new TermianlEx("Marrried");
		return new AndEx(lily,married);
	}
}
