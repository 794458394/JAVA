package ZhongJieZhe;

public class DiamondMember extends Member {

	public DiamondMember(String name) {
		super(name);
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public void sendText(String message, String to) {
		System.out.println("��ʯ��Ա������Ϣ:");
		chatroom.sendText(name,message,to);
	}

	@Override
	public void sendImage(String Image, String to) {
		System.out.println("��ʯ��Ա����ͼƬ:");
		chatroom.sendText(name,Image,to);
	}

}
