package MuBan;

public class Client {
	public static void main(String[] args) {
		Definitellntegral[] x = new Definitellntegral[2];
		x[0]=new DefIntegralXX(0,20,100);
		x[1]=new DefIntegralLN(2.71,20,100);
		for(int i=0;i<2;i++)
			System.out.println(x[i].CalDefiniteIntegral());
	}
}
