package Strategy;

public class Chef {
	private CutFruit cutmethod;
	public void SetCutMethod(CutFruit cutmethod) {
		this.cutmethod=cutmethod;
	}
	public void CutFruit(String fruitname) {
		cutmethod.CutStrategy(fruitname);
	}
}
