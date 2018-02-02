package Hope;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Hope2 {

	

		private JFrame frame;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Hope2 window = new Hope2();
						window.frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
		Connection conn = null;
		private JTextField textField;
		private JPasswordField passwordField;

		/**
		 * Create the application.
		 */
		public Hope2() {
			initialize();
			conn=Hope.dbConnector1();
		}

		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			frame = new JFrame();
			frame.setBounds(100, 100, 729, 459);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			JLabel lblNewLabel = new JLabel("\u041B\u043E\u0433\u0456\u043D");
			lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 26));
			lblNewLabel.setBounds(320, 111, 119, 54);
			frame.getContentPane().add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("\u041F\u0430\u0440\u043E\u043B\u044C");
			lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 26));
			lblNewLabel_1.setBounds(317, 213, 137, 69);
			frame.getContentPane().add(lblNewLabel_1);
			
			textField = new JTextField();
			textField.setBounds(516, 124, 160, 38);
			frame.getContentPane().add(textField);
			textField.setColumns(10);
			
			JButton btnNewButton = new JButton("\u041F\u0456\u0434\u0442\u0432\u0435\u0440\u0434\u0438\u0442\u0438");
			Image img1 = new ImageIcon(this.getClass().getResource("/ok.png")).getImage();
			btnNewButton.setIcon(new ImageIcon(img1));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try{
						String query="select * from EmployeeInfo where Імя_працівника=? and Пароль=?";
						PreparedStatement pst = conn.prepareStatement(query);
						pst.setString(1, textField.getText());
						pst.setString(2, passwordField.getText());
						
						ResultSet rs=pst.executeQuery();
						int count =0;
						while(rs.next()){
							count=count+1;
						}
						if(count ==1){
							JOptionPane.showMessageDialog(null, "Логін і пароль прийнято");
							frame.dispose();
							Hope3 hope3 = new Hope3();
							hope3 .setVisible(true);
					//	}else if(count>1){
						//JOptionPane.showMessageDialog(null, "Дублювання Логін і пароль ");
						}else{
							JOptionPane.showMessageDialog(null, "Логін або пароль введено неправильно Попробуйте знову");
						}
						
						rs.close();
						pst.close();
						
					}catch(Exception e){
						JOptionPane.showMessageDialog(null, e);
					}
				}
			});
			btnNewButton.setBounds(382, 301, 217, 60);
			frame.getContentPane().add(btnNewButton);
			
			passwordField = new JPasswordField();
			passwordField.setBounds(516, 232, 160, 40);
			frame.getContentPane().add(passwordField);
			
			JLabel lblNewLabel_2 = new JLabel("");
			Image img = new ImageIcon(this.getClass().getResource("/login.png")).getImage();
			lblNewLabel_2.setIcon(new ImageIcon(img));
			lblNewLabel_2.setBounds(60, 31, 250, 349);
			frame.getContentPane().add(lblNewLabel_2);
		}
	}
