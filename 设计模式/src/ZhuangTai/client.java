package ZhuangTai;

public class client {
	public static void main(String[] args) {
		ThreadContext tc=new ThreadContext();
		tc.start();
		tc.getCPU();
		tc.suspend();
	}
}
