package Visitor;

import java.util.ArrayList;
import java.util.Iterator;

public class BuyBasket {
	private ArrayList list=new ArrayList();
	public void accept(Visitor visitor) {
		Iterator i = list.iterator();
		while(i.hasNext()) {
			((Producer)i.next()).accept(visitor);
		}
	}
	public void addProduct(Producer pro) {
		list.add(pro);
	}
	public void removeProduct(Producer pro) {
		list.remove(pro);
	}
}
