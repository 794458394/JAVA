package YuanXingAndDanli;

import java.util.Hashtable;

public class MyFruitStoreY {
	private static Hashtable fruittable = new Hashtable<Integer,MyFruitY>();
	private static MyFruitStoreY fruitstore = null;
	private MyFruitStoreY() {
		fruittable = new Hashtable<Integer,MyFruitY>();
	}
	public static MyFruitStoreY Getfruitstore() {
		if(fruitstore==null) {
			fruitstore=new MyFruitStoreY();
		}
		return fruitstore;
	}
	public  void Add(Integer key, MyFruitY fruit) {
		fruittable.put(key, fruit);
	}
	public  MyFruitY Get(Integer key) {
		MyFruitY fruit = (MyFruitY) fruittable.get(key);
		return (MyFruitY) fruit.clone();
	}
}
