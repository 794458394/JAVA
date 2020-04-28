package JieShiQi;

public class TermianlEx implements Expression {
	private String data;
	public TermianlEx(String data) {
		this.data=data;
	}
	@Override
	public boolean interpret(String context) {
		if(context.contains(data))
		return true;
		return false;
	}

}
