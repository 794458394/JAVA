package YuanXingAndDanli;

public class MyFruitY implements Cloneable {
	protected String kind;
	public Object clone() {
		Object obj = null;
		try {
			obj=super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return obj;
	}
	public void play() {
		System.out.println(kind);
	}
}
