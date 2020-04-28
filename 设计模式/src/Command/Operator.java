package Command;

public class Operator {

	public void MarkFruit(Order order) {
		// TODO 自动生成的方法存根
		String str="";
		for(String key:order.getFruitmap().keySet()) {
			str+=key+order.getFruitmap().get(key).toString();
		}
		System.out.println("混喝果汁:"+str);
	}

}
