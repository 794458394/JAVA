package Visitor;

public class Customer extends Visitor{

	@Override
	public void visit(Apple apple) {
		// TODO �Զ����ɵķ������
		System.out.println("�˿�"+name+"ѡƻ��");
	}

	@Override
	public void visit(Book book) {
		// TODO �Զ����ɵķ������
		System.out.println("�˿�"+name+"����");
	}

}
