package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import com.ibm.db2.jcc.am.Connection;

import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.time.LocalDate;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JScrollBar;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.Window.Type;

public class BookShop {

	private JFrame frmRaghman;
	private JTextField textField;
	private JPasswordField passwordField;
	private static JTextField textField_1;

	private JPasswordField passwordField_1;
	private static JTable table;
	private JTextField txtbname;
	private JTextField txtedition;
	private JTextField txtprice;
	private JTextField txtbid;
	private JTextField txtbid1;
	private static JTable table_1;
	public static String admin_id_;
	public static String ids;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;
	private static JTable table_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookShop window = new BookShop();
					window.frmRaghman.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BookShop() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public static void update_table() {
		try {
			Class.forName("com.ibm.db2.jcc.DB2Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:db2://localhost:50000/Books", "db2admin",
					"db2admin");

			ResultSet rs = null;
			PreparedStatement ps = con.prepareStatement("select * from books");
			rs = ps.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();

			table.setModel(new DefaultTableModel());
			DefaultTableModel model = (DefaultTableModel) table.getModel();

			int No_columns = rsmd.getColumnCount();
			String[] column_name = new String[No_columns];
			for (int i = 0; i < No_columns; i++) {
				column_name[i] = rsmd.getColumnName(i + 1);
			}

			model.setColumnIdentifiers(column_name);

			while (rs.next()) {
				String[] data = new String[No_columns];
				for (int i = 0; i < No_columns; i++) {
					data[i] = rs.getString(column_name[i]);
				}
				model.addRow(data);
			}
		} catch (Exception e) {
		}
	}
	public static void update_table1() {
		try {
			Class.forName("com.ibm.db2.jcc.DB2Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:db2://localhost:50000/Books", "db2admin",
					"db2admin");

			ResultSet rs = null;
			PreparedStatement ps = con.prepareStatement("select * from books");
			rs = ps.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();

			table_1.setModel(new DefaultTableModel());
			DefaultTableModel model = (DefaultTableModel) table_1.getModel();

			int No_columns = rsmd.getColumnCount();
			String[] column_name = new String[No_columns];
			for (int i = 0; i < No_columns; i++) {
				column_name[i] = rsmd.getColumnName(i + 1);
			}

			model.setColumnIdentifiers(column_name);

			while (rs.next()) {
				String[] data = new String[No_columns];
				for (int i = 0; i < No_columns; i++) {
					data[i] = rs.getString(column_name[i]);
				}
				model.addRow(data);
			}
		} catch (Exception e) {
		}
	}
	
	public static void update_table2() {
		try {
			Class.forName("com.ibm.db2.jcc.DB2Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:db2://localhost:50000/Books", "db2admin",
					"db2admin");

			ResultSet rs = null;
			PreparedStatement ps = con.prepareStatement("select * from books WHERE Issued='N' ");
			rs = ps.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();

			table_1.setModel(new DefaultTableModel());
			DefaultTableModel model = (DefaultTableModel) table_1.getModel();

			int No_columns = rsmd.getColumnCount();
			String[] column_name = new String[No_columns];
			for (int i = 0; i < No_columns; i++) {
				column_name[i] = rsmd.getColumnName(i + 1);
			}

			model.setColumnIdentifiers(column_name);

			while (rs.next()) {
				String[] data = new String[No_columns];
				for (int i = 0; i < No_columns; i++) {
					data[i] = rs.getString(column_name[i]);
				}
				model.addRow(data);
			}
		} catch (Exception e) {
		}
	}
	public static void update_table3() {
		try {
			Class.forName("com.ibm.db2.jcc.DB2Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:db2://localhost:50000/Books", "db2admin",
					"db2admin");

			ResultSet rs = null;
			PreparedStatement ps = con.prepareStatement("select * from books WHERE Issued='Y' ");
			rs = ps.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();

			table_1.setModel(new DefaultTableModel());
			DefaultTableModel model = (DefaultTableModel) table_1.getModel();

			int No_columns = rsmd.getColumnCount();
			String[] column_name = new String[No_columns];
			for (int i = 0; i < No_columns; i++) {
				column_name[i] = rsmd.getColumnName(i + 1);
			}

			model.setColumnIdentifiers(column_name);

			while (rs.next()) {
				String[] data = new String[No_columns];
				for (int i = 0; i < No_columns; i++) {
					data[i] = rs.getString(column_name[i]);
				}
				model.addRow(data);
			}
		} catch (Exception e) {
		}
	}
	public static void update_table4() {
		try {
			
			Class.forName("com.ibm.db2.jcc.DB2Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:db2://localhost:50000/Books", "db2admin",
					"db2admin");

			ResultSet rs = null;
			PreparedStatement ps = con.prepareStatement("select * from allot WHERE Student_Id = ?");
			ps.setString(1,admin_id_);
			rs = ps.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();

			table_1.setModel(new DefaultTableModel());
			DefaultTableModel model = (DefaultTableModel) table_1.getModel();

			int No_columns = rsmd.getColumnCount();
			String[] column_name = new String[No_columns];
			for (int i = 0; i < No_columns; i++) {
				column_name[i] = rsmd.getColumnName(i + 1);
			}

			model.setColumnIdentifiers(column_name);

			while (rs.next()) {
				String[] data = new String[No_columns];
				for (int i = 0; i < No_columns; i++) {
					data[i] = rs.getString(column_name[i]);
				}
				model.addRow(data);
			}
		} catch (Exception e) {
		}
	
	}

