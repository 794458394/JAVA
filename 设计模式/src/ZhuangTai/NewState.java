package ZhuangTai;

public class NewState extends ThreadState{
	public NewState() {
		// TODO �Զ����ɵĹ��캯�����
		state=StateSet.NEW;
		System.out.println("�½��߳�");
	}
	public void start(ThreadContext tc) {
		System.out.println("ʹ��start����");
		if(state==StateSet.NEW) 
			tc.setThreadState(new RunnableState());
			else
				System.out.println("��ǰ�̲߳����½�״̬");
		
	}
}
