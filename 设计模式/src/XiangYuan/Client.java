package XiangYuan;

import java.util.Random;

public class Client {
	public static void main(String[] args) {
		Random rm = new Random();
		PieceFactory pf = new PieceFactory();
		for(int i=0;i<19;i++) {
			for(int j=0;j<19;j++) {
				Apiece p ;
				if(rm.nextInt()%2==0)
					p = pf.Get("����");
				else
					p = pf.Get("����");
				p.play(rm.nextInt(19), rm.nextInt(19));
			}
		}
		System.out.println("����������"+pf.piecenumbers()+"������");
		//�������������ӿ��Կ�������Щ������Ȼ���������꣬�����������󣬽�ʡ�˿ռ䣬���Ч��
	}
}
