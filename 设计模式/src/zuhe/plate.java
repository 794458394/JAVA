package zuhe;

import java.util.ArrayList;

public class plate extends MyFruit {
	private ArrayList list = new ArrayList();
	public void add(MyFruit fruit) {
		list.add(fruit);
	}
	public void delete (MyFruit fruit) {
		list.remove(fruit);
	}
	@Override
	public void eat() {
		for(Object obj:list) {
			((MyFruit)obj).eat();
		}
	}

}
