package ZhongJieZhe;

import java.util.Hashtable;

public class Chatgroup extends Chatroom {

	private Hashtable members = new Hashtable();
	

	@Override
	public void register(Member member) {
		if(!members.contains(member)) {
			members.put(member.getName(),member);
			member.setChatroom(this);
		}
	}

	@Override
	public void sendText(String from, String massage,String to) {
		Member member = (Member)members.get(to);
		String newMassage = massage;
		newMassage = massage.replaceAll("��", "*");//������Ϣ(�����໰����)
		member.receiveText(from,newMassage);
	}

	@Override
	public void sendImage(String from, String image,String to) {
		Member member = (Member) members.get(to);
		if(image.length()>5)
		{
			System.out.println("ͼƬ�����ߴ�!");
		}
		else
		{
			member.receiveImage(from,image);
		}
	}

}
