package Strategy;

public class Client {
	public static void main(String[] args) {
		Chef chef = new Chef();
		CutFruit cut=new MultiBlade();
		chef.SetCutMethod(cut);
		chef.CutFruit("Æ»¹û");
	}
}	
