package Command;

public class Operator {

	public void MarkFruit(Order order) {
		// TODO �Զ����ɵķ������
		String str="";
		for(String key:order.getFruitmap().keySet()) {
			str+=key+order.getFruitmap().get(key).toString();
		}
		System.out.println("��ȹ�֭:"+str);
	}

}
