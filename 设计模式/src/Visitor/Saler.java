package Visitor;

public class Saler extends Visitor{

	@Override
	public void visit(Apple apple) {
		// TODO 自动生成的方法存根
		System.out.println("收银员"+name+"算苹果价格");
	}

	@Override
	public void visit(Book book) {
		// TODO 自动生成的方法存根
		System.out.println("收银员"+name+"算书价格");
	}

}
