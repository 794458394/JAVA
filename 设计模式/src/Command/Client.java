package Command;

public class Client {
	public static void main(String[] args) {
		//�����������
		Order order1=new Order();
		order1.setId(1);
		order1.setFruitmap("����", 1);
		order1.setFruitmap("����", 2);
		order1.setFruitmap("����", 3);
		
		Order order2=new Order();
		order2.setId(2);
		order2.setFruitmap("�㽶", 1);
		order2.setFruitmap("����", 2);
		order2.setFruitmap("⨺���", 3);
		//����������
		Operator op=new Operator();
//		�����������װ���������
		OrderCommand cmd1=new OrderCommand(op, order1);
		OrderCommand cmd2=new OrderCommand(op, order2);
//		���������߲�������
		WaiterC cc=new WaiterC();
		cc.SetCommand(cmd1);
		cc.SetCommand(cmd2);
//		ִ������
		cc.OrderUp();		
	}
}
