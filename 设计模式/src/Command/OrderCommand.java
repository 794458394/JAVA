package Command;

public class OrderCommand implements Command {
	private Operator receiver;
	private Order order;
	public OrderCommand(Operator receiver,Order order) {//һ��ִ����һ��Ŀ��
		// TODO �Զ����ɵĹ��캯�����
		this.receiver = receiver;
		this.order = order;
	}
	@Override
	public void execute() {
		System.out.println(order.getId()+"�Ź˿͵ĳ�Ʒ");
		receiver.MarkFruit(order);
	}

}
