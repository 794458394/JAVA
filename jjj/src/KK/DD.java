package KK;
import java.util.Scanner;
public class DD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��f(x)=x^2+2x+2�Ķ�����");
        Scanner input=new Scanner(System.in);
		System.out.println("��������������ޣ�");
        float a=input.nextFloat();
        float b=input.nextFloat();
        float c,n=10000,R=0,h=0,i;
        c=(a-b)/n;
        for(i=0;i<a-b;i=i+c);
        { h=(b+i)*(b+i)+2*(b+i)+2;
        R=h*c+R;
        }
        System.out.println("���Ϊ��"+R);

	}

}
