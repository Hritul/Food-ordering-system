import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;

public class Payment extends JFrame {

	private JPanel contentPane;
	public JLabel lb;
	public static Payment frame;
	private JTable table;
	private JTable table_1;
	
	public void price(String pr)
	{
		JLabel lb = new JLabel();
		lb.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lb.setBounds(56, 143, 743, 31);
		contentPane.add(lb);
		lb.setText("Your Total Bill Amounts to "+pr);
	}
	
	public void list(String ls[],String it[])
	{
		JList list = new JList();
		list.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		list.setModel(new AbstractListModel() {
			public int getSize() {
				return ls.length;
			}
			public Object getElementAt(int index) {
				return ls[index];
			}
		});
		list.setBounds(336, 259, 170, 130);
		
		list.setBackground(Color.LIGHT_GRAY);
		contentPane.add(list);
		
		JList list_1 = new JList();
		list_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		list_1.setModel(new AbstractListModel() {
			public int getSize() {
				return it.length;
			}
			public Object getElementAt(int index) {
				return it[index];
			}
		});
		list_1.setBackground(Color.LIGHT_GRAY);
		list_1.setBounds(503, 259, 85, 130);
		contentPane.add(list_1);
		
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Payment();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Payment() {
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
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\GURUMOORTY\\Downloads\\vmc.gif"));
		lblNewLabel_1.setBounds(637, 169, 291, 256);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Welcome to The Payment Gateway");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(319, 96, 342, 26);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Choose Your Preferred Payment Option");
		lblNewLabel_3.setFont(new Font("Samsung Sans", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(56, 184, 348, 42);
		contentPane.add(lblNewLabel_3);
		
		JRadioButton rdbtn = new JRadioButton("Debit Card");
		rdbtn.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		rdbtn.setBounds(39, 249, 191, 26);
		contentPane.add(rdbtn);
		
		JRadioButton rdbtn2 = new JRadioButton("Credit Card");
		rdbtn2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		rdbtn2.setBounds(39, 290, 170, 26);
		contentPane.add(rdbtn2);
		
		JRadioButton rdbtn3 = new JRadioButton("Net Banking");
		rdbtn3.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		rdbtn3.setBounds(39, 329, 191, 34);
		contentPane.add(rdbtn3);
		
		JRadioButton rdbtn4 = new JRadioButton("Bhim/UPI");
		rdbtn4.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		rdbtn4.setBounds(39, 373, 191, 34);
		contentPane.add(rdbtn4);
		
		JRadioButton rdbtn5 = new JRadioButton("Paytm Wallet");
		rdbtn5.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		rdbtn5.setBounds(39, 421, 222, 26);
		contentPane.add(rdbtn5);
		
		ButtonGroup bg=new ButtonGroup();
        bg.add(rdbtn);
        bg.add(rdbtn2);
        bg.add(rdbtn3);
        bg.add(rdbtn4);
        bg.add(rdbtn5);
		
		JButton btnNewButton = new JButton("Proceed To Payment");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Thanks for Ordering...");
				
			}
		});
		btnNewButton.setFont(new Font("Leelawadee UI", Font.PLAIN, 18));
		btnNewButton.setBounds(300, 428, 234, 53);
		contentPane.add(btnNewButton);


		JLabel lblNewLabel_4 = new JLabel("Quantity");
		lblNewLabel_4.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNewLabel_4.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_4.setBounds(503, 236, 85, 23);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Selected Items");
		lblNewLabel_5.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(340, 236, 153, 23);
		contentPane.add(lblNewLabel_5);

	
		
	}
}
