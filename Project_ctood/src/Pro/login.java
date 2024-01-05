package Pro;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class login extends JFrame implements ActionListener{
	JLabel pic,l1,l2,heading;
	JTextField t1;
	JPasswordField p1;
	JButton b1;
	login() throws IOException{
		this.setVisible(true);
		this.setBounds(300,75,600,300);
		ImageIcon logo =new ImageIcon("C:\\\\Users\\\\saisa\\\\OneDrive\\\\Desktop\\\\gui\\\\vetAssistance_main200x200.jpg");
		pic=new JLabel();
		pic.setIcon(logo);
		l1=new JLabel("Email:");
		l2=new JLabel("Password:");
		t1=new JTextField (10);
		p1=new JPasswordField(20);
		
		b1=new JButton ("LOGIN");
		b1.setFocusable(false);
		b1.addActionListener(this);
		
		heading=new JLabel("            LOGIN PAGE");
		heading.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		
		
		
		JPanel login=new JPanel(new GridLayout(2,2));
		
		login.add(l1);
		login.add(t1);
	
		login.add(l2);
		login.add(p1);
		login.setBackground(new Color(204, 255, 204 ));
		
		JPanel pan3=new JPanel(new GridLayout());
		JLabel l=new JLabel();
		l.setIcon(logo);
		pan3.add(l);
		pan3.setBackground(new Color(204, 255, 204 ));

		JPanel pan2=new JPanel();
		pan2.add(heading );
		pan2.setBackground(new Color(204, 255, 204 ));
		
		Container contentPane = getContentPane();
		contentPane.add(login,BorderLayout.EAST);
		contentPane.add(pan3,BorderLayout.CENTER);
		contentPane.add(pan2,BorderLayout.NORTH);
		contentPane.add(b1,BorderLayout.SOUTH);
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b1) {
			//if(t1.getText()=="30898@kl.in"&&p1.equals("30898")) {
			JFrame f2=new JFrame("SUCESSFULL");
			f2.setBounds(300,75,300,300);
			f2.setVisible(true);
			JLabel l1=new JLabel("Login Successful");
			l1.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
			f2.add(l1);
			
			//}
		}
			
	}
}
