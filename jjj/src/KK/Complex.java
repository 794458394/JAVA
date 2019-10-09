package KK;

public class Complex {
		private double a,b;   //复数的实部和虚部
		public Complex()
		{
			this.a = 0.0;
			this.b = 0.0;
		}
		
		public Complex(double a,double b)      //重载构造函数
		{
			this.a=a;
			this.b=b;
		}
		public Complex(Complex C)        //重载构造函数，将当前对象值设置为参数值
	 	{
			this.a = C.a;        
			this.b = C.b;
		}
		public double getRealPart()    //返回实部
		{
			 return a;
		}
		public double getImaginaryPart() //返回虚部
		{  
	        return b;
	    }
		public String toString()    //将复数显示为一个字符串
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
				return a+"";    //加上""，是为了返回一个string类型的值
			}
		}
		/*
	      复数的加法运算 z = x + y的运算法则是：
	      z.实部 = x.实部 + y.实部
	      z.虚部 = x.虚部 + y.虚部
	     */
		public Complex add(Complex C)
		{
			if(C == null)
			{
				System.err.println("对象不能够为null！");
				return new Complex();
			}
			return new Complex(this.a+C.a,this.b+C.b);
		}
		/*
	     复数的减法运算 z = x - y的运算法则是：
	     z.实部 = x.实部 - y.实部
	     z.虚部 = x.虚部 - y.虚部
	     */
		public Complex minus(Complex C)
		{
			if(C == null)
			{
				System.err.println("对象不能够为null！");
				return new Complex();
			}
			return new Complex(this.a-C.a,this.b-C.b);
		}
		/*
	     复数的乘法运算 z = x * y的运算法则是：
	     z.实部 = x.实部 * y.实部 - x.虚部 * y.虚部
	     z.虚部 = x.实部 * y.虚部 + x.虚部 * y.实部
	     */
		public Complex multiply(Complex C)
		{
			if(C == null)
			{
				System.err.println("对象不能够为null！");
				return new Complex();
			}
			double newa = this.a*C.a - this.b*C.b;   //新建一个实部
			double newb = this.a*C.b + this.b*C.a;   //新建一个虚部
			return new Complex(newa,newb);
		}
		/*
	     复数的除法运算 z = x / y 的运算法则是：
	     z.实部 = (x.实部 * y.实部 + x.虚部 * y.虚部) / (y.实部* y.实部 + y.虚部 * y.虚部)
	     z.虚部 = (x.虚部 * y.实部 - x.实部 * y.虚部) / (y.实部 * y.实部 + y.虚部 * y.虚部)
	     */
		public Complex divide(Complex C)
		{
			if(C == null)
			{
				System.err.println("对象不能够为null！");
				return new Complex();
			}
			if(C.a==0.0&&b==0.0)
			{
				System.err.println("除数不能为0！");
				return new Complex();
			}
			double newa = (this.a*C.a + this.b*C.b) / (C.a*C.a + C.b*C.b);
			double newb = (this.b*C.a - this.a*C.b) / (C.a*C.a + C.b*C.b);
			return new Complex(newa,newb);
		}
		public static void main(String[] args) {
			Complex x = new Complex(13,14);       //声明对象，创建实例，引用赋值
			Complex y = new Complex(20,25);
			System.out.println("x:" + x.toString());
			System.out.println("y:" + y.toString());
			System.out.println("(x + y) = " + x.add(y).toString());
			System.out.println("(x - y) = " + x.minus(y).toString());
			System.out.println("(x * y) = " + x.multiply(y).toString());
			System.out.println("(x / y) = " + x.divide(y).toString());
		
	
 }
}
	
	


