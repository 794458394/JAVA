package Visitor;

public class Apple implements Producer{

	@Override
	public void accept(Visitor visitor) {
		// TODO 自动生成的方法存根
		visitor.visit(this);
	}

}
