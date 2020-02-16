package Login;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ButtonListener implements ActionListener { //按键监听类
private String str1;
private char[] c = new char[30];
private char[] d = new char[]{'4','5','6','8','5','2'};
public ButtonListener(String str1,char[]c ) {
	this.str1 = str1;
	this.c = c;
}
	@Override
	public void actionPerformed(ActionEvent e) {
		JFrame f1 = new JFrame();
		f1.setSize(350, 350);
		f1.setLocation(500, 300);
		f1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		JLabel a = new JLabel("登陆成功!!");
		a.setFont(new Font("标楷体", Font.BOLD, 30));
		a.setBounds(175,175,280,30);
		JLabel b = new JLabel("账号或密码输入错误!!");
		b.setFont(new Font("标楷体", Font.BOLD, 30));
		b.setBounds(175,175,280,30);
		f1.setVisible(true);
		if(str1.equals("Janji")&&c==d) 
			f1.add(a);
		else
			f1.add(b);
	}

}
