package ZhuangTai;

public class RunningState extends ThreadState {
	public RunningState() {
		// TODO 自动生成的构造函数存根
		state=StateSet.NEW;
		System.out.println("运行状态");
	}
	public void suspend(ThreadContext tc) {
		System.out.println("使用suspend方法");
		if(state==StateSet.RUNNING) 
			tc.setThreadState(new BlockedState());
			else
				System.out.println("当前线程不是运行状态");
		
	}
	public void stop(ThreadContext tc) {
		System.out.println("使用stop方法");
		if(state==StateSet.RUNNING) 
			tc.setThreadState(new DeadState());
			else
				System.out.println("当前线程不是运行状态");
	}
}
