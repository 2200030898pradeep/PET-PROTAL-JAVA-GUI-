package Pro;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class complaint extends JFrame implements ActionListener{
	
	JTextField t1,t2,t3,t4,t5;
	JLabel l1,l2,l3,l4,l5,l6,heading,image;
	JComboBox b1;
	JButton end;
	complaint() {
		
		ImageIcon logo =new ImageIcon("C:\\\\Users\\\\saisa\\\\OneDrive\\\\Desktop\\\\gui\\\\iso-home-banner200x200.jpg");
		
		image=new JLabel();
		image.setIcon(logo);
		JPanel p4=new JPanel();
		p4.add(image);
		
		setBounds(300,175,600,250);
		this.setVisible(true);
		
		String pets[]= {"","Dog","Cat","Rabbit"};
		b1=new JComboBox(pets);
		
		
		l1=new JLabel("Select the Type:");
		l2=new JLabel("Enter the area of missing:");
		l3=new JLabel("Colour of the PET:");
		l4=new JLabel("Tag number:");
		l5=new JLabel("Bookmarks:");
		l6=new JLabel("age:");
		JPanel p2=new JPanel();
		heading=new JLabel("							Complaint Page");
		heading.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		p2.add(heading);
		
		end=new JButton("Raise a complaint");
		end.setFocusable(true);
		end.addActionListener(this);
		JPanel p3=new JPanel();
		p3.add(end);
		
		t1=new JTextField(10);
		t2=new JTextField(10);
		t3=new JTextField(10);
		t4=new JTextField(10);
		t5=new JTextField(10);
		
		JPanel panel1=new JPanel(new GridLayout(6,2));
		panel1.add(l1);
		panel1.add(b1);
		panel1.add(l2);
		panel1.add(t1);
		panel1.add(l3);
		panel1.add(t2);
		panel1.add(l4);
		panel1.add(t3);
		panel1.add(l5);
		panel1.add(t4);
		panel1.add(l6);
		panel1.add(t5);
		
		panel1.setBackground(new Color(204, 255, 204 ));
		p3.setBackground(new Color(204, 255, 204 ));
		p2.setBackground(new Color(204, 255, 204 ));
		p4.setBackground(new Color(204, 255, 204 ));
		
		Container contentPane = getContentPane();
		contentPane.add(panel1,BorderLayout.EAST);
		contentPane.add(p3,BorderLayout.SOUTH);
		contentPane.add(p2,BorderLayout.NORTH);
		contentPane.add(p4,BorderLayout.CENTER);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==end) {
			JFrame f1=new JFrame();
			f1.setVisible(true);
			f1.setBounds(300, 175, 300, 300);
			JLabel t1=new JLabel("Successfully Raised Complaint, Take Care...");
			JPanel panel=new JPanel();
			panel.setBackground(new Color(204, 255, 204 ));
			panel.add(t1);
			f1.add(panel);
		}
		
	}
}
