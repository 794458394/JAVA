package KK;
import java.util.Scanner;
public class Cjj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;
		String str1=new String("of beer on the wall.");
		String str2=new String("of beer");
		String str3=new String("Take one down.");
		String str4=new String("Pass it around.");
		for(N=99;N>=0;N--)
		{	if (N>2)
		System.out.println (N+"bottles"+str1+N+"bottles"+str2+"\n"+str3+"\n"+str4+"\n"+(N-1)+"bottles"+str1);
			else if(N>0&&N<2)
		System.out.println (N+"bottle"+str1+N+"bottle"+str2+"\n"+str3+"\n"+str4+"\n"+(N-1)+"bottle"+str1);
			else 
				System.out.println("no more bottles of beers on the wall");}
		

	}

}
