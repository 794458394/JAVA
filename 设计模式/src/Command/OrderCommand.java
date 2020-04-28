package Command;

public class OrderCommand implements Command {
	private Operator receiver;
	private Order order;
	public OrderCommand(Operator receiver,Order order) {//一个执行者一个目标
		// TODO 自动生成的构造函数存根
		this.receiver = receiver;
		this.order = order;
	}
	@Override
	public void execute() {
		System.out.println(order.getId()+"号顾客的成品");
		receiver.MarkFruit(order);
	}

}
