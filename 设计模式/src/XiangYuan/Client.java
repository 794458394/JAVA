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
					p = pf.Get("白棋");
				else
					p = pf.Get("黑棋");
				p.play(rm.nextInt(19), rm.nextInt(19));
			}
		}
		System.out.println("棋盘上已有"+pf.piecenumbers()+"个棋子");
		//从已有两个棋子可以看出，这些棋子虽然生成了坐标，但就两个对象，节省了空间，提高效率
	}
}
