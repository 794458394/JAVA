package YuanXingAndDanli;

public class MyFruitY implements Cloneable {
	protected String kind;
	public Object clone() {
		Object obj = null;
		try {
			obj=super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		return obj;
	}
	public void play() {
		System.out.println(kind);
	}
}
