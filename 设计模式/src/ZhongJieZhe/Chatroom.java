package ZhongJieZhe;

public abstract class Chatroom {
	public abstract void register(Member member);
	public abstract void sendText(String from,String massage,String to);
	public abstract void sendImage(String from,String Image,String to);
	
}