	public static void update_table5() {
		try {
			Class.forName("com.ibm.db2.jcc.DB2Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:db2://localhost:50000/Books", "db2admin",
					"db2admin");

			ResultSet rs = null;
			PreparedStatement ps = con.prepareStatement("select * from student");
			rs = ps.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();

			table_2.setModel(new DefaultTableModel());
			DefaultTableModel model = (DefaultTableModel) table_2.getModel();

			int No_columns = rsmd.getColumnCount();
			String[] column_name = new String[No_columns];
			for (int i = 0; i < No_columns; i++) {
				column_name[i] = rsmd.getColumnName(i + 1);
			}

			model.setColumnIdentifiers(column_name);

			while (rs.next()) {
				String[] data = new String[No_columns];
				for (int i = 0; i < No_columns; i++) {
					data[i] = rs.getString(column_name[i]);
				}
				model.addRow(data);
			}
		} catch (Exception e) {
		}
	}
	public static void update_table6() {
		try {
			
			Class.forName("com.ibm.db2.jcc.DB2Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:db2://localhost:50000/Books", "db2admin",
					"db2admin");

			ResultSet rs = null;
			PreparedStatement ps = con.prepareStatement("select * from allot where student_id=?");
			ps.setString(1,ids);
					
			rs = ps.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();

			table_2.setModel(new DefaultTableModel());
			DefaultTableModel model = (DefaultTableModel) table_2.getModel();

			int No_columns = rsmd.getColumnCount();
			String[] column_name = new String[No_columns];
			for (int i = 0; i < No_columns; i++) {
				column_name[i] = rsmd.getColumnName(i + 1);
			}

			model.setColumnIdentifiers(column_name);

			while (rs.next()) {
				String[] data = new String[No_columns];
				for (int i = 0; i < No_columns; i++) {
					data[i] = rs.getString(column_name[i]);
				}
				model.addRow(data);
			}
		} catch (Exception e) {
		}
	
	}

	private void initialize() {
		frmRaghman = new JFrame();
		frmRaghman.setForeground(Color.DARK_GRAY);
		frmRaghman.setFont(new Font("Arial Black", Font.BOLD, 12));
		frmRaghman.setTitle("RAGHMAN");
		frmRaghman.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\db2admin\\Downloads\\WhatsApp Image 2022-06-09 at 10.32.19 PM (1).jpeg"));
		frmRaghman.setResizable(false);
		frmRaghman.setBounds(100, 100, 1133, 534);
		frmRaghman.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRaghman.getContentPane().setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, -23, 164, 510);
		frmRaghman.getContentPane().add(tabbedPane);
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(175, -23, 934, 510);
		frmRaghman.getContentPane().add(tabbedPane_1);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setLayout(null);
		tabbedPane.addTab("New tab", null, panel_1, null);

