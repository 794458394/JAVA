package ZhongJieZhe;

public class DiamondMember extends Member {

	public DiamondMember(String name) {
		super(name);
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void sendText(String message, String to) {
		System.out.println("钻石会员发送消息:");
		chatroom.sendText(name,message,to);
	}

	@Override
	public void sendImage(String Image, String to) {
		System.out.println("钻石会员发送图片:");
		chatroom.sendText(name,Image,to);
	}

}
