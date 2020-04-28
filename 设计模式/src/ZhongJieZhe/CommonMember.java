package ZhongJieZhe;

public class CommonMember extends Member {

	public CommonMember(String name) {
		super(name);
	}

	@Override
	public void sendText(String message,String to) {
		System.out.println("普通会员发送消息:");
		chatroom.sendText(name,message,to);
	}

	@Override
	public void sendImage(String Image,String to) {
		System.out.println("普通会员无法发送图片!");
	}

}