		JButton btnNewButton = new JButton("Admin");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane_1.setSelectedIndex(1);
			}
		});
		btnNewButton.setBounds(10, 109, 139, 41);
		panel_1.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Student");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane_1.setSelectedIndex(2);
			}
		});
		btnNewButton_1.setBounds(10, 199, 139, 41);
		panel_1.add(btnNewButton_1);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane_1.setSelectedIndex(0);
			}
		});
		btnHome.setForeground(Color.WHITE);
		btnHome.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnHome.setBackground(Color.DARK_GRAY);
		btnHome.setBounds(10, 28, 139, 41);
		panel_1.add(btnHome);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLACK);
		tabbedPane.addTab("New tab", null, panel_2, null);
		panel_2.setLayout(null);

		JButton btnNewButton_4 = new JButton("LogOut");
		btnNewButton_4.setBackground(Color.DARK_GRAY);
		btnNewButton_4.setForeground(Color.WHITE);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane_1.setSelectedIndex(0);
				tabbedPane.setSelectedIndex(0);
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_4.setBounds(0, 172, 159, 37);
		panel_2.add(btnNewButton_4);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(Color.BLACK);
		tabbedPane.addTab("", null, panel_2_1, null);
		
		JButton btnNewButton_4_1 = new JButton("LogOut");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane_1.setSelectedIndex(0);
				tabbedPane.setSelectedIndex(0);
			}
		});
		btnNewButton_4_1.setForeground(Color.WHITE);
		btnNewButton_4_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_4_1.setBackground(Color.DARK_GRAY);
		btnNewButton_4_1.setBounds(0, 408, 159, 37);
		panel_2_1.add(btnNewButton_4_1);
		
		JButton btnNewButton_4_1_1 = new JButton("Student");
		btnNewButton_4_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane_1.setSelectedIndex(5);
				update_table5();
			}
		});
		btnNewButton_4_1_1.setForeground(Color.WHITE);
		btnNewButton_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_4_1_1.setBackground(Color.DARK_GRAY);
		btnNewButton_4_1_1.setBounds(0, 126, 159, 37);
		panel_2_1.add(btnNewButton_4_1_1);
		
		JButton btnNewButton_4_1_1_1 = new JButton("Books");
		btnNewButton_4_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane_1.setSelectedIndex(3);
			}
		});
		btnNewButton_4_1_1_1.setForeground(Color.WHITE);
		btnNewButton_4_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_4_1_1_1.setBackground(Color.DARK_GRAY);
		btnNewButton_4_1_1_1.setBounds(0, 38, 159, 37);
		panel_2_1.add(btnNewButton_4_1_1_1);
		
				JPanel panel_4 = new JPanel();
				panel_4.setBackground(Color.WHITE);
				tabbedPane_1.addTab("New tab", null, panel_4, null);
				panel_4.setLayout(null);
				
						JLabel lblNewLabel = new JLabel("RAGHMAN LIBRARY");
						lblNewLabel.setForeground(Color.WHITE);
						lblNewLabel.setBounds(211, 10, 460, 55);
						lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 45));
						panel_4.add(lblNewLabel);
						
						JLabel lblNewLabel_5 = new JLabel("This library management app gives a platform to manage books issued to the students/");
						lblNewLabel_5.setForeground(Color.WHITE);
						lblNewLabel_5.setVerticalAlignment(SwingConstants.TOP);
						lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 20));
						lblNewLabel_5.setBounds(10, 98, 909, 34);
						panel_4.add(lblNewLabel_5);
						
						JLabel lblNewLabel_5_1 = new JLabel("people who love to read.  Moreover, a community of readers can easily browse their\r\n\r\n");
						lblNewLabel_5_1.setForeground(Color.WHITE);
						lblNewLabel_5_1.setVerticalAlignment(SwingConstants.TOP);
						lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 20));
						lblNewLabel_5_1.setBounds(10, 124, 894, 34);
						panel_4.add(lblNewLabel_5_1);
						
						JLabel lblNewLabel_5_1_1 = new JLabel("favorite books, etc., by making an account on the app.");
						lblNewLabel_5_1_1.setForeground(Color.WHITE);
						lblNewLabel_5_1_1.setVerticalAlignment(SwingConstants.TOP);
						lblNewLabel_5_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
						lblNewLabel_5_1_1.setBounds(10, 155, 894, 34);
						panel_4.add(lblNewLabel_5_1_1);
						
						JLabel lblNewLabel_5_1_1_1 = new JLabel("* For Admin Login, Click on the Admin Button on Left Panel.");
						lblNewLabel_5_1_1_1.setForeground(Color.WHITE);
						lblNewLabel_5_1_1_1.setVerticalAlignment(SwingConstants.TOP);
						lblNewLabel_5_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
						lblNewLabel_5_1_1_1.setBounds(10, 251, 894, 34);
						panel_4.add(lblNewLabel_5_1_1_1);
						
						JLabel lblNewLabel_5_1_1_2 = new JLabel("* For Student Login, Click on the Student Button on Left Panel.");
						lblNewLabel_5_1_1_2.setForeground(Color.WHITE);
						lblNewLabel_5_1_1_2.setVerticalAlignment(SwingConstants.TOP);
						lblNewLabel_5_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
						lblNewLabel_5_1_1_2.setBounds(10, 307, 894, 34);
						panel_4.add(lblNewLabel_5_1_1_2);
						
						JLabel lblNewLabel_6 = new JLabel("New label");
						lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\db2admin\\Downloads\\WhatsApp Image 2022-06-09 at 10.32.19 PM.jpeg"));
						lblNewLabel_6.setBounds(-12, 0, 941, 478);
						panel_4.add(lblNewLabel_6);
	

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		tabbedPane_1.addTab("New tab", null, panel_3, null);
		panel_3.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Admin Login");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 60));
		lblNewLabel_1.setBounds(266, 21, 412, 73);
		panel_3.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2.setBounds(210, 140, 165, 39);
		panel_3.add(lblNewLabel_2);

		textField = new JTextField();
		textField.setBounds(414, 140, 264, 39);
		panel_3.add(textField);
		textField.setColumns(10);

		JButton btnNewButton_2 = new JButton("LogIn");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(Color.DARK_GRAY);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String admin_id_,admin_pass_;
				admin_id_=textField.getText();
				admin_pass_=passwordField.getText();
				if(admin_id_.equals("1") && admin_pass_.equals("PASS")) {
					tabbedPane.setSelectedIndex(2);
					tabbedPane_1.setSelectedIndex(3);
					update_table();
					textField.setText("");
					passwordField.setText("");
				}
				else {
					JOptionPane.showMessageDialog(null,"Please Enter Correct Id and Passeword" );
				}
				 
				
			

			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBounds(312, 321, 115, 32);
		panel_3.add(btnNewButton_2);

		JLabel lblNewLabel_2_1 = new JLabel("Password");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2_1.setBounds(210, 227, 165, 39);
		panel_3.add(lblNewLabel_2_1);

		passwordField = new JPasswordField();
		passwordField.setBounds(414, 233, 264, 39);
		panel_3.add(passwordField);

		JButton btnNewButton_2_3 = new JButton("Exit");
		btnNewButton_2_3.setForeground(Color.WHITE);
		btnNewButton_2_3.setBackground(Color.DARK_GRAY);
		btnNewButton_2_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane_1.setSelectedIndex(0);
			}
		});
		btnNewButton_2_3.setBounds(475, 321, 115, 32);
		panel_3.add(btnNewButton_2_3);
		
		JLabel lblNewLabel_6_1 = new JLabel("");
		lblNewLabel_6_1.setIcon(new ImageIcon("C:\\Users\\db2admin\\Downloads\\WhatsApp Image 2022-06-09 at 10.32.19 PM (1).jpeg"));
		lblNewLabel_6_1.setBounds(-12, 0, 941, 478);
		panel_3.add(lblNewLabel_6_1);
		


		JPanel panel5 = new JPanel();
		panel5.setLayout(null);
		tabbedPane_1.addTab("New tab", null, panel5, null);

		JLabel lblNewLabel_1_1 = new JLabel("Student Login");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 60));
		lblNewLabel_1_1.setBounds(266, 21, 488, 73);
		panel5.add(lblNewLabel_1_1);

		JLabel lblNewLabel_2_2 = new JLabel("Username");
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2_2.setBounds(210, 140, 165, 39);
		panel5.add(lblNewLabel_2_2);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(414, 140, 264, 39);
		panel5.add(textField_1);

		JButton btnNewButton_2_4 = new JButton("LogIn");
		btnNewButton_2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String admin_pass_;
				admin_id_=textField_1.getText();
				admin_pass_=passwordField_1.getText();
				try {
					Class.forName("com.ibm.db2.jcc.DB2Driver");
					Connection con = (Connection) DriverManager.getConnection("jdbc:db2://localhost:50000/Books", "db2admin", "db2admin");
		
					
//					get data from table
					ResultSet rs=null;
					PreparedStatement ps2 = con.prepareStatement("select * from student");
					rs = ps2.executeQuery();
					boolean available = false;
					while (rs.next()) {
						/* System.out.print("DONE"); */
							if(admin_id_.equals(rs.getString("Student_Id"))&& admin_pass_.equals(rs.getString("Password"))) {
								available=true;
								break;
							}
					}
					if(available) {
						tabbedPane.setSelectedIndex(1);
						tabbedPane_1.setSelectedIndex(4);
						textField_1.setText("");
						passwordField_1.setText("");
					}
					else {
						JOptionPane.showMessageDialog(null,"Username or Password are incorrect!!!");
					}
					
					
				}
				catch(Exception e1) {
					e1.printStackTrace();
					
				}
