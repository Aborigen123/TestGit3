package Hope;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


import net.proteanit.sql.DbUtils;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;



public class Hope3 extends JFrame {

	private JPanel contentPane;
	private JComboBox comboBoxSelection;
	private JComboBox comboBoxSelection_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hope3 frame = new Hope3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection conn = null;
	private JTable table;
	private JTable table_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JLabel label_4;
	private JLabel label_6;
	private JLabel label_7;
	private JTextField textField_8;
	private JLabel label_8;
	private JButton button_4;
	private JButton button_5;
	private JTextField textFieldSearch;
	private JTextField textFieldSearch_2;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTable table_3;
	private JButton button_11;
	private JButton button_12;
	private JButton button_13;
	private JLabel label_15;
	private JTextField textField_16;
	private JLabel label_16;
	private JTextField textField_17;
	private JLabel label_17;
	private JTextField textField_18;
	private JButton button_14;
	private JTable table_5;
	private JScrollPane scrollPane_3;
	
	/**
	 * Create the frame.
	 */
	public Hope3() {
		
		
		conn= Hope.dbConnector1();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 997, 562);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 961, 502);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Продовольчі товари", null, panel, null);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(145, 113, 654, 350);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(809, 113, 137, 350);
		panel.add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(5, 399, 89, 20);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(5, 349, 89, 20);
		panel.add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(5, 262, 89, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(5, 219, 89, 20);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(5, 176, 89, 20);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(5, 131, 89, 20);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(5, 80, 89, 20);
		panel.add(textField_7);
		
		JLabel label = new JLabel("\u041D\u0430\u0437\u0432\u0430");
		label.setFont(new Font("Arial", Font.PLAIN, 15));
		label.setBounds(5, 43, 95, 32);
		panel.add(label);
		
		JLabel label_1 = new JLabel("\u0412\u0430\u0433\u0430");
		label_1.setFont(new Font("Arial", Font.PLAIN, 15));
		label_1.setBounds(5, 104, 144, 32);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("\u0412\u0430\u0440\u0442\u0456\u0441\u0442\u044C");
		label_2.setFont(new Font("Arial", Font.PLAIN, 15));
		label_2.setBounds(5, 147, 144, 32);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("\u041A\u0456\u043B\u044C\u043A\u0456\u0441\u0442\u044C");
		label_3.setFont(new Font("Arial", Font.PLAIN, 15));
		label_3.setBounds(5, 190, 144, 32);
		panel.add(label_3);
		
		label_4 = new JLabel("\u0414\u0430\u0442\u0430_\u0432\u0438\u0433\u043E\u0442\u043E\u0432\u043B\u0435\u043D\u043D\u044F");
		label_4.setFont(new Font("Arial", Font.PLAIN, 15));
		label_4.setBounds(5, 233, 144, 32);
		panel.add(label_4);
		
		label_6 = new JLabel("\u0422\u0435\u0440\u043C\u0456\u043D_\u043F\u0440\u0438\u0434\u0430\u0442\u043D\u043E\u0441\u0442\u0456");
		label_6.setFont(new Font("Arial", Font.PLAIN, 15));
		label_6.setBounds(5, 319, 144, 32);
		panel.add(label_6);
		
		label_7 = new JLabel("\u0412\u0438\u0440\u043E\u0431\u043D\u0438\u043A");
		label_7.setFont(new Font("Arial", Font.PLAIN, 15));
		label_7.setBounds(5, 366, 144, 32);
		panel.add(label_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(5, 29, 89, 20);
		panel.add(textField_8);
		
		label_8 = new JLabel("\u041D\u043E\u043C\u0435\u0440");
		label_8.setFont(new Font("Arial", Font.PLAIN, 15));
		label_8.setBounds(5, 0, 144, 32);
		panel.add(label_8);
		
		JButton button = new JButton("\u0417\u0430\u0433\u0440\u0443\u0437\u0438\u0442\u0438");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String query="select  * from provision";
					PreparedStatement pst = conn.prepareStatement(query);
					ResultSet rs=pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			
		});
		button.setBounds(565, 5, 117, 44);
		panel.add(button);
		
		JButton button_1 = new JButton("\u0414\u043E\u0434\u0430\u0442\u0438");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
				
					String query="insert into provision (Номер,Назва,Вага,Вартість,Кількість,Дата_виготовлення,Сьогоднішня_дата,Термін_придатності,Виробник ) values (?,?,?,?,?,?,CURDATE(),?,?)";
					PreparedStatement pst = conn.prepareStatement(query); 
					pst.setString(1, textField_8.getText());
					pst.setString(2, textField_7.getText());
					pst.setString(3, textField_6.getText());
					pst.setString(4, textField_5.getText());
					pst.setString(5, textField_4.getText());
					pst.setString(6, textField_3.getText());
				
					pst.setString(7, textField_1.getText());
					pst.setString(8, textField.getText());
					
					
					pst.execute();
					
					JOptionPane.showMessageDialog(null, "Дані додано");
					
					pst.close();
					
					
				}catch(Exception e){
					e.printStackTrace();
				}
				
			

			}
		});
		
		button_1.setBounds(145, 70, 131, 32);
		panel.add(button_1);
		
		JButton button_2 = new JButton("\u0412\u0438\u043F\u0440\u0430\u0432\u0438\u0442\u0438");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{ 	
					String query="Update provision set Номер ='" +  textField_8.getText() +"',Назва ='"+ textField_7.getText() +"',Вага ='" + textField_6.getText() +"',Вартість ='" + textField_5.getText() +"',Кількість ='" + textField_4.getText() +"',Дата_виготовлення ='" + textField_3.getText() +"',Термін_придатності ='"+ textField_1.getText() +"',Виробник ='"+ textField.getText() +"' where Номер ='"+  textField_8.getText() +"' ";
					PreparedStatement pst = conn.prepareStatement(query);
					
					pst.execute();
					
					JOptionPane.showMessageDialog(null, "Дані оновлено");
					
					pst.close();
					
					
				}catch(Exception q){
					q.printStackTrace();
				}
				

			}
		});
		button_2.setBounds(355, 74, 131, 32);
		panel.add(button_2);
		
		JButton button_3 = new JButton("\u0412\u0438\u0434\u0430\u043B\u0438\u0442\u0438");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{ 	
					String query="delete from provision  where Номер ='"+  textField_8.getText() +"' ";
					PreparedStatement pst = conn.prepareStatement(query);
					
					pst.execute();
					
					JOptionPane.showMessageDialog(null, "Дані видалено");
					
					pst.close();
					
					
				}catch(Exception ex){
					ex.printStackTrace();
				}
			}
		});
		button_3.setBounds(551, 70, 131, 32);
		panel.add(button_3);
		
		button_4 = new JButton("\u0417\u0430\u0433\u0440\u0443\u0437\u0438\u0442\u0438 \u0412\u0456\u0434\u0441\u043E\u0442\u043A\u0438");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String query=" SELECT Номер , (PERIOD_DIFF(Термін_придатності, Сьогоднішня_дата)/PERIOD_DIFF(Термін_придатності, Дата_виготовлення))*100 FROM provision";
					PreparedStatement pst = conn.prepareStatement(query);
					ResultSet rs=pst.executeQuery();
					table_1.setModel(DbUtils.resultSetToTableModel(rs));
					
				}catch(Exception e1){
					e1.printStackTrace();
				}
		
			}
		});
		button_4.setBounds(809, 6, 137, 32);
		panel.add(button_4);
		
		button_5 = new JButton("\u041F\u0440\u043E\u0442\u0435\u0440\u043C\u0456\u043D\u043E\u0432\u0430\u043D\u0456 \u0442\u043E\u0432\u0430\u0440\u0438");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String query=" SELECT Номер , (PERIOD_DIFF(Термін_придатності, Сьогоднішня_дата)/PERIOD_DIFF(Термін_придатності, Дата_виготовлення))*100 FROM provision where (PERIOD_DIFF(Термін_придатності, Сьогоднішня_дата)/PERIOD_DIFF(Термін_придатності, Дата_виготовлення))*100 <20;";
		         PreparedStatement pst = conn.prepareStatement(query);
					ResultSet rs=pst.executeQuery();
					table_1.setModel(DbUtils.resultSetToTableModel(rs));
					
				}catch(Exception e1){
					e1.printStackTrace();
				}
		
		
			}
		});
		button_5.setBounds(809, 43, 137, 59);
		panel.add(button_5);
		
		textFieldSearch = new JTextField();
		textFieldSearch.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				try{
					String selection = (String) comboBoxSelection.getSelectedItem();
					String query = "select * from provision where "+selection+"=?";
					
					System.out.println(query);
					
					PreparedStatement pst = conn.prepareStatement(query);
					pst.setString(1, textFieldSearch.getText());
					ResultSet rs = pst.executeQuery();
					
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
				/*	String query = "select * from provision where Номер=?";
					PreparedStatement pst = conn.prepareStatement(query);
					pst.setString(1, TextSearche.getText());
					ResultSet rs = pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));*/
					pst.close();
					
					}catch(Exception exz) {
						
						exz.printStackTrace();
					}
					
					
				}
			});
		textFieldSearch.setBounds(373, 7, 182, 44);
		panel.add(textFieldSearch);
		textFieldSearch.setColumns(10);
		
		 comboBoxSelection = new JComboBox();
		comboBoxSelection.setModel(new DefaultComboBoxModel(new String[] {"\u041D\u043E\u043C\u0435\u0440", "\u041D\u0430\u0437\u0432\u0430 "}));
		comboBoxSelection.setBounds(208, 7, 155, 32);
		panel.add(comboBoxSelection);
		
		JButton button_15 = new JButton("\u0421\u043E\u0440 \u041D\u0430\u0437\u0432\u0430");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String query="SELECT * from provision ORDER BY Назва;";
					PreparedStatement pst = conn.prepareStatement(query);
					ResultSet rs=pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
				}catch(Exception e){
					e.printStackTrace();
				}
		
			}
		});
		button_15.setBounds(692, 1, 89, 32);
		panel.add(button_15);
		
		JButton button_16 = new JButton("\u0421\u043E\u0440\u0442 \u0412\u0430\u0433\u0438");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String query=" SELECT * from provision ORDER BY Вага;";
					PreparedStatement pst = conn.prepareStatement(query);
					ResultSet rs=pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
				}catch(Exception e){
					e.printStackTrace();
				}
		
			}
		});
		button_16.setBounds(692, 44, 89, 32);
		panel.add(button_16);
		
		JButton button_17 = new JButton("\u041A\u0456\u043B\u043A \u0415\u043B\u0435\u043C");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String query="SELECT Назва, COUNT(Назва) FROM provision  GROUP BY Назва;";
					PreparedStatement pst = conn.prepareStatement(query);
					ResultSet rs=pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
				}catch(Exception e){
					e.printStackTrace();
				}
		
			}
		});
		button_17.setBounds(692, 79, 89, 32);
		panel.add(button_17);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("НЕ продовольчі товари", null, panel_1, null);
		panel_1.setLayout(null);
		
		JButton button_6 = new JButton("\u0412\u0438\u043F\u0440\u0430\u0432\u0438\u0442\u0438");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{ 	
					String query="Update notprovision set Номер ='" +  textField_9.getText() +"',Назва ='"+ textField_10.getText() +"',Вартість ='" + textField_11.getText() +"',Кількість ='" + textField_12.getText() +"',Виробник ='" + textField_13.getText() +"',Габаритні_розміри ='" + textField_14.getText() +"',Група_призначення ='"+ textField_15.getText() +"' where Номер ='"+  textField_9.getText() +"' ";
					PreparedStatement pst = conn.prepareStatement(query);
					
					pst.execute();
					
					JOptionPane.showMessageDialog(null, "Дані оновлено");
					
					pst.close();
					
					
				}catch(Exception q){
					q.printStackTrace();
				}
				

			}
		});
		button_6.setBounds(324, 76, 131, 32);
		panel_1.add(button_6);
		
		JButton button_7 = new JButton("\u0412\u0438\u0434\u0430\u043B\u0438\u0442\u0438");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{ 	
					String query="delete from notprovision  where Номер ='"+  textField_9.getText() +"' ";
					PreparedStatement pst = conn.prepareStatement(query);
					
					pst.execute();
					
					JOptionPane.showMessageDialog(null, "Дані видалено");
					
					pst.close();
					
					
				}catch(Exception ex){
					ex.printStackTrace();
				}
			}
		});
		button_7.setBounds(465, 76, 131, 32);
		panel_1.add(button_7);
		
		JButton button_8 = new JButton("\u0414\u043E\u0434\u0430\u0442\u0438");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					
					String query="insert into notprovision (Номер,Назва,Вартість,Кількість,Виробник,Габаритні_розміри,Група_призначення ) values (?,?,?,?,?,?,?)";
					PreparedStatement pst = conn.prepareStatement(query); 
					pst.setString(1, textField_9.getText());
					pst.setString(2, textField_10.getText());
					pst.setString(3, textField_11.getText());
					pst.setString(4, textField_12.getText());
					pst.setString(5, textField_13.getText());
					pst.setString(6, textField_14.getText());
					pst.setString(7, textField_15.getText());
				
					
					
					pst.execute();
					
					JOptionPane.showMessageDialog(null, "Дані додано");
					
					pst.close();
					
					
				}catch(Exception e2){
					e2.printStackTrace();
				}
				
			

			}
		});
		button_8.setBounds(183, 80, 131, 32);
		panel_1.add(button_8);
		
		comboBoxSelection_1 = new JComboBox();
		comboBoxSelection_1.setModel(new DefaultComboBoxModel(new String[] {"Номер", "Назва","Виробник", "Група_призначення"}));
		comboBoxSelection_1.setBounds(183, 19, 155, 32);
		panel_1.add(comboBoxSelection_1);
		
		textFieldSearch_2 = new JTextField();
		textFieldSearch_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try{
					String selection = (String) comboBoxSelection_1.getSelectedItem();
					String query = "select * from notprovision where "+selection+"=?";
					
					System.out.println(query);
					
					PreparedStatement pst = conn.prepareStatement(query);
					pst.setString(1, textFieldSearch_2.getText());
					ResultSet rs = pst.executeQuery();
					
					table_3.setModel(DbUtils.resultSetToTableModel(rs));
			
					pst.close();
					
					}catch(Exception exz) {
						
						exz.printStackTrace();
					}
					
					
				}
			});
		
		textFieldSearch_2.setColumns(10);
		textFieldSearch_2.setBounds(348, 13, 182, 44);
		panel_1.add(textFieldSearch_2);
		
		JButton button_9 = new JButton("\u0417\u0430\u0433\u0440\u0443\u0437\u0438\u0442\u0438");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String query="select  * from notprovision";
					PreparedStatement pst = conn.prepareStatement(query);
					ResultSet rs=pst.executeQuery();
					table_3.setModel(DbUtils.resultSetToTableModel(rs));
					
				}catch(Exception e1){
					e1.printStackTrace();
				}
			}
		});
		button_9.setBounds(559, 13, 117, 44);
		panel_1.add(button_9);
		
		JButton btnNewButton = new JButton("\u0421\u043E\u0440\u0442\u0443\u0432\u0430\u043D\u043D\u044F \u0437\u0430 \u0446\u0456\u043D\u043E\u044E");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(703, 16, 163, 38);
		panel_1.add(btnNewButton);
		
		JButton button_10 = new JButton("\u0421\u043E\u0440\u0442\u0443\u0432\u0430\u043D\u043D\u044F \u0437\u0430 \u0430\u043B\u0444\u0430\u0432\u0456\u0442\u043E\u043C");
		button_10.setBounds(619, 73, 163, 38);
		panel_1.add(button_10);
		
		JLabel label_5 = new JLabel("\u041D\u043E\u043C\u0435\u0440");
		label_5.setFont(new Font("Arial", Font.PLAIN, 15));
		label_5.setBounds(10, 13, 144, 32);
		panel_1.add(label_5);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(10, 42, 89, 20);
		panel_1.add(textField_9);
		
		JLabel label_9 = new JLabel("\u041D\u0430\u0437\u0432\u0430");
		label_9.setFont(new Font("Arial", Font.PLAIN, 15));
		label_9.setBounds(10, 56, 95, 32);
		panel_1.add(label_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(10, 93, 89, 20);
		panel_1.add(textField_10);
		
		JLabel label_10 = new JLabel("\u0412\u0430\u0440\u0442\u0456\u0441\u0442\u044C");
		label_10.setFont(new Font("Arial", Font.PLAIN, 15));
		label_10.setBounds(10, 117, 144, 32);
		panel_1.add(label_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(10, 144, 89, 20);
		panel_1.add(textField_11);
		
		JLabel label_11 = new JLabel("\u041A\u0456\u043B\u044C\u043A\u0456\u0441\u0442\u044C");
		label_11.setFont(new Font("Arial", Font.PLAIN, 15));
		label_11.setBounds(10, 160, 144, 32);
		panel_1.add(label_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(10, 189, 89, 20);
		panel_1.add(textField_12);
		
		JLabel label_12 = new JLabel("\u0412\u0438\u0440\u043E\u0431\u043D\u0438\u043A");
		label_12.setFont(new Font("Arial", Font.PLAIN, 15));
		label_12.setBounds(10, 203, 144, 32);
		panel_1.add(label_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(10, 232, 89, 20);
		panel_1.add(textField_13);
		
		JLabel label_13 = new JLabel("\u0413\u0430\u0431\u0430\u0440\u0438\u0442\u043D\u0456_\u0440\u043E\u0437\u043C\u0456\u0440\u0438");
		label_13.setFont(new Font("Arial", Font.PLAIN, 15));
		label_13.setBounds(10, 246, 144, 32);
		panel_1.add(label_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(10, 275, 89, 20);
		panel_1.add(textField_14);
		
		JLabel label_14 = new JLabel("\u0413\u0440\u0443\u043F\u0430_\u043F\u0440\u0438\u0437\u043D\u0430\u0447\u0435\u043D\u043D\u044F");
		label_14.setFont(new Font("Arial", Font.PLAIN, 15));
		label_14.setBounds(10, 289, 144, 32);
		panel_1.add(label_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(10, 319, 89, 20);
		panel_1.add(textField_15);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(182, 127, 764, 336);
		panel_1.add(scrollPane_2);
		
		table_3 = new JTable();
		scrollPane_2.setViewportView(table_3);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Працівники", null, panel_2, null);
		panel_2.setLayout(null);
		
		button_11 = new JButton("\u0414\u043E\u0434\u0430\u0442\u0438");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					
					String query="insert into EmployeeInfo (Номер,Імя_працівника,Пароль ) values (?,?,?)";
					PreparedStatement pst = conn.prepareStatement(query); 
					pst.setString(1, textField_16.getText());
					pst.setString(2, textField_17.getText());
					pst.setString(3, textField_18.getText());
					
					
					
					pst.execute();
					
					JOptionPane.showMessageDialog(null, "Дані додано");
					
					pst.close();
					
					
				}catch(Exception e3){
					e3.printStackTrace();
				}
				
			

			}
		});
		
		
		button_11.setBounds(183, 78, 131, 32);
		panel_2.add(button_11);
		
		button_12 = new JButton("\u0412\u0438\u043F\u0440\u0430\u0432\u0438\u0442\u0438");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{ 	
					String query="Update EmployeeInfo set Номер ='" +  textField_16.getText() +"',Імя_працівника ='"+ textField_17.getText() +"',Пароль ='" + textField_18.getText() +"' where Номер ='"+  textField_16.getText() +"' ";
					PreparedStatement pst = conn.prepareStatement(query);
					
					pst.execute();
					
					JOptionPane.showMessageDialog(null, "Дані оновлено");
					
					pst.close();
					
					
				}catch(Exception q){
					q.printStackTrace();
				}
				

			}
		});
		button_12.setBounds(324, 74, 131, 32);
		panel_2.add(button_12);
		
		button_13 = new JButton("\u0412\u0438\u0434\u0430\u043B\u0438\u0442\u0438");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{ 	
					String query="delete from EmployeeInfo  where Номер ='"+  textField_16.getText() +"' ";
					PreparedStatement pst = conn.prepareStatement(query);
					
					pst.execute();
					
					JOptionPane.showMessageDialog(null, "Дані видалено");
					
					pst.close();
					
					
				}catch(Exception ex){
					ex.printStackTrace();
				}
			}
		});
		
		button_13.setBounds(465, 74, 131, 32);
		panel_2.add(button_13);
		
		label_15 = new JLabel("\u041D\u043E\u043C\u0435\u0440");
		label_15.setFont(new Font("Arial", Font.PLAIN, 15));
		label_15.setBounds(10, 11, 144, 32);
		panel_2.add(label_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(10, 40, 89, 20);
		panel_2.add(textField_16);
		
		label_16 = new JLabel("\u0406\u043C'\u044F \u043F\u0440\u0430\u0446\u0456\u0432\u043D\u0438\u043A\u0430");
		label_16.setFont(new Font("Arial", Font.PLAIN, 15));
		label_16.setBounds(10, 54, 117, 32);
		panel_2.add(label_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(10, 91, 89, 20);
		panel_2.add(textField_17);
		
		label_17 = new JLabel("\u041F\u0430\u0440\u043E\u043B\u044C");
		label_17.setFont(new Font("Arial", Font.PLAIN, 15));
		label_17.setBounds(10, 115, 144, 32);
		panel_2.add(label_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(10, 142, 89, 20);
		panel_2.add(textField_18);
		
		button_14 = new JButton("\u0417\u0430\u0433\u0440\u0443\u0437\u0438\u0442\u0438");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String query="select  * from EmployeeInfo";
					PreparedStatement pst = conn.prepareStatement(query);
					ResultSet rs=pst.executeQuery();
					table_5.setModel(DbUtils.resultSetToTableModel(rs));
					
				}catch(Exception e1){
					e1.printStackTrace();
				}
			}
		});
		button_14.setBounds(559, 11, 117, 44);
		panel_2.add(button_14);
		
		scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(183, 121, 739, 342);
		panel_2.add(scrollPane_3);
		
		table_5 = new JTable();
		scrollPane_3.setViewportView(table_5);
		
		JButton button_18 = new JButton("\u0412\u0438\u0432\u0456\u0434 \u0432 txt");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try(FileWriter writer = new FileWriter("D:\\Worker.txt", false)){
					  ResultSet result = null;
				       Statement statement = null;
		            String fileName = "D:\\Worker.txt";
					File file = new File(fileName);
					FileInputStream fis = new FileInputStream(file);
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn = DriverManager.getConnection(
							"jdbc:mysql://localhost:1234/sklad","root","1234");
					String query="select  * from EmployeeInfo";
					PreparedStatement pst = conn.prepareStatement(query);
					ResultSet rs=pst.executeQuery();
//				String pstmt = ("select  * from EmployeeInfo");
//				Statement s = conn.createStatement();
//			       s.executeQuery (pstmt);
//			       ResultSet rs;
//			       rs = s.getResultSet();
			      
			     
			     
			    
			       while (rs.next()){
					
					writer.write(Integer.toString(rs.getInt("Номер")) + ", "); 
					writer.write(rs.getString("Імя_працівника") + ", ");
					writer.write(Integer.toString(rs.getInt("Пароль")) + ", "); 
				
					writer.close();   
			        
			       
			       }
			    
					}catch(Exception e1){
						System.out.println(e1.getMessage());
					}
		}
	});
		button_18.setBounds(748, 11, 117, 44);
		panel_2.add(button_18);
		
		JButton button_19 = new JButton("\u0412\u0432\u0456\u0434 \u0432 txt");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 try{
						String fileName = "D:\\Worker.txt";
						File file = new File(fileName);
						FileInputStream fis = new FileInputStream(file);
						Class.forName("com.mysql.jdbc.Driver");
						Connection conn = DriverManager.getConnection(
								"jdbc:mysql://localhost:1234/sklad","root","1234");
						PreparedStatement pstmt = conn
								.prepareStatement("insert into EmployeeInfo( Номер, Імя_працівника, Пароль) values ( ?, ?, ?)");
						pstmt.setBinaryStream(1,  fis, (int) file.length());
						pstmt.setString(2, file.getName());
						
						pstmt.setBinaryStream(3,  fis, (int) file.length());
						
						pstmt.executeUpdate();
					
				    
						}catch(Exception e1){
							System.out.println(e1.getMessage());
						}
			}
				});
		button_19.setBounds(748, 66, 117, 44);
		panel_2.add(button_19);
	}
}
