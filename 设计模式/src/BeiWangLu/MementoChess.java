package BeiWangLu;
//棋子备忘录 （棋子状态）
public class MementoChess {
	private String label;
	private int x,y;
	public MementoChess(String label,int x,int y) {
		this.label = label;
		this.x= x;
		this.y = y;
	}
	public String getLabel() {     //label 棋子名称
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x= x;
	}
	public void setY(int y ) {
		this.y = y;
	}
}
