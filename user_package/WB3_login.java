package user_package;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WB3_login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;



	/**
	 * Launch the application.
	 */
	
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WBSecond frame = new WBSecond();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	*/

	/**
	 * Create the frame.
	 */
	
	
	
	
	public WB3_login() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 391, 632);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setLayout(null);	//window화면에 배치방법이 없게하라. 편하게 아무데나 올리라는 말 (Layout을 없애라)
		setContentPane(contentPane);
		ImageIcon image = new ImageIcon("11.png");
		
		
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel.setBounds(88, 196, 78, 15);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\uB85C\uADF8\uC778");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			new WB2_main().setVisible(true);
			}
		});
		btnNewButton.setBounds(88, 307, 78, 27);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("PW");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_1.setBounds(88, 250, 91, 15);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				new WB12_New().setVisible(true);
				
			}
		});
		
		btnNewButton_1.setBounds(194, 307, 94, 27);
		contentPane.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setToolTipText("");
		textField.setColumns(10);
		textField.setBounds(147, 191, 141, 27);
		contentPane.add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("");
		passwordField.setBounds(147, 245, 141, 27);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("NYoung");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 49));
		lblNewLabel_2.setBounds(88, 53, 200, 58);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Cafe");
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 30));
		lblNewLabel_3.setBounds(147, 114, 91, 48);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\uBD80\uC0B0 \uB0B4\uC5D0\uB9CC \uC788\uC2B5\uB2C8\uB2E4!");
		lblNewLabel_4.setBounds(14, 567, 152, 18);
		contentPane.add(lblNewLabel_4);
		//image.setSzie(296.260);
		setResizable(false);
		setVisible(true);
		
		
	}
}
