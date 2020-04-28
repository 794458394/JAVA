package Observer;

public class CSA extends SubjectS {

	@Override
	public void notifyObserver() {
		// TODO 自动生成的方法存根
		System.out.println("A目标发生改变");
		for(ObserverO obs:observers) {
			obs.reponse();
		}
	}

}
