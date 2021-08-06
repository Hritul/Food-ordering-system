import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class AaoKhao extends JFrame {
	
	public static int item[] = new int[7];
	public static int res=0;
	public static int price[] = {120,140,220,240,50,280,260};
	public static String quantity[]= new String[7];
	public static String[] myCartItems= new String[7];
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AaoKhao frame = new AaoKhao();
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
	public AaoKhao() {
		
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
		lblNewLabel.setBounds(124, 38, 625, 48);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome to Aaoji Khaoji");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(208, 97, 457, 26);
		contentPane.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 134, 486, 381);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		table.setRowHeight(50);
		table.getTableHeader().setFont(new Font("SansSerif", Font.ITALIC, 20));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Aloo Tikki Chole", new Integer(120)},
				{"Punjabi S.P.D.P", new Integer(140)},
				{"Paneer Tikka", new Integer(220)},
				{"Cheese Chilly Paneer", new Integer(240)},
				{"Tandoori Roti", new Integer(50)},
				{"Veg Tiranga", new Integer(280)},
				{"Paneer Jalfrezi", new Integer(260)},
			},
			new String[] {
				"Name of the Item", "Price"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(176);
		scrollPane.setViewportView(table);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idprovider = Integer.parseInt((String)comboBox.getSelectedItem());
				quantity[0]=Integer.toString(idprovider);
				item[0]=idprovider*price[0];
				myCartItems[0]= "Aloo Tikki Chole";
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4"}));
		comboBox.setBounds(532, 172, 61, 33);
		contentPane.add(comboBox);
		
		JComboBox comboBox2 = new JComboBox();
		comboBox2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idprovider = Integer.parseInt((String)comboBox2.getSelectedItem());
				quantity[1]=Integer.toString(idprovider);
				item[1]=idprovider*price[1];
				myCartItems[1]= "Punjabi S.P.D.P";
			}
		});
		comboBox2.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4"}));
		comboBox2.setBounds(532, 223, 61, 33);
		contentPane.add(comboBox2);
		
		JComboBox comboBox3 = new JComboBox();
		comboBox3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idprovider = Integer.parseInt((String)comboBox3.getSelectedItem());
				quantity[2]=Integer.toString(idprovider);
				item[2]=idprovider*price[2];
				myCartItems[2]= "Paneer Tikka";
			}
		});
		comboBox3.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4"}));
		comboBox3.setBounds(532, 272, 61, 33);
		contentPane.add(comboBox3);
		
		JComboBox comboBox4 = new JComboBox();
		comboBox4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idprovider = Integer.parseInt((String)comboBox4.getSelectedItem());
				quantity[3]=Integer.toString(idprovider);
				item[3]=idprovider*price[3];
				myCartItems[3]= "Cheese Chilly Paneer";
			}
		});
		comboBox4.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4"}));
		comboBox4.setBounds(532, 323, 61, 33);
		contentPane.add(comboBox4);
		
		JComboBox comboBox5 = new JComboBox();
		comboBox5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idprovider = Integer.parseInt((String)comboBox5.getSelectedItem());
				quantity[4]=Integer.toString(idprovider);
				item[4]=idprovider*price[4];
				myCartItems[4]= "Tandoori Roti";
			}
		});
		comboBox5.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4"}));
		comboBox5.setBounds(532, 373, 61, 33);
		contentPane.add(comboBox5);
		
		JComboBox comboBox6 = new JComboBox();
		comboBox6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idprovider = Integer.parseInt((String)comboBox6.getSelectedItem());
				quantity[5]=Integer.toString(idprovider);
				item[5]=idprovider*price[5];
				myCartItems[5]= "Veg Tiranga";
			}
		});
		comboBox6.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4"}));
		comboBox6.setBounds(532, 425, 61, 33);
		contentPane.add(comboBox6);
		
		JComboBox comboBox7 = new JComboBox();
		comboBox7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idprovider = Integer.parseInt((String)comboBox7.getSelectedItem());
				quantity[6]=Integer.toString(idprovider);
				item[6]=idprovider*price[6];
				myCartItems[6]= "Paneer Jalfrezi";
			}
		});
		comboBox7.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4"}));
		comboBox7.setBounds(532, 468, 61, 33);
		contentPane.add(comboBox7);
		
		JLabel lblNewLabel_2 = new JLabel("Quantity");
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(531, 133, 78, 29);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Proceed");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i=0;i<7;i++)
					res = res + item[i];
				Payment obj = new Payment();
				String str = Integer.toString(res);
				obj.list(myCartItems,quantity);
				obj.price(str);
				obj.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnNewButton.setBounds(664, 443, 171, 58);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\GURUMOORTY\\Downloads\\SPDP1.jpg"));
		lblNewLabel_3.setBounds(651, 149, 200, 284);
		contentPane.add(lblNewLabel_3);
	}
}
