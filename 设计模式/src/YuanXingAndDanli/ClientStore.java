package YuanXingAndDanli;

public class ClientStore {
	public static void main(String[] args) {
		MyFruitY frua = new AppleY();
		MyFruitY frub = new BananaY();
		MyFruitStoreY mfs = MyFruitStoreY.Getfruitstore();
		MyFruitStoreY mfs1 = MyFruitStoreY.Getfruitstore();
		mfs.Add(1, frua);
		mfs.Add(2, frub);
		mfs.Add(3, new AppleY());
		mfs.Add(4, new BananaY());
		MyFruitY fru = mfs.Get(4);
		fru.play();
		 System.out.println("mfs:"+mfs.toString());
		 System.out.println("mfs1:"+mfs1.toString());//即使是再new一个store，发现还是原来那个，因为他们地址一致
	}
}
