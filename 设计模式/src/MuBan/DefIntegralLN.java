package MuBan;

public class DefIntegralLN extends Definitellntegral {
	private double a,b;
	private int c;
	public DefIntegralLN(double a,double b,int c) {
		this.a=a;this.b=b;this.c=c;
	}
	@Override
	protected double geta() {
		// TODO 自动生成的方法存根
		return a;
	}

	@Override
	protected double getb() {
		// TODO 自动生成的方法存根
		return b;
	}

	@Override
	protected int getc() {
		// TODO 自动生成的方法存根
		return c;
	}

	@Override
	protected double function(double x) {
		// TODO 自动生成的方法存根
		return Math.log(x);
	}

}
