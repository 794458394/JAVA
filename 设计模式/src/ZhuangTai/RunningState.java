package ZhuangTai;

public class RunningState extends ThreadState {
	public RunningState() {
		// TODO �Զ����ɵĹ��캯�����
		state=StateSet.NEW;
		System.out.println("����״̬");
	}
	public void suspend(ThreadContext tc) {
		System.out.println("ʹ��suspend����");
		if(state==StateSet.RUNNING) 
			tc.setThreadState(new BlockedState());
			else
				System.out.println("��ǰ�̲߳�������״̬");
		
	}
	public void stop(ThreadContext tc) {
		System.out.println("ʹ��stop����");
		if(state==StateSet.RUNNING) 
			tc.setThreadState(new DeadState());
			else
				System.out.println("��ǰ�̲߳�������״̬");
	}
}
