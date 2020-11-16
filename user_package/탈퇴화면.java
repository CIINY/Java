package user_package;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Å»ÅðÈ­¸é extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Å»ÅðÈ­¸é frame = new Å»ÅðÈ­¸é();
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
	public Å»ÅðÈ­¸é() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 391, 632);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uD0C8\uD1F4 \uC644\uB8CC");
		lblNewLabel.setFont(new Font("HY°ß°íµñ", Font.PLAIN, 30));
		lblNewLabel.setBounds(120, 156, 130, 43);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC774\uC6A9\uD574\uC8FC\uC154\uC11C \uAC10\uC0AC\uD569\uB2C8\uB2E4.");
		lblNewLabel_1.setFont(new Font("HYÁß°íµñ", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(74, 193, 235, 59);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("\uD648\uC73C\uB85C \uB3CC\uC544\uAC00\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			new WB3_login().setVisible(true);
			}
		});
		btnNewButton.setBounds(97, 354, 184, 86);
		contentPane.add(btnNewButton);
	}
}
