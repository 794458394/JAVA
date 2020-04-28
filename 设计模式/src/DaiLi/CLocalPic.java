package DaiLi;

public class CLocalPic implements IShow,Runnable{
	private IShow pic;
	 private String name;
	@Override
	public void ShowPic(String name) {
		pic=new CRemoPic();
		this.name = name;
		System.out.println("准备载入图片"+name);
		Thread th=new Thread(this);
		th.start();
	}

	@Override
	public void run() {	
		pic.ShowPic(name);
		System.out.println(name+"图片载入成功");
	}
	
}
