package DaiLi;

public class CRemoPic implements IShow {

	@Override
	public void ShowPic(String name) {
		for(int i=0;i<3;i++) {
			System.out.println(i+1);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}

}
