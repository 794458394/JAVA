package DieDaiQi;

public class client {
	public static void dispaly(Tv tv) {
		TvIterator i = tv.creatIterator();
		System.out.println("���ӻ�Ƶ��:");
		while(!i.isLast()) {
			System.out.println(i.currentChannel());
			i.next();
		}
	}
	public static void main(String[] args) {
		Tv tv=new TCL();
		client.dispaly(tv);
	}
}
