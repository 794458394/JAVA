package ZhuangTai;

public class NewState extends ThreadState{
	public NewState() {
		// TODO 自动生成的构造函数存根
		state=StateSet.NEW;
		System.out.println("新建线程");
	}
	public void start(ThreadContext tc) {
		System.out.println("使用start方法");
		if(state==StateSet.NEW) 
			tc.setThreadState(new RunnableState());
			else
				System.out.println("当前线程不是新建状态");
		
	}
}
