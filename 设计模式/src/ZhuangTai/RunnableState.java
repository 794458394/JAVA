package ZhuangTai;

public class RunnableState extends ThreadState{
	public RunnableState() {
		// TODO 自动生成的构造函数存根
		state=StateSet.NEW;
		System.out.println("就绪状态");
	}
	public void getCPU(ThreadContext tc) {
		System.out.println("获得CPU时间");
		if(state==StateSet.RUNNABLE)  
			tc.setThreadState(new RunningState());
			else
				System.out.println("当前线程不是就绪状态");
		
	}
}
