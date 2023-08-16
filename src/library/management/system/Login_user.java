package library.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login_user extends JFrame implements ActionListener{

	private JTextField textField;
	private JPasswordField passwordField;
        private JButton b1,b2,b3;
        private JLabel l1;

	public Login_user() {
            	
        setBounds(0,0,1920,1080);
		
       
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/Login.jpg"));
        Image i3 = i1.getImage().getScaledInstance(1920,1080,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        l1 = new JLabel(i2);
        
        add(l1);
        

	JLabel l2 = new JLabel("Username : ");
	l2.setBounds(750,420, 180,40);
        l2.setFont(new Font("Times New Roman", Font.BOLD, 32));
        l2.setForeground(new Color(255,255,255));
	l1.add(l2);

	JLabel l3 = new JLabel("Password  : ");
	l3.setBounds(750,485,180,40);
        l3.setFont(new Font("Times New Roman", Font.BOLD, 32));
        l3.setForeground(new Color(255,255,255));
	l1.add(l3);

	textField = new JTextField();
	textField.setBounds(930, 427, 240, 30);
	l1.add(textField);
	
	passwordField = new JPasswordField();
	passwordField.setBounds(930, 491, 240, 30);
	l1.add(passwordField);

	JLabel l4 = new JLabel("");
	l4.setBounds(680, 49, 46, 34);
	l1.add(l4);

	JLabel l5 = new JLabel("");
	l5.setBounds(680, 94, 46, 34);
	l1.add(l5);

	b1 = new JButton("Login");
	b1.addActionListener(this);
                
	b1.setForeground(new Color(46, 139, 87));
	b1.setBackground(new Color(250, 250, 210));
	b1.setBounds(850, 556, 113, 39);
	l1.add(b1);
		
        b2 = new JButton("SignUp");
	b2.addActionListener(this);
	
	b2.setForeground(new Color(139, 69, 19));
	b2.setBackground(new Color(255, 235, 205));
	b2.setBounds(993, 556, 113, 39);
	l1.add(b2);

	b3 = new JButton("Forgot Password");
	b3.addActionListener(this);
	
        b3.setForeground(new Color(205, 92, 92));
	b3.setBackground(new Color(253, 245, 230));
	b3.setBounds(889, 621, 179, 39);
	l1.add(b3);
        
        JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(0,0,0,0.5f));
		panel2.setBounds(690, 360, 600, 400);
		l1.add(panel2);
	}
        
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource() == b1){
                Boolean status = false;
		try {
                    conn con = new conn();
                    String sql = "select * from account where username=? and password=?";
                    PreparedStatement st = con.c.prepareStatement(sql);

                    st.setString(1, textField.getText());
                    st.setString(2, passwordField.getText());

                    ResultSet rs = st.executeQuery();
                    if (rs.next()) {
                        this.setVisible(false);
                        new Loading().setVisible(true);
                    } else
			JOptionPane.showMessageDialog(null, "Invalid Login...!.");
                       
		} catch (Exception e2) {
                    e2.printStackTrace();
		}
            }
            if(ae.getSource() == b2){
                setVisible(false);
		Signup su = new Signup();
		su.setVisible(true);
            }   
            if(ae.getSource() == b3){
                setVisible(false);
		Forgot forgot = new Forgot();
		forgot.setVisible(true);
            }
        }
        
  	public static void main(String[] args) {
                new Login_user().setVisible(true);
	}

}
