package Observer;

public class CSB extends SubjectS {

	@Override
	public void notifyObserver() {
		// TODO 自动生成的方法存根
		System.out.println("B目标发生改变");
		for(ObserverO obs:observers) {
			obs.reponse();
	}

}}
