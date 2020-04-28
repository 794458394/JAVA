package WaiGuan;

public class GeneralSwitch {
	private Light lights[]=new Light[4];
	private Fan fan ;
	private Tv tv;
	public GeneralSwitch() {
	lights[0]=new Light("Ç°");
	lights[1]=new Light("ºó");
	lights[2]=new Light("×ó");
	lights[3]=new Light("ÓÒ");
	fan = new Fan();
	tv = new Tv();
	}
	public void on() {
		lights[0].on();
		lights[1].on();
		lights[2].on();
		lights[3].on();
		fan.on();
		tv.on();
	}
}
