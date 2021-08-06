import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JRadioButtonMenuItem;

public class MainWindow extends JFrame {
	
	public static MainWindow frame;

	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new MainWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public int count=0;

	/**
	 * Create the frame.
	 */
	public MainWindow() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 913, 552);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("TOMATO");
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Jokerman", Font.PLAIN, 35));
		lblNewLabel.setBounds(174, 38, 625, 48);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Choose Your Preferred Food Station");
		lblNewLabel_1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(73, 131, 362, 32);
		contentPane.add(lblNewLabel_1);
		
		JRadioButton rdbtn = new JRadioButton("Aaoji Khaoji");
		rdbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				count=1;
				
				
			}
		});
		rdbtn.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		rdbtn.setBounds(73, 193, 224, 37);
		contentPane.add(rdbtn);
		
		JRadioButton rdbtn2 = new JRadioButton("Dominos");
		rdbtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				count=2;
			}
		});
		rdbtn2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		rdbtn2.setBounds(73, 243, 170, 37);
		contentPane.add(rdbtn2);
		
		JRadioButton rdbtn3 = new JRadioButton("Anna Idli");
		rdbtn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				count = 3;
			}
		});
		rdbtn3.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		rdbtn3.setBounds(73, 297, 224, 37);
		contentPane.add(rdbtn3);
		
		JRadioButton rdbtn4 = new JRadioButton("The Chocolate Room");
		rdbtn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				count = 4;
			}
		});
		rdbtn4.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		rdbtn4.setBounds(73, 354, 224, 37);
		contentPane.add(rdbtn4);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(count ==1)
				{
					AaoKhao third = new AaoKhao ();
					third.setVisible(true);
					

					
				}
				if(count == 2)
				{
					Dominos fourth = new Dominos();
					fourth.setVisible(true);
					
				}
				if(count == 3)
				{
					AnnaIdli fifth = new AnnaIdli ();
					fifth.setVisible(true);
					
				}
				if(count == 4)
				{
					ChocolateRoom sixth = new ChocolateRoom();
					sixth.setVisible(true);
				}

				
			}
		});
		btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnNewButton.setBounds(406, 444, 159, 48);
		contentPane.add(btnNewButton);
		
		ButtonGroup bg=new ButtonGroup();
        bg.add(rdbtn);
        bg.add(rdbtn2);
        bg.add(rdbtn3);
        bg.add(rdbtn4);
	}
}
