package MuBan;

public class DefIntegralLN extends Definitellntegral {
	private double a,b;
	private int c;
	public DefIntegralLN(double a,double b,int c) {
		this.a=a;this.b=b;this.c=c;
	}
	@Override
	protected double geta() {
		// TODO �Զ����ɵķ������
		return a;
	}

	@Override
	protected double getb() {
		// TODO �Զ����ɵķ������
		return b;
	}

	@Override
	protected int getc() {
		// TODO �Զ����ɵķ������
		return c;
	}

	@Override
	protected double function(double x) {
		// TODO �Զ����ɵķ������
		return Math.log(x);
	}

}
