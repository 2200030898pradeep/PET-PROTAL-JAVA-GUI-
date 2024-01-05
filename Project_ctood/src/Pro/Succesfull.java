package Pro;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Succesfull extends JFrame{
	Succesfull(){
	
		setBounds(300,75,400,200);
		JLabel l1=new JLabel("Succesfully registered");
		l1.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		JButton b1=new JButton("click here");
		b1.setSize(50,50);
		JLabel l2=new JLabel("You can now go back to login page and login");
		l2.add(b1);
		l2.setFont(new Font("Comic Sans MS", Font.BOLD, 9));
		l2.setLayout(new FlowLayout());
		
		Container contentPane = getContentPane();
		contentPane.add(l1,BorderLayout.CENTER);
		contentPane.add(l2,BorderLayout.SOUTH);
		contentPane.setBackground(Color.green);
		setVisible(true);
	}
}
