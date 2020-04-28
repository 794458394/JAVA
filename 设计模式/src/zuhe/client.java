package zuhe;

public class client {
	public static void main(String[] args) {
		MyFruit a,b,c;
		plate p = new plate();plate q = new plate();
		a = new apple();
		b = new apple();
		c = new pear();
		p.add(a);
		p.add(c);
		q.add(b);
		p.add(q);
		p.eat();
	}
}
