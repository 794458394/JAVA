package ZhuangTai;

public class BlockedState extends ThreadState {
	public BlockedState() {
		// TODO �Զ����ɵĹ��캯�����
		state=StateSet.NEW;
		System.out.println("����״̬");
	}
	public void resume(ThreadContext tc) {
		System.out.println("ʹ��resume����");
		if(state==StateSet.BLOCKED) 
			tc.setThreadState(new RunnableState());
			else
				System.out.println("��ǰ�̲߳�������״̬");
		
}}

