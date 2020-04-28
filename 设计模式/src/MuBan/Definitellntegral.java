package MuBan;

public abstract class Definitellntegral {
	abstract protected double geta();//下限
	abstract protected double getb();//上限
	abstract protected int getc();//切分单元格
	abstract protected double function(double x);//积分函数
	public final double CalDefiniteIntegral() {
		double a=0,b=0,t=0,sum=0;
		int c=0;
		a=geta();b=getb();c=getc();
		if(a>b) {
			t=a;a=b;b=t;
		}
		t=(b-a)/(double)c;
		for(int i=0;i<c;i++) {
			sum=sum+t*function(a+i*t);
		}
		return sum;
	}
}
