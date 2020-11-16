package user_package;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WB11_secession extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WB11_secession frame = new WB11_secession();
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
	public WB11_secession() {
		setTitle("\uD68C\uC6D0 \uD0C8\uD1F4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 391, 632);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u25C6 \uD68C\uC6D0\uD0C8\uD1F4\uB97C \uD558\uC2DC\uB824\uBA74 \uC0AC\uC6A9\uC790 \uBE44\uBC00\uBC88\uD638\uB97C");
		lblNewLabel.setFont(new Font("«‘√ ∑“πŸ≈¡", Font.BOLD, 17));
		lblNewLabel.setBounds(20, 94, 345, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC785\uB825\uD558\uC2ED\uC2DC\uC624.");
		lblNewLabel_1.setFont(new Font("«‘√ ∑“πŸ≈¡", Font.BOLD, 17));
		lblNewLabel_1.setBounds(42, 122, 345, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\uD68C\uC6D0\uD0C8\uD1F4");
		lblNewLabel_1_1.setFont(new Font("HY∞ﬂ∞ÌµÒ", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(20, 25, 132, 31);
		contentPane.add(lblNewLabel_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(112, 220, 150, 24);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("\uD655\uC778");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			new ≈ª≈»≠∏È().setVisible(true);
			}
		});
		btnNewButton.setBounds(35, 330, 126, 66);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uCDE8\uC18C");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			new WB4_info().setVisible(true);
			}
		});
		btnNewButton_1.setBounds(210, 330, 126, 66);
		contentPane.add(btnNewButton_1);
	}
}
