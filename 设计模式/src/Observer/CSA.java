package Observer;

public class CSA extends SubjectS {

	@Override
	public void notifyObserver() {
		// TODO �Զ����ɵķ������
		System.out.println("AĿ�귢���ı�");
		for(ObserverO obs:observers) {
			obs.reponse();
		}
	}

}
