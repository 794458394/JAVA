package Visitor;

public class Book implements Producer{

	@Override
	public void accept(Visitor visitor) {
		// TODO �Զ����ɵķ������
		visitor.visit(this);
	}

}
