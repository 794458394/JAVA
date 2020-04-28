package Chain;

import java.util.Random;

public class Client {
	public static void main(String[] args) {
		Fruitsort bfs,mfs,sfs;
		bfs=new BigFruitsort(9);
		mfs=new MidFruitsort(5);
		sfs=new SmallFruitsort(2);
		
		bfs.setNextsort(mfs);
		mfs.setNextsort(sfs);
		
		Random rm = new Random();
		for(int i=0;i<1000;i++) {
			int weight=rm.nextInt(10);
			bfs.sendFruit(weight, "Ёхвс");
		}
		bfs.getFruitBox();
		mfs.getFruitBox();
		sfs.getFruitBox();
	}
}
