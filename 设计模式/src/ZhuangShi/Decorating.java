package ZhuangShi;

public class Decorating implements IBirthdayCake {
	private IBirthdayCake brithadyCake;
	public Decorating(IBirthdayCake birthdayCake) {
		this.brithadyCake=birthdayCake;
	}
	public void Show() {
		brithadyCake.Show();
	}

}
