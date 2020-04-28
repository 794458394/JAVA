package ZhuangTai;

public class BlockedState extends ThreadState {
	public BlockedState() {
		// TODO 自动生成的构造函数存根
		state=StateSet.NEW;
		System.out.println("阻塞状态");
	}
	public void resume(ThreadContext tc) {
		System.out.println("使用resume方法");
		if(state==StateSet.BLOCKED) 
			tc.setThreadState(new RunnableState());
			else
				System.out.println("当前线程不是阻塞状态");
		
}}

