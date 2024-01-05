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
import javax.swing.border.Border;


public class register extends JFrame implements ActionListener{
	JTextField t1,t2,t3,t4,t5,t6,t7,t8;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,pic,heading;
	JButton b1;
	register() {
		
		Border blackline = BorderFactory.createLineBorder(Color.black);
		
		ImageIcon logo =new ImageIcon("C:\\\\Users\\\\saisa\\\\OneDrive\\\\Desktop\\\\gui\\\\vetAssistance_main200x200.jpg");
		pic=new JLabel();
		pic.setIcon(logo);
		
		this.setBounds(300, 75, 600,600);
		this.setVisible(true);
		
		heading=new JLabel("        REGISTER PAGE");
		heading.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		t1=new JTextField(20);
		t3=new JTextField(10);
		t4=new JTextField(10);
		t2=new JTextField(10);
		t5=new JTextField(10);
		t6=new JTextField(10);
		t7=new JTextField(10);
		t8=new JTextField(10);
		
		l1=new JLabel("Name:");
		l2=new JLabel("Breed:");
		l3=new JLabel("Age");
		l4=new JLabel("Colour:");
		l5=new JLabel("Weight");
		l6=new JLabel("Unique Feature");
		l7=new JLabel("Owner's Name");
		l8=new JLabel("Locality");
		
		
		
		b1=new JButton("Register");
		b1.addActionListener(this);
		
		JPanel pan1=new JPanel(new GridLayout(8,2));
		pan1.add(l1);
		pan1.add(t1);
		pan1.add(l2);
		pan1.add(t2);
		pan1.add(l3);
		pan1.add(t3);
		pan1.add(l4);
		pan1.add(t4);
		pan1.add(l5);
		pan1.add(t5);
		pan1.add(l6);
		pan1.add(t6);
		pan1.add(l7);
		pan1.add(t7);
		pan1.add(l8);
		pan1.add(t8);
		pan1.setBackground(new Color(204, 255, 204 ));
		
		JPanel pan2=new JPanel();
		pan2.add(heading );
		pan2.setBackground(new Color(204, 255, 204 ));
		
		JPanel pan3=new JPanel(new GridLayout());
		JLabel l=new JLabel();
		l.setIcon(logo);
		pan3.add(l);
		pan3.setBackground(new Color(204, 255, 204 ));
		
		pan2.setBorder(blackline);
		
		Container contentPane = getContentPane();
		contentPane.add(pan1,BorderLayout.EAST);
		contentPane.add(pan3,BorderLayout.CENTER);
		contentPane.add(pan2,BorderLayout.NORTH);
		contentPane.add(b1,BorderLayout.SOUTH);
	}

	public void actionPerformed(ActionEvent e)  {
		
		
		if(e.getSource()==b1) {
			String name =t1.getText();
			String breed=t2.getText();
			String age=t3.getText();
			String colour=t4.getText();
			String weight=t5.getText();
			String feature=t6.getText();
			String ownername=t7.getText();
			String locality=t8.getText();
			new Succesfull();
		}
	}
}
