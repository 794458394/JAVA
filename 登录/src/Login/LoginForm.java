package Login;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginForm {   //��¼����������
	public void Login() {
		JFrame f = new JFrame("��¼����"); // ����������
		f.setSize(1028, 698); // ���ô����С
		f.setLocation(220, 100); // ���ô���λ��
		f.setLayout(null); // �������е��������Ϊ���Զ�λ
		JTextField a = new JTextField("");
		a.setFont(new Font("�꿬��", Font.TRUETYPE_FONT | Font.ITALIC, 16)); // ������ʽ
		a.setBounds(380, 250, 280, 30);
		JLabel b = new JLabel("�˺�");
		b.setFont(new Font("΢���ź�", Font.TRUETYPE_FONT, 20));
		b.setBounds(380, 200, 280, 30);
		JLabel c = new JLabel("����");
		c.setFont(new Font("΢���ź�", Font.TRUETYPE_FONT, 20));
		c.setForeground(Color.BLACK);
		c.setBounds(380, 300, 280, 30);
		JPasswordField d = new JPasswordField();   //�������������
		d.setFont(new Font("�꿬��", Font.TRUETYPE_FONT | Font.ITALIC, 16)); 
		d.setBounds(380, 350, 280, 30);
		JButton e = new JButton("��¼");
		e.setBounds(380, 425, 280, 30);
		e.setFont(new Font("������", Font.BOLD, 18));
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
