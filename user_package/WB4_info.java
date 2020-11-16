package user_package;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WB4_info extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WB4_info frame = new WB4_info();
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
	public WB4_info() {
		setTitle("\uD68C\uC6D0\uC815\uBCF4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 391, 632);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("\uD68C\uC6D0\uC815\uBCF4");
		lblNewLabel_1_1.setFont(new Font("HY°ß°íµñ", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(15, 15, 132, 31);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("ID");
		lblNewLabel_2.setFont(new Font("Calibri", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(20, 65, 62, 18);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(65, 62, 147, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\uB2D8");
		lblNewLabel.setFont(new Font("HY°ß°íµñ", Font.PLAIN, 20));
		lblNewLabel.setBounds(226, 65, 62, 18);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\uC8FC\uBB38\uB0B4\uC5ED\uC870\uD68C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			new WB8_orderList().setVisible(true);
			}
		});
		btnNewButton.setBounds(39, 174, 290, 48);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1_1 = new JButton("\uD68C\uC6D0\uC815\uBCF4\uC218\uC815");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			new WB13_infoModify().setVisible(true);
			}
		});
		btnNewButton_1_1.setBounds(20, 406, 333, 48);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("\uD68C\uC6D0\uD0C8\uD1F4");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new WB11_secession().setVisible(true);
			}
		});
		btnNewButton_1_1_1.setBounds(20, 515, 333, 42);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_2 = new JButton("\uBA64\uBC84\uC2ED\uD61C\uD0DD\uC870\uD68C");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			new WB10_benefits().setVisible(true);
			}
		});
		btnNewButton_1_2.setBounds(39, 234, 290, 53);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_2 = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			new WB2_main().setVisible(true);
			}
		});
		btnNewButton_2.setBounds(281, 0, 92, 46);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_1_1_1_1 = new JButton("\uB85C\uADF8\uC544\uC6C3");
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			new WB3_login().setVisible(true);
			}
		});
		btnNewButton_1_1_1_1.setBounds(20, 462, 333, 42);
		contentPane.add(btnNewButton_1_1_1_1);
	}
}
