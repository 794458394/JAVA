package ShiPeiQi;

public class Client {
	public static void main(String[] args) {
		INewJuicer newjuicer = new Adapter();
		MyFruitS f1,f2;
		f1=new AppleS();
		f2=new PearS();
		System.out.println(newjuicer.newPort(f1, f2));
	}
	
}
