package YuanXingAndDanli;

public class Client {
	public static void main(String[] args) {
		MyFruitY fru1 = new AppleY();
		MyFruitY fru2 = fru1; //ֱ�Ӹ���
		MyFruitY fru3 = (AppleY)fru1.clone();//�ÿ�¡����
		fru1.play();
		fru2.play();
		fru3.play();
		System.out.println("fru1:"+fru1.hashCode());
		System.out.println("fru2:"+fru2.hashCode());
		System.out.println("fru3:"+fru3.hashCode());
		//���Կ�����¡������������һ��AppleY������Ϊ����Hashcode��ͬ
	}
}
