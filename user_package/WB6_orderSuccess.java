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

public class WB6_orderSuccess extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WB6_orderSuccess frame = new WB6_orderSuccess();
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
	public WB6_orderSuccess() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 391, 632);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("\uC8FC\uBB38 \uC644\uB8CC");
		lblNewLabel_1_1.setFont(new Font("HY°ß°íµñ", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(15, 15, 132, 31);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel = new JLabel("\uC8FC\uBB38\uC774 \uC644\uB8CC \uB418\uC5C8\uC2B5\uB2C8\uB2E4!");
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		lblNewLabel.setBounds(77, 171, 254, 57);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\uC8FC\uBB38\uB0B4\uC5ED\uBCF4\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			new WB8_orderList().setVisible(true);
			}
		});
		btnNewButton.setBounds(199, 327, 132, 69);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uD648\uC73C\uB85C");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			new WB2_main().setVisible(true);
			}
		});
		btnNewButton_1.setBounds(53, 327, 132, 69);
		contentPane.add(btnNewButton_1);
	}

}
