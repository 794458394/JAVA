package Visitor;

public class Apple implements Producer{

	@Override
	public void accept(Visitor visitor) {
		// TODO �Զ����ɵķ������
		visitor.visit(this);
	}

}
