package JieShiQi;

public class AndEx implements Expression {
	private Expression ex1=null;
	private Expression ex2=null;
	public AndEx(Expression ex1,Expression ex2) {
		this.ex1=ex1;
		this.ex2=ex2;
	}
	@Override
	public boolean interpret(String context) {
		// TODO �Զ����ɵķ������
		return ex1.interpret(context)&&ex2.interpret(context);
	}

}
