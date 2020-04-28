package Chain;

import java.util.ArrayList;
import java.util.List;

public abstract class Fruitsort {
	private int weight;
	protected List<String> fruitBox;
	private Fruitsort nextFruitsort;
	public void getFruitBox() {
		System.out.println("weight:"+weight);
		System.out.println("amount:"+fruitBox.size());
		for(String t:fruitBox) {
			System.out.println(t+",");
		}
		System.out.println("");
	}
	public void setNextsort(Fruitsort nextFruitsort) {
		this.nextFruitsort=nextFruitsort;
	}
	public Fruitsort(int weight) {
		this.weight=weight;
		fruitBox=new ArrayList<String>();
	}
	public void sendFruit(int weight,String fruit) {
		if(this.weight<=weight)
			pushBox(fruit);
		else
			if(nextFruitsort!=null)
				nextFruitsort.sendFruit(weight, fruit);
	}
	protected abstract void pushBox(String fruit);
}
