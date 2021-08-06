import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Simple {

	private JFrame frame;
	private JTextField username;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Simple window = new Simple();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Simple() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 913, 552);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TOMATO");
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Jokerman", Font.PLAIN, 35));
		lblNewLabel.setBounds(174, 38, 625, 48);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User Id");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(404, 126, 155, 28);
		frame.getContentPane().add(lblNewLabel_1);
		
		username = new JTextField();
		username.setBounds(281, 176, 394, 39);
		frame.getContentPane().add(username);
		username.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(281, 238, 394, 39);
		frame.getContentPane().add(lblNewLabel_2);
		
		password = new JPasswordField();
		password.setBounds(281, 302, 394, 39);
		frame.getContentPane().add(password);
		
		JButton btnNewButton = new JButton("Proceed To Ordering");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String uname = username.getText();
				String psw = password.getText();
				
				if (uname.equals("Bharat") && psw.equals("Raj1234"))
				{
					JOptionPane.showMessageDialog(frame , "Enjoy Ordering With TOMATO...");
					MainWindow second = new MainWindow ();
					second.setVisible(true);
					frame.setVisible(false);
				}
				else
				{
					JOptionPane.showMessageDialog(frame, "Invalid Username/Password");
					//frame.setVisible(false);
				}
			}
		});
		btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btnNewButton.setBounds(370, 392, 212, 28);
		frame.getContentPane().add(btnNewButton);
		
		JLabel show_image = new JLabel("");
		show_image.setIcon(new ImageIcon("C:\\Users\\GURUMOORTY\\Downloads\\index.jpg"));
		show_image.setBounds(34, 61, 185, 359);
		frame.getContentPane().add(show_image);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\GURUMOORTY\\Downloads\\shutterstock_1435374326111"));
		lblNewLabel_3.setBounds(697, 95, 192, 294);
		frame.getContentPane().add(lblNewLabel_3);
		
		

	}
}
