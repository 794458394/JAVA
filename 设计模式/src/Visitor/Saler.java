package Visitor;

public class Saler extends Visitor{

	@Override
	public void visit(Apple apple) {
		// TODO �Զ����ɵķ������
		System.out.println("����Ա"+name+"��ƻ���۸�");
	}

	@Override
	public void visit(Book book) {
		// TODO �Զ����ɵķ������
		System.out.println("����Ա"+name+"����۸�");
	}

}
