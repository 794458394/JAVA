package KK;

public class Complex {
		private double a,b;   //������ʵ�����鲿
		public Complex()
		{
			this.a = 0.0;
			this.b = 0.0;
		}
		
		public Complex(double a,double b)      //���ع��캯��
		{
			this.a=a;
			this.b=b;
		}
		public Complex(Complex C)        //���ع��캯��������ǰ����ֵ����Ϊ����ֵ
	 	{
			this.a = C.a;        
			this.b = C.b;
		}
		public double getRealPart()    //����ʵ��
		{
			 return a;
		}
		public double getImaginaryPart() //�����鲿
		{  
	        return b;
	    }
		public String toString()    //��������ʾΪһ���ַ���
		{
			if(b!=0.0)
			{
				if(a==0.0)
				{
					return b+"i";
				}
				else
				{
					return a+"+"+b+"i";
				}
			}
			else
			{
				return a+"";    //����""����Ϊ�˷���һ��string���͵�ֵ
			}
		}
		/*
	      �����ļӷ����� z = x + y�����㷨���ǣ�
	      z.ʵ�� = x.ʵ�� + y.ʵ��
	      z.�鲿 = x.�鲿 + y.�鲿
	     */
		public Complex add(Complex C)
		{
			if(C == null)
			{
				System.err.println("�����ܹ�Ϊnull��");
				return new Complex();
			}
			return new Complex(this.a+C.a,this.b+C.b);
		}
		/*
	     �����ļ������� z = x - y�����㷨���ǣ�
	     z.ʵ�� = x.ʵ�� - y.ʵ��
	     z.�鲿 = x.�鲿 - y.�鲿
	     */
		public Complex minus(Complex C)
		{
			if(C == null)
			{
				System.err.println("�����ܹ�Ϊnull��");
				return new Complex();
			}
			return new Complex(this.a-C.a,this.b-C.b);
		}
		/*
	     �����ĳ˷����� z = x * y�����㷨���ǣ�
	     z.ʵ�� = x.ʵ�� * y.ʵ�� - x.�鲿 * y.�鲿
	     z.�鲿 = x.ʵ�� * y.�鲿 + x.�鲿 * y.ʵ��
	     */
		public Complex multiply(Complex C)
		{
			if(C == null)
			{
				System.err.println("�����ܹ�Ϊnull��");
				return new Complex();
			}
			double newa = this.a*C.a - this.b*C.b;   //�½�һ��ʵ��
			double newb = this.a*C.b + this.b*C.a;   //�½�һ���鲿
			return new Complex(newa,newb);
		}
		/*
	     �����ĳ������� z = x / y �����㷨���ǣ�
	     z.ʵ�� = (x.ʵ�� * y.ʵ�� + x.�鲿 * y.�鲿) / (y.ʵ��* y.ʵ�� + y.�鲿 * y.�鲿)
	     z.�鲿 = (x.�鲿 * y.ʵ�� - x.ʵ�� * y.�鲿) / (y.ʵ�� * y.ʵ�� + y.�鲿 * y.�鲿)
	     */
		public Complex divide(Complex C)
		{
			if(C == null)
			{
				System.err.println("�����ܹ�Ϊnull��");
				return new Complex();
			}
			if(C.a==0.0&&b==0.0)
			{
				System.err.println("��������Ϊ0��");
				return new Complex();
			}
			double newa = (this.a*C.a + this.b*C.b) / (C.a*C.a + C.b*C.b);
			double newb = (this.b*C.a - this.a*C.b) / (C.a*C.a + C.b*C.b);
			return new Complex(newa,newb);
		}
		public static void main(String[] args) {
			Complex x = new Complex(13,14);       //�������󣬴���ʵ�������ø�ֵ
			Complex y = new Complex(20,25);
			System.out.println("x:" + x.toString());
			System.out.println("y:" + y.toString());
			System.out.println("(x + y) = " + x.add(y).toString());
			System.out.println("(x - y) = " + x.minus(y).toString());
			System.out.println("(x * y) = " + x.multiply(y).toString());
			System.out.println("(x / y) = " + x.divide(y).toString());
		
	
 }
}
	
	