//				if(admin_id_.equals("1") && admin_pass_.equals("PASS")) {
//					tabbedPane.setSelectedIndex(1);
//					tabbedPane_1.setSelectedIndex(4);
//					update_table1();
//					textField_1.setText("");
//					passwordField_1.setText("");
//				}
//				else {
//					JOptionPane.showMessageDialog(null,"Please Enter Correct Id and Passeword" );
//				}
			}
		});
		btnNewButton_2_4.setForeground(Color.WHITE);
		btnNewButton_2_4.setBackground(Color.DARK_GRAY);
		btnNewButton_2_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2_4.setBounds(312, 321, 115, 32);
		panel5.add(btnNewButton_2_4);

		JLabel lblNewLabel_2_1_1 = new JLabel("Password");
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2_1_1.setBounds(210, 227, 165, 39);
		panel5.add(lblNewLabel_2_1_1);

		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(414, 233, 264, 39);
		panel5.add(passwordField_1);

		JButton btnNewButton_2_3_1 = new JButton("Exit");
		btnNewButton_2_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane_1.setSelectedIndex(0);
			}
		});
		btnNewButton_2_3_1.setBackground(Color.DARK_GRAY);
		btnNewButton_2_3_1.setForeground(Color.WHITE);
		btnNewButton_2_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2_3_1.setBounds(475, 321, 115, 32);
		panel5.add(btnNewButton_2_3_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("");
		lblNewLabel_6_2.setIcon(new ImageIcon("C:\\Users\\db2admin\\Downloads\\WhatsApp Image 2022-06-09 at 10.32.19 PM (1).jpeg"));
		lblNewLabel_6_2.setBounds(-12, 0, 941, 478);
		panel5.add(lblNewLabel_6_2);

		JPanel panel_6 = new JPanel();
		tabbedPane_1.addTab("New tab", null, panel_6, null);
		panel_6.setLayout(null);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(51, 51, 51));
		panel_5.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Registration", TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE));
		panel_5.setBounds(39, 10, 343, 357);
		panel_6.add(panel_5);
		panel_5.setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("Book Id");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(31, 56, 87, 19);
		panel_5.add(lblNewLabel_3);

		JLabel lblNewLabel_3_1 = new JLabel("Edition");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_1.setBounds(31, 151, 87, 19);
		panel_5.add(lblNewLabel_3_1);

		JLabel lblNewLabel_3_2 = new JLabel("Issued");
		lblNewLabel_3_2.setForeground(Color.WHITE);
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_2.setBounds(31, 209, 87, 19);
		panel_5.add(lblNewLabel_3_2);

		txtbname = new JTextField();
		txtbname.setBounds(174, 103, 120, 19);
		panel_5.add(txtbname);
		txtbname.setColumns(10);

		txtedition = new JTextField();
		txtedition.setBounds(174, 153, 120, 19);
		panel_5.add(txtedition);
		txtedition.setColumns(10);

		txtprice = new JTextField();
		txtprice.setBounds(174, 211, 120, 19);
		panel_5.add(txtprice);
		txtprice.setColumns(10);
		txtbid = new JTextField();
		txtbid.setBounds(118, 31, 197, 19);

		txtbid1 = new JTextField();
		txtbid1.setColumns(10);
		txtbid1.setBounds(174, 58, 120, 19);
		panel_5.add(txtbid1);

		JButton btnNewButton_5 = new JButton("Save");
		btnNewButton_5.setForeground(new Color(255, 255, 255));
		btnNewButton_5.setBackground(new Color(105, 105, 105));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bname, edition, price;
				String bid = txtbid1.getText();
				bid = bid.trim();
				bname = txtbname.getText();
				edition = txtedition.getText();
				price = txtprice.getText();
				if(bname.trim().length()==0||edition.trim().length()==0||bid.trim().length()==0||price.trim().length()==0) {
					JOptionPane.showMessageDialog(null, "Please Enter All Fields");
				}
				else {
				try {
					Class.forName("com.ibm.db2.jcc.DB2Driver");
					Connection con = (Connection) DriverManager.getConnection("jdbc:db2://localhost:50000/Books",
							"db2admin", "db2admin");
					PreparedStatement pst = con
							.prepareStatement("insert into books(Book_Id,Book_Name,Edition,Issued)values(?,?,?,?)");

					pst.setString(1, bid);
					pst.setString(2, bname);
					pst.setString(3, edition);
					pst.setString(4, price);
		
					
					ResultSet rs1=null;
					PreparedStatement ps2 = con.prepareStatement("select * from books");
					rs1 = ps2.executeQuery();
					boolean available = false;
					while (rs1.next()) {
						
							if(bid.equals(rs1.getString("Book_Id"))) {
								available=true;
								break;
							}
					}
					if(available) {
						JOptionPane.showMessageDialog(null,"ID `"+bid+"` IS ALREADY PRESENT IN THE TABLE");
						
						
					}
					else {
						pst.executeUpdate();
						JOptionPane.showMessageDialog(null, "Record Addedddd!!!!!");
						update_table();

						txtbname.setText("");
						txtedition.setText("");
						txtprice.setText("");
						txtbid1.setText("");
						txtbname.requestFocus();;
					}
					}
			
				
				
				catch (Exception e1) {

					e1.printStackTrace();
				}
			}}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_5.setBounds(31, 276, 120, 45);
		panel_5.add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton("Clear");
		btnNewButton_6.setForeground(Color.WHITE);
		btnNewButton_6.setBackground(new Color(105, 105, 105));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtbid1.setText("");
				txtbname.setText("");
				txtprice.setText("");
				txtedition.setText("");
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_6.setBounds(174, 276, 120, 45);
		panel_5.add(btnNewButton_6);

		JLabel lblNewLabel_3_3 = new JLabel("Book Name");
		lblNewLabel_3_3.setForeground(Color.WHITE);
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_3.setBounds(31, 101, 87, 19);
		panel_5.add(lblNewLabel_3_3);


		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Books Detail", TitledBorder.LEADING, TitledBorder.BELOW_BOTTOM, null, new Color(0, 0, 0)));
		scrollPane.setBounds(461, 10, 421, 357);
		scrollPane.getViewport().setBackground(Color.WHITE);
		panel_6.add(scrollPane);

		table = new JTable();
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		//Color ivory = new Color(47, 79, 79);
		table.setOpaque(true);
		table.setFillsViewportHeight(true);
		table.setBackground(new Color(51, 51, 51));

		table.setForeground(Color.WHITE);
		//table.setBackground(new Color(47, 79, 79));
		scrollPane.setViewportView(table);
		
		  table.addMouseListener(new MouseAdapter() {
		 
		  @Override public void mouseClicked(MouseEvent e) { String
		  id,name,phone,email; 
		 int row = table.getSelectedRow(); id= (String)
		  table.getValueAt(row , 0); name=(String) table.getValueAt(row , 1);
		 phone=(String) table.getValueAt(row , 2); email=(String) table.getValueAt(row
		  , 3); 
		 
		  txtbid1.setText(id); txtbname.setText(name); txtedition.setText(phone);
		  txtprice.setText(email);
		 
		  
		  }		  	@Override
		  	public void mousePressed(MouseEvent e) {
			  String id,name,phone,email; 
				 int row = table.getSelectedRow(); id= (String)
				  table.getValueAt(row , 0); name=(String) table.getValueAt(row , 1);
				 phone=(String) table.getValueAt(row , 2); email=(String) table.getValueAt(row
				  , 3); 
				 
				  txtbid1.setText(id); txtbname.setText(name); txtedition.setText(phone);
				  txtprice.setText(email);
			  
		  	}
 });
		 

		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(51, 51, 51));
		panel_7.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Search", TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE));
		panel_7.setBounds(39, 394, 343, 64);
		panel_6.add(panel_7);
		panel_7.setLayout(null);

		JLabel lblNewLabel_4 = new JLabel("Book Id");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(10, 23, 96, 31);
		panel_7.add(lblNewLabel_4);


	
		txtbid.setColumns(10);
		txtbid.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try {

					String id = txtbid.getText();
					id = id.trim();
					Class.forName("com.ibm.db2.jcc.DB2Driver");
					Connection con = (Connection) DriverManager.getConnection("jdbc:db2://localhost:50000/Books",
							"db2admin", "db2admin");

					PreparedStatement pst = con
							.prepareStatement("select Book_Id,Book_Name,Edition,Issued from books where Book_Id = ?");
					pst.setString(1, id);
					ResultSet rs = pst.executeQuery();

					if (rs.next() == true) {
						String Id1 = rs.getString(1);
						String name = rs.getString(2);
						String edition = rs.getString(3);
						String issued = rs.getString(4);

						txtbid1.setText(Id1);
						txtbname.setText(name);
						txtedition.setText(edition);
						txtprice.setText(issued);

					} else {
						txtbname.setText("");
						txtedition.setText("");
						txtprice.setText("");

					}

				}

				catch (Exception ex) {

				}

			}
		});
		panel_7.add(txtbid);

		JButton btnNewButton_7 = new JButton("Update");
		btnNewButton_7.setBackground(Color.DARK_GRAY);
		btnNewButton_7.setForeground(Color.WHITE);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String bname, edition, price, bid;

				bname = txtbname.getText();
				edition = txtedition.getText();
				price = txtprice.getText();
				bid = txtbid1.getText();
				if(bname.trim().length()==0||edition.trim().length()==0||bid.trim().length()==0||price.trim().length()==0) {
					JOptionPane.showMessageDialog(null, "Please Enter All Fields");
				}
				else {
				try {
					Class.forName("com.ibm.db2.jcc.DB2Driver");
					Connection con = (Connection) DriverManager.getConnection("jdbc:db2://localhost:50000/Books",
							"db2admin", "db2admin");
					
					PreparedStatement pst = con
							.prepareStatement("update books set Book_Name= ?,Edition=?,Issued=? where Book_Id =?");
					pst.setString(1, bname);
					pst.setString(2, edition);
					pst.setString(3, price);
					pst.setString(4, bid);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Record Update!!!!!");
					update_table();
					txtbid1.setText("");
					txtbname.setText("");
					txtedition.setText("");
					txtprice.setText("");
					txtbname.requestFocus();
					if(price.equals("N")) {
						PreparedStatement pst1 = con
								.prepareStatement("delete from allot where book_id=?");
						
						pst1.setString(1, bid);
						pst1.executeUpdate();
						
					}
				}

				catch (Exception e1) {

					e1.printStackTrace();
				}

			}}

		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_7.setBounds(489, 377, 147, 39);
		panel_6.add(btnNewButton_7);

		JButton btnNewButton_8 = new JButton("Delete");
		btnNewButton_8.setForeground(Color.WHITE);
		btnNewButton_8.setBackground(Color.DARK_GRAY);
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bid;
				bid = txtbid1.getText();
				if(bid.trim().length()==0) {
					JOptionPane.showMessageDialog(null, "Please Enter the Book Id to be delted");
				}
				else {

				try {
					Class.forName("com.ibm.db2.jcc.DB2Driver");
					Connection con = (Connection) DriverManager.getConnection("jdbc:db2://localhost:50000/Books",
							"db2admin", "db2admin");
					PreparedStatement pst = con.prepareStatement("delete from books where Book_Id =?");

					pst.setString(1, bid);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Record Delete!!!!!");
					update_table();
					txtbid1.setText("");
					txtbname.setText("");
					txtedition.setText("");
					txtprice.setText("");
					txtbname.requestFocus();
				}

				catch (Exception e1) {

					e1.printStackTrace();
				}
			}}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_8.setBounds(694, 377, 147, 39);
		panel_6.add(btnNewButton_8);
		
		JButton btnNewButton_7_1 = new JButton("Issue");
		btnNewButton_7_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						String issue = txtprice.getText();
						 String bname=txtbname.getText();
						 String from = java.time.LocalDate.now().toString();
						 String to = java.time.LocalDate.now().plusDays(14).toString();
						 String fine ="0";
						Class.forName("com.ibm.db2.jcc.DB2Driver");
						Connection con = (Connection) DriverManager.getConnection("jdbc:db2://localhost:50000/Books", "db2admin",
								"db2admin");

						ResultSet rs = null;
						
						PreparedStatement ps = con.prepareStatement("select * from student");
						
						rs = ps.executeQuery();
					
						JFrame f=new JFrame();
						boolean available = false;
						
							if(issue.equals("Y")) {
								JOptionPane.showMessageDialog(null, "Book Already issued");							
								}
						
						else {
							 String id=JOptionPane.showInputDialog(f,"Enter Student Id"); 
							 while (rs.next()) {
							 if(id.equals(rs.getString("Student_Id"))){
							  available=true;}
							 }
							 if(available) {
								 String id1 = txtbid1.getText().trim();
								 JOptionPane.showMessageDialog(null, "Book Issued to Student Id "+ id);
								 PreparedStatement ps1 = con.prepareStatement("update books set ISSUED='Y' where BOOK_ID=?");
								 ps1.setString(1,id1);
								 ps1.executeUpdate();
								update_table();
						
								 
					 PreparedStatement ps3 = con.prepareStatement("insert into allot(STUDENT_ID,BOOK_ID,BOOK_NAME,FROM,TO,FINE) values(?,?,?,?,?,?)");
						 ps3.setString(1, id);
							 ps3.setString(2,id1 );
						 ps3.setString(3,bname);
						 ps3.setString(4, from);
							 ps3.setString(5, to);
							 ps3.setString(6, fine);
						 ps3.executeUpdate();
						 
							
								 
							 }
			
							
							 else {
								 JOptionPane.showMessageDialog(null, "Student Id "+ id + " does not exist ");
							 }
							}}
						
					catch(Exception e1) {
						
					}
				
					}
		});
		btnNewButton_7_1.setForeground(Color.WHITE);
		btnNewButton_7_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_7_1.setBackground(Color.DARK_GRAY);
		btnNewButton_7_1.setBounds(589, 426, 147, 39);
		panel_6.add(btnNewButton_7_1);
		
		JLabel lblNewLabel_6_2_1 = new JLabel("");
		lblNewLabel_6_2_1.setIcon(new ImageIcon("C:\\Users\\db2admin\\Downloads\\WhatsApp Image 2022-06-09 at 10.32.19 PM (1).jpeg"));
		lblNewLabel_6_2_1.setBounds(0, 0, 929, 478);
		panel_6.add(lblNewLabel_6_2_1);
		
		JPanel panel = new JPanel();
		tabbedPane_1.addTab("New tab", null, panel, null);
		panel.setLayout(null);
		
		JPanel panel_5_1 = new JPanel();
		panel_5_1.setBackground(new Color(51, 51, 51));
		panel_5_1.setBounds(30, 27, 343, 427);
		panel_5_1.setLayout(null);
		panel_5_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Registration", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel.add(panel_5_1);
		
		JButton btnNewButton_5_1 = new JButton("Search All Books");
		btnNewButton_5_1.setBackground(Color.DARK_GRAY);
		btnNewButton_5_1.setForeground(Color.WHITE);
		btnNewButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				update_table1();
			}
		});
		btnNewButton_5_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_5_1.setBounds(23, 68, 286, 45);
		panel_5_1.add(btnNewButton_5_1);
		
		JButton btnNewButton_5_1_1 = new JButton("Issued Books");
		btnNewButton_5_1_1.setBackground(Color.DARK_GRAY);
		btnNewButton_5_1_1.setForeground(Color.WHITE);
		btnNewButton_5_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				update_table3();
				
			}
		});
		btnNewButton_5_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_5_1_1.setBounds(23, 144, 286, 45);
		panel_5_1.add(btnNewButton_5_1_1);
		
		JButton btnNewButton_5_1_2 = new JButton("Available Books");
		btnNewButton_5_1_2.setBackground(Color.DARK_GRAY);
		btnNewButton_5_1_2.setForeground(Color.WHITE);
		btnNewButton_5_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				update_table2();
			}
		});
		btnNewButton_5_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_5_1_2.setBounds(23, 220, 286, 45);
		panel_5_1.add(btnNewButton_5_1_2);
		
		JButton btnNewButton_5_1_2_1 = new JButton("Issued Books to You");
		btnNewButton_5_1_2_1.setBackground(Color.DARK_GRAY);
		btnNewButton_5_1_2_1.setForeground(Color.WHITE);
		btnNewButton_5_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				update_table4();
			}
		});
		btnNewButton_5_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_5_1_2_1.setBounds(23, 302, 286, 45);
		panel_5_1.add(btnNewButton_5_1_2_1);
		
		JLabel lblNewLabel_6_2_1_1 = new JLabel("");
		lblNewLabel_6_2_1_1.setBounds(0, 0, 929, 478);
		lblNewLabel_6_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_6_2_1_1.setBackground(Color.WHITE);
		lblNewLabel_6_2_1_1.setIcon(new ImageIcon("C:\\Users\\db2admin\\Downloads\\WhatsApp Image 2022-06-09 at 10.32.19 PM (1).jpeg"));
		panel.add(lblNewLabel_6_2_1_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(421, 25, 479, 429);
		panel.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setForeground(Color.WHITE);
		table_1.setColumnSelectionAllowed(true);
		table_1.setCellSelectionEnabled(true);
		table_1.setOpaque(true);
		table_1.setFillsViewportHeight(true);
		table_1.setBackground(new Color(51, 51, 51));
	
		scrollPane_1.setViewportView(table_1);
		
		JPanel panel_8 = new JPanel();
		tabbedPane_1.addTab("New tab", null, panel_8, null);
		panel_8.setLayout(null);
		
		JPanel panel_5_2 = new JPanel();
		panel_5_2.setBounds(39, 10, 343, 357);
		panel_5_2.setLayout(null);
		panel_5_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Registration", TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE));
		panel_5_2.setBackground(new Color(51, 51, 51));
		panel_8.add(panel_5_2);
		
		JLabel lblNewLabel_3_4 = new JLabel("Student Id");
		lblNewLabel_3_4.setForeground(Color.WHITE);
		lblNewLabel_3_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_4.setBounds(31, 56, 87, 19);
		panel_5_2.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Password");
		lblNewLabel_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_1_1.setBounds(31, 185, 87, 19);
		panel_5_2.add(lblNewLabel_3_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(174, 122, 120, 19);
		panel_5_2.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(174, 187, 120, 19);
		panel_5_2.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(174, 58, 120, 19);
		panel_5_2.add(textField_4);
		
		JButton btnNewButton_5_2 = new JButton("Save");
		btnNewButton_5_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
					String sname,sid , spass;
					sid = textField_4.getText();
					sname = textField_2.getText();
					spass = textField_2.getText(); 
					if(sid.trim().length()==0||sname.trim().length()==0||spass.trim().length()==0) {
						JOptionPane.showMessageDialog(null, "Please Enter All Fields");
					}
					else {
					try {
						Class.forName("com.ibm.db2.jcc.DB2Driver");
						Connection con = (Connection) DriverManager.getConnection("jdbc:db2://localhost:50000/Books",
								"db2admin", "db2admin");
						PreparedStatement pst = con
								.prepareStatement("insert into student(Name,Student_Id,Password)values(?,?,?)");

						pst.setString(1, sname);
						pst.setString(2, sid);
						pst.setString(3, spass);
						
			
						
						ResultSet rs1=null;
						PreparedStatement ps2 = con.prepareStatement("select * from student");
						rs1 = ps2.executeQuery();
						boolean available = false;
						while (rs1.next()) {
							
								if(sid.equals(rs1.getString("Student_Id"))) {
									available=true;
									break;
								}
						}
						if(available) {
							JOptionPane.showMessageDialog(null,"ID `"+sid+"` IS ALREADY PRESENT IN THE TABLE");
							
							
						}
						else {
							pst.executeUpdate();
							JOptionPane.showMessageDialog(null, "Record Addedddd!!!!!");
							update_table5();

							textField_4.setText("");
							textField_2.setText("");
							txtprice.setText("");
							textField_3.setText("");
							textField_2.requestFocus();;
						}
						}
				
					
					
					catch (Exception e1) {

						e1.printStackTrace();
					}}
			}});
		btnNewButton_5_2.setForeground(Color.WHITE);
		btnNewButton_5_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_5_2.setBackground(SystemColor.controlDkShadow);
		btnNewButton_5_2.setBounds(31, 276, 120, 45);
		panel_5_2.add(btnNewButton_5_2);
		
		JButton btnNewButton_6_1 = new JButton("Clear");
		btnNewButton_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_4.setText("");
				textField_2.setText("");
				textField_3.setText("");
				
			}
		});
		btnNewButton_6_1.setForeground(Color.WHITE);
		btnNewButton_6_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_6_1.setBackground(SystemColor.controlDkShadow);
		btnNewButton_6_1.setBounds(174, 276, 120, 45);
		panel_5_2.add(btnNewButton_6_1);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("Student Name");
		lblNewLabel_3_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_3_1.setBounds(31, 120, 120, 19);
		panel_5_2.add(lblNewLabel_3_3_1);
		
		JPanel panel_7_1 = new JPanel();
		panel_7_1.setBounds(39, 394, 343, 64);
		panel_7_1.setLayout(null);
		panel_7_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Search", TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE));
		panel_7_1.setBackground(new Color(51, 51, 51));
		panel_8.add(panel_7_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(118, 31, 197, 19);
		textField_6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try {

					String id = textField_6.getText();
					id = id.trim();
					Class.forName("com.ibm.db2.jcc.DB2Driver");
					Connection con = (Connection) DriverManager.getConnection("jdbc:db2://localhost:50000/Books",
							"db2admin", "db2admin");

					PreparedStatement pst = con
							.prepareStatement("select Student_Id,Name,Password from student where Student_Id = ?");
					pst.setString(1, id);
					ResultSet rs = pst.executeQuery();

					if (rs.next() == true) {
						String name = rs.getString(1);
						String id1 = rs.getString(2);
						String pass = rs.getString(3);

						textField_2.setText(id1);
						textField_4.setText(name);
						textField_3.setText(pass);

					} else {
						textField_2.setText("");
						textField_4.setText("");
						textField_3.setText("");

					}

				}

				catch (Exception ex) {

				}

			}
		});
		panel_7_1.add(textField_6);
		
		JLabel lblNewLabel_4_1 = new JLabel("Student Id");
		lblNewLabel_4_1.setBounds(10, 23, 96, 31);
		panel_7_1.add(lblNewLabel_4_1);
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton btnNewButton_7_2 = new JButton("Update");
		btnNewButton_7_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sname,spass, sid;

				sname = textField_2.getText();
				spass = textField_3.getText();
				sid = textField_4.getText();
				if(sname.trim().length()==0||sid.trim().length()==0||spass.trim().length()==0) {
					JOptionPane.showMessageDialog(null, "Please Enter All Fields");
				}
				else {
				try {
					Class.forName("com.ibm.db2.jcc.DB2Driver");
					Connection con = (Connection) DriverManager.getConnection("jdbc:db2://localhost:50000/Books",
							"db2admin", "db2admin");
					
					PreparedStatement pst = con
							.prepareStatement("update student set Name= ?,Password=? where Student_Id =?");
					pst.setString(1, sname);
					pst.setString(2, spass);
					pst.setString(3, sid);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Record Update!!!!!");
					update_table5();
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");

				}

				catch (Exception e1) {

					e1.printStackTrace();
				}

			}}
			
		});
		btnNewButton_7_2.setBounds(489, 377, 147, 39);
		btnNewButton_7_2.setForeground(Color.WHITE);
		btnNewButton_7_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_7_2.setBackground(Color.DARK_GRAY);
		panel_8.add(btnNewButton_7_2);
		
		JButton btnNewButton_8_1 = new JButton("Delete");
		btnNewButton_8_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String  sid;

				sid = textField_4.getText();
	
				try {
					Class.forName("com.ibm.db2.jcc.DB2Driver");
					Connection con = (Connection) DriverManager.getConnection("jdbc:db2://localhost:50000/Books",
							"db2admin", "db2admin");
					
					PreparedStatement pst = con
							.prepareStatement("delete from student where Student_Id =?");
					pst.setString(1, sid);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Record Deleted!!!!!");
					update_table5();
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");

				}

				catch (Exception e1) {

					e1.printStackTrace();
				
			}}
		});
		
		JButton btnNewButton_8_1_1_1 = new JButton("Stud Details");
		btnNewButton_8_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				update_table5();
			}
		});
		btnNewButton_8_1_1_1.setForeground(Color.WHITE);
		btnNewButton_8_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_8_1_1_1.setBackground(Color.DARK_GRAY);
		btnNewButton_8_1_1_1.setBounds(489, 426, 150, 39);
		panel_8.add(btnNewButton_8_1_1_1);
		btnNewButton_8_1.setBounds(674, 377, 147, 39);
		btnNewButton_8_1.setForeground(Color.WHITE);
		btnNewButton_8_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_8_1.setBackground(Color.DARK_GRAY);
		panel_8.add(btnNewButton_8_1);
		
		JButton btnNewButton_8_1_1 = new JButton("Issued Books");
		btnNewButton_8_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

					Class.forName("com.ibm.db2.jcc.DB2Driver");
					Connection con = (Connection) DriverManager.getConnection("jdbc:db2://localhost:50000/Books", "db2admin",
							"db2admin");

					ResultSet rs = null;
					
					PreparedStatement ps = con.prepareStatement("select * from allot");
					
					rs = ps.executeQuery();
				
					JFrame f=new JFrame();
					boolean available = false;
						 ids=JOptionPane.showInputDialog(f,"Enter Student Id"); 
						 while (rs.next()) {
						 if(ids.equals(rs.getString("Student_Id"))){
						  available=true;}
						 }
						 if(available) {
							update_table6();
				 }
						
						 else {
							 JOptionPane.showMessageDialog(null, "Student Id "+ ids + " does have any book issued");
						 }
						}
					
				catch(Exception e1) {
					
				}
			
				}
			});
		btnNewButton_8_1_1.setForeground(Color.WHITE);
		btnNewButton_8_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_8_1_1.setBackground(Color.DARK_GRAY);
		btnNewButton_8_1_1.setBounds(671, 426, 150, 39);
		panel_8.add(btnNewButton_8_1_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				 String id,name,phone; 
				 int row = table_2.getSelectedRow(); id= (String)
				  table_2.getValueAt(row , 0); name=(String) table_2.getValueAt(row , 1);
				 phone=(String) table_2.getValueAt(row , 2);  
				 
				  textField_2.setText(id); textField_4.setText(name); textField_3.setText(phone);
				  
			  
			}
		});
		scrollPane_2.setBounds(461, 10, 386, 357);
		panel_8.add(scrollPane_2);
		
		table_2 = new JTable();
		table_2.setBorder(new TitledBorder(null, "Student Details", TitledBorder.LEADING, TitledBorder.BELOW_BOTTOM, null, Color.WHITE));
		table_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
					 String id,name,phone; 
					 int row = table_2.getSelectedRow(); id= (String)
					  table_2.getValueAt(row , 0); name=(String) table_2.getValueAt(row , 1);
					 phone=(String) table_2.getValueAt(row , 2);  
					 
					  textField_2.setText(id); textField_4.setText(name); textField_3.setText(phone);
					  
				  
				
			}
		});
		table_2.setForeground(Color.WHITE);
		table_2.setOpaque(true);
		table_2.setFillsViewportHeight(true);
		table_2.setBackground(new Color(51, 51, 51));
		scrollPane_2.setViewportView(table_2);
		
		JLabel lblNewLabel_6_2_1_2 = new JLabel("");
		lblNewLabel_6_2_1_2.setBounds(0, 0, 929, 478);
		lblNewLabel_6_2_1_2.setIcon(new ImageIcon("C:\\Users\\db2admin\\Downloads\\WhatsApp Image 2022-06-09 at 10.32.19 PM (1).jpeg"));
		panel_8.add(lblNewLabel_6_2_1_2);
//		lblNewLabel_6.setBounds(20, 0, 904, 483);
//		ImageIcon I = new ImageIcon("E:\\Eclipse\\workspace\\InternalPractical\\src\\Images\\download.jpg");
//		lblNewLabel_6 .setIcon(new ImageIcon(I.getImage().getScaledInstance(I.getIconWidth(), I.getIconHeight(), Image.SCALE_SMOOTH  )));
//		tabbedPane_1.add(lblNewLabel_6);

	}
}
