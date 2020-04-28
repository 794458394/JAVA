package Visitor;

public class Client {
	public static void main(String[] args) {
		Producer b1=new Book();
		Producer b2=new Book();
		Producer b3=new Apple();
		Visitor vis=new Saler();
		
		
		BuyBasket bas=new BuyBasket();
		bas.addProduct(b1);
		bas.addProduct(b2);
		bas.addProduct(b3);
		
		vis.setName("Ao");
		bas.accept(vis);
	}
}
