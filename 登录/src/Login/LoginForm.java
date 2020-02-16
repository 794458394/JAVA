package Login;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginForm {   //登录界面设置类
	public void Login() {
		JFrame f = new JFrame("登录界面"); // 创建主窗体
		f.setSize(1028, 698); // 设置窗体大小
		f.setLocation(220, 100); // 设置窗体位置
		f.setLayout(null); // 主窗体中的组件设置为绝对定位
		JTextField a = new JTextField("");
		a.setFont(new Font("标楷体", Font.TRUETYPE_FONT | Font.ITALIC, 16)); // 字体样式
		a.setBounds(380, 250, 280, 30);
		JLabel b = new JLabel("账号");
		b.setFont(new Font("微软雅黑", Font.TRUETYPE_FONT, 20));
		b.setBounds(380, 200, 280, 30);
		JLabel c = new JLabel("密码");
		c.setFont(new Font("微软雅黑", Font.TRUETYPE_FONT, 20));
		c.setForeground(Color.BLACK);
		c.setBounds(380, 300, 280, 30);
		JPasswordField d = new JPasswordField();   //创建密码输入框
		d.setFont(new Font("标楷体", Font.TRUETYPE_FONT | Font.ITALIC, 16)); 
		d.setBounds(380, 350, 280, 30);
		JButton e = new JButton("登录");
		e.setBounds(380, 425, 280, 30);
		e.setFont(new Font("汉真广标", Font.BOLD, 18));
		e.setHorizontalAlignment(JTextField.CENTER);
		ButtonListener bl = new ButtonListener(a.getText(), d.getPassword());
		e.addActionListener(bl);
		f.add(a);
		f.add(b);
		f.add(c);
		f.add(d);
		f.add(e);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		
	}
}
