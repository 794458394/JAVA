package ZhuangTai;

public class ThreadContext {
	private ThreadState threadstate;
	public ThreadContext() {
		threadstate=new NewState();
	}
	public ThreadState getThreadState() {
		return threadstate;
	}
	public void setThreadState(ThreadState threadstate) {
		// TODO 自动生成的方法存根
		this.threadstate=threadstate;
	}
	public void start() {
		((NewState)threadstate).start(this);
	}
	public void getCPU() {
		((RunnableState)threadstate).getCPU(this);
	}
	public void suspend() {
		((RunningState)threadstate).suspend(this);
	}
	public void resume() {
		((BlockedState)threadstate).resume(this);
	}
	public void stop() {
		((RunningState)threadstate).stop(this);
	}
}
