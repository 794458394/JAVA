package YuanXingAndDanli;

public class Client {
	public static void main(String[] args) {
		MyFruitY fru1 = new AppleY();
		MyFruitY fru2 = fru1; //直接复制
		MyFruitY fru3 = (AppleY)fru1.clone();//用克隆方法
		fru1.play();
		fru2.play();
		fru3.play();
		System.out.println("fru1:"+fru1.hashCode());
		System.out.println("fru2:"+fru2.hashCode());
		System.out.println("fru3:"+fru3.hashCode());
		//可以看出克隆才是重新生成一个AppleY对象，因为二者Hashcode不同
	}
}
