package ZhongJieZhe;

public class Client {
	public static void main(String[] args) {
		Chatroom HappyChat = new Chatgroup();
		Member member1,member2,member3;
		member1 = new DiamondMember("A");
		member2 = new CommonMember("B");
		member3 = new CommonMember("C");
		HappyChat.register(member1);
		HappyChat.register(member2);
		HappyChat.register(member3);
		member1.sendText("hi!", "B");
		member2.sendText("¹ö°¡!", "A");
		member1.sendImage("^^", "C");
		member3.sendImage("= =", "A");
	}
	
}
