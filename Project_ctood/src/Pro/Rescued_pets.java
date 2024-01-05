package Pro;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Rescued_pets extends JFrame{
	Rescued_pets(){
		this.setBounds(350,75,600,700);
		this.setVisible(true);		
		
		ImageIcon image=new ImageIcon("C:\\Users\\saisa\\OneDrive\\Desktop\\gui\\logo_animal_rescue_200x200.png");
		ImageIcon dog=new ImageIcon("C:\\Users\\saisa\\OneDrive\\Desktop\\gui\\rescued1new.jpg"); 
		ImageIcon dog2=new ImageIcon("C:\\Users\\saisa\\OneDrive\\Desktop\\gui\\original200.jpg");
		
		JPanel p1=new JPanel(new GridLayout());
		JLabel l1=new JLabel();
		l1.setIcon(image);
		p1.add(l1);
		JPanel p2=new JPanel(new GridLayout(8,1));
		JLabel l2=new JLabel();
		l2.setIcon(dog);
		JLabel l10=new JLabel();
		l10.setIcon(dog2);
		p2.add(l2);
		JLabel l3=new JLabel("Name:charlie,bunny,sunny");
		JLabel l4=new JLabel("Age:3 months(3)");
		JLabel l5=new JLabel("Adapted by Pradeep's Foundation");
		
		
		
		p2.add(l3);
		p2.add(l4);
		p2.add(l5);
		
		p2.add(l10);
		JLabel x3=new JLabel("Name:Snoofy");
		JLabel x4=new JLabel("Age:6 months");
		JLabel x5=new JLabel("Adapted by Pradeep's Foundation");
		p2.add(x3);
		p2.add(x4);
		p2.add(x5);
		
		p1.setBackground(new Color(204, 255, 204 ));
		p2.setBackground(new Color(204, 255, 204 ));
		Container contentPane= getContentPane();
		contentPane.add(p1,BorderLayout.CENTER);
		contentPane.add(p2,BorderLayout.EAST);
	}

	
	
}
