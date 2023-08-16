package library.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.EtchedBorder;

public class LibraryManagementSystem extends JFrame implements ActionListener{

        JLabel l1,l2,l3,l5,l6,l7,l8,l9;
        JButton b1;
        
        public LibraryManagementSystem() {
		
                setSize(1920,1080);
                setLayout(null);
                setLocation(0,0);

		l1 = new JLabel("");
                b1 = new JButton("GO");
                
                b1.setForeground(Color.WHITE);
				
                
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/Library.jpg"));
                Image i3 = i1.getImage().getScaledInstance(1920,1080,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                l1 = new JLabel(i2);
                
          	l2 = new JLabel("WELCOME TO LIBRARY MANAGEMENT");
                l2.setFont(new Font("Times New Roman", Font.BOLD, 90));
                l2.setForeground(Color.WHITE);
                l2.setBounds(40,20,1860,150);
                
                l3 = new JLabel("SYSTEM");
                l3.setFont(new Font("Times New Roman", Font.BOLD, 90));
                l3.setForeground(Color.WHITE);
                l3.setBounds(820,150,1860,150);
                
             
                
                l5 = new JLabel("Created By:");
                l5.setFont(new Font("Times New Roman", Font.BOLD, 60));
                l5.setForeground(Color.WHITE);
                l5.setBounds(1380,540,500,100);
                
                l6 = new JLabel("1.JYOTI VISHWAKARMA");
                l6.setFont(new Font("Times New Roman", Font.BOLD, 40));
                l6.setForeground(Color.WHITE);
                l6.setBounds(1390,620,550,100);
                
                l7= new JLabel("2.SANIKA KSHIRSAGAR");
                l7.setFont(new Font("Times New Roman", Font.BOLD, 40));
                l7.setForeground(Color.WHITE);
                l7.setBounds(1390,670,550,100);
                
                l8 = new JLabel("3.HARSHADA GIRI");
                l8.setFont(new Font("Times New Roman", Font.BOLD, 40));
                l8.setForeground(Color.WHITE);
                l8.setBounds(1390,720,500,100);
                
                l9 = new JLabel("4.VEDASHRI KULKARNI");
                l9.setFont(new Font("Times New Roman", Font.BOLD, 40));
                l9.setForeground(Color.WHITE);
                l9.setBounds(1390,770,500,100);
                
                
                b1.setBounds(820,550,300,90);
		l1.setBounds(0, 0, 1920, 1080);
                b1.setFont(new Font("Times New Roman", Font.BOLD, 40));
                b1.setBackground(new Color(0,0,0,0.5f));
                              
                l1.add(b1);
                l1.add(l2);
                l1.add(l3);
                l1.add(l5);
                l1.add(l6);
                l1.add(l7);
                l1.add(l8);
                l1.add(l9);
                
                
		add(l1);
                
                b1.addActionListener(this);
	}
        
        public void actionPerformed(ActionEvent ae){
                new Login_user().setVisible(true);
                this.setVisible(false);
                
        }
        
        public static void main(String[] args) {
                LibraryManagementSystem window = new LibraryManagementSystem();
                window.setVisible(true);			
	}
}
