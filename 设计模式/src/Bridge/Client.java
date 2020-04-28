package Bridge;

public class Client {
	public static void main(String[] args) {
		Color color = new Blue();
		Pen pen  = new SmallPen();
		pen.setColor(color);
		pen.draw("Äñ");
	}
	
}
