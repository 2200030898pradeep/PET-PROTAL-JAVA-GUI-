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

public class PetshopProject extends JFrame implements ActionListener
{
	JPanel panel1,panel2,panel3,panel4;
	JLabel jLabel,label1,label2,label3,l3,label4;
	JButton button1,button2,button3,b1,b2;
	PetshopProject() throws IOException{
		setBounds(350,100,500,500);
		Border blackline = BorderFactory.createLineBorder(Color.black);
		ImageIcon logo =new ImageIcon("C:\\\\Users\\\\saisa\\\\OneDrive\\\\Desktop\\\\gui\\\\logoo90x90.png");
		ImageIcon logo2 =new ImageIcon("C:\\\\Users\\\\saisa\\\\OneDrive\\\\Desktop\\\\gui\\\\CMP-Ad-05300x300.png");
		
		File file3 = new File("C:\\Users\\saisa\\OneDrive\\Desktop\\gui\\logoo90x90.png");
        BufferedImage bufferedImage3 = ImageIO.read(file3);
        setIconImage(bufferedImage3);
		
        panel1=new JPanel();
        
        panel1.setBackground(new Color(249, 231, 159 ));
        
        jLabel=new JLabel();
        jLabel.setIcon(logo);
        label4=new JLabel("You can't buy happiness, but you can adopt it by.");
        
        button1=new JButton("COMPLAINT");
        button1.setBounds(0,0,100,100);
        button1.setFocusable(false);
        
         button2=new JButton("RESCUED DOGS");
        button2.setFocusable(false);
        
        button3=new JButton("FEEDBACK");
        button3.setFocusable(false);
        button3.setBounds(10,10,100,100);
     
        label2=new JLabel("WELCOME TO PET PORTAL 🤝 ");
        label3=new JLabel("ONLINE PET POLICY HUB ");
        label3.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
        label2.setFont(new Font("Monospaced", Font.PLAIN, 20));
        
         l3=new JLabel();
        l3.setIcon(logo2);
        
        panel2=new JPanel(new GridLayout());
        panel2.setBackground(new Color(225, 178, 102));
        
        
        panel3=new JPanel();
         b1=new JButton("LOGIN");
         b2=new JButton("REGISTER");
         panel3.setBackground(Color.lightGray);
        
        panel4=new JPanel();
        panel4.setBackground(new Color(225, 178, 102));
        panel4.add(label2);
        panel4.add(l3);
        
        panel2.add(label3);
        
        panel3.add(b1);
        panel3.add(b2);
        
        panel1.add(jLabel);
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        
        	
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b1.setFocusable(false);
        b2.setFocusable(false);
        
        panel1.setBorder(blackline);
        panel3.setBorder(blackline);
        
        Container contentPane = getContentPane();
        contentPane.add(panel1,BorderLayout.NORTH);
        contentPane.add(panel2,BorderLayout.WEST);
        contentPane.add(panel3,BorderLayout.SOUTH);
        contentPane.add(panel4,BorderLayout.CENTER);
        
       setVisible(true);
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==button1) {
			new complaint();
		}
		else if(e.getSource()==b2) {
			new register();
		}
		else if (e.getSource()==b1) {

				try {
					new login();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
		} 
		else if(e.getSource()==button2) {
			new Rescued_pets();
		}
		
	}
	public static void main(String args[]) throws IOException {
		new PetshopProject();
	}
}


