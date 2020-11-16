package user_package;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;

public class WB10_benefits extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WB10_benefits frame = new WB10_benefits();
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
	public WB10_benefits() {
		setTitle("\uB4F1\uAE09\uBCC4\uD61C\uD0DD\uC870\uD68C");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 391, 632);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("HOME");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			new WB2_main().setVisible(true);
			}
		});
		btnNewButton_2.setBounds(281, 0, 92, 46);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("VIP");
		lblNewLabel.setFont(new Font("HY¡ﬂ∞ÌµÒ", Font.PLAIN, 20));
		lblNewLabel.setBounds(26, 70, 62, 18);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("\uB4F1\uAE09\uBCC4\uD61C\uD0DD\uC870\uD68C");
		lblNewLabel_1_1.setFont(new Font("HY∞ﬂ∞ÌµÒ", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(15, 15, 152, 31);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblGold = new JLabel("Gold");
		lblGold.setFont(new Font("HY¡ﬂ∞ÌµÒ", Font.PLAIN, 20));
		lblGold.setBounds(26, 190, 62, 18);
		contentPane.add(lblGold);
		
		JLabel lblBlue = new JLabel("Blue");
		lblBlue.setFont(new Font("HY¡ﬂ∞ÌµÒ", Font.PLAIN, 20));
		lblBlue.setBounds(26, 310, 62, 18);
		contentPane.add(lblBlue);
		
		JLabel lblFamily = new JLabel("Family");
		lblFamily.setFont(new Font("HY¡ﬂ∞ÌµÒ", Font.PLAIN, 20));
		lblFamily.setBounds(26, 430, 82, 18);
		contentPane.add(lblFamily);
		
		JLabel lblNewLabel_3_1 = new JLabel("\uBA64\uBC84\uC2A4 \uAC00\uC785 \uC2DC");
		lblNewLabel_3_1.setFont(new Font("HY¡ﬂ∞ÌµÒ", Font.PLAIN, 15));
		lblNewLabel_3_1.setBounds(26, 455, 110, 18);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("\uCDA9\uC871\uC694\uAC74: \uC2A4\uD0EC\uD504 24\uAC1C \uC774\uC0C1 \uC801\uB9BD \uC2DC");
		lblNewLabel_3_1_1.setFont(new Font("HY¡ﬂ∞ÌµÒ", Font.PLAIN, 15));
		lblNewLabel_3_1_1.setBounds(26, 335, 273, 18);
		contentPane.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("\uCDA9\uC871\uC694\uAC74: \uC2A4\uD0EC\uD504 48\uAC1C \uC774\uC0C1 \uC801\uB9BD \uC2DC");
		lblNewLabel_3_1_1_1.setFont(new Font("HY¡ﬂ∞ÌµÒ", Font.PLAIN, 15));
		lblNewLabel_3_1_1_1.setBounds(26, 215, 273, 18);
		contentPane.add(lblNewLabel_3_1_1_1);
		
		JLabel lblNewLabel_3_1_1_2 = new JLabel("\uCDA9\uC871\uC694\uAC74: \uC2A4\uD0EC\uD504 120\uAC1C \uC774\uC0C1 \uC801\uB9BD \uC2DC");
		lblNewLabel_3_1_1_2.setFont(new Font("HY¡ﬂ∞ÌµÒ", Font.PLAIN, 15));
		lblNewLabel_3_1_1_2.setBounds(26, 95, 273, 18);
		contentPane.add(lblNewLabel_3_1_1_2);
		
		JLabel lblNewLabel_3_1_1_3 = new JLabel("\uC0DD\uC77C \uCD95\uD558 \uBB34\uB8CC \uC74C\uB8CC \uC81C\uACF5  *\uC2E0\uBD84\uC99D \uC9C0\uCC38");
		lblNewLabel_3_1_1_3.setFont(new Font("HY¡ﬂ∞ÌµÒ", Font.PLAIN, 15));
		lblNewLabel_3_1_1_3.setBounds(26, 360, 273, 18);
		contentPane.add(lblNewLabel_3_1_1_3);
		
		JLabel lblNewLabel_3_1_1_3_1 = new JLabel("*\uC2E0\uBD84\uC99D \uC9C0\uCC38");
		lblNewLabel_3_1_1_3_1.setFont(new Font("HY¡ﬂ∞ÌµÒ", Font.PLAIN, 15));
		lblNewLabel_3_1_1_3_1.setBounds(26, 380, 273, 18);
		contentPane.add(lblNewLabel_3_1_1_3_1);
		
		JLabel lblNewLabel_3_1_1_3_1_1 = new JLabel("\uC2A4\uD0EC\uD504 20\uAC1C \uC801\uB9BD \uC2DC \uB9C8\uB2E4 \uBB34\uB8CC \uC74C\uB8CC \uD558\uB098");
		lblNewLabel_3_1_1_3_1_1.setFont(new Font("HY¡ﬂ∞ÌµÒ", Font.PLAIN, 15));
		lblNewLabel_3_1_1_3_1_1.setBounds(26, 240, 333, 18);
		contentPane.add(lblNewLabel_3_1_1_3_1_1);
		
		JLabel lblNewLabel_3_1_1_3_1_2 = new JLabel("\uC81C\uACF5");
		lblNewLabel_3_1_1_3_1_2.setFont(new Font("HY¡ﬂ∞ÌµÒ", Font.PLAIN, 15));
		lblNewLabel_3_1_1_3_1_2.setBounds(26, 260, 273, 18);
		contentPane.add(lblNewLabel_3_1_1_3_1_2);
		
		JLabel lblNewLabel_3_1_1_2_1 = new JLabel("\uC81C\uACF5");
		lblNewLabel_3_1_1_2_1.setFont(new Font("HY¡ﬂ∞ÌµÒ", Font.PLAIN, 15));
		lblNewLabel_3_1_1_2_1.setBounds(26, 140, 273, 18);
		contentPane.add(lblNewLabel_3_1_1_2_1);
		
		JLabel lblNewLabel_3_1_1_2_1_1 = new JLabel("\uC2A4\uD0EC\uD504 10\uAC1C \uC801\uB9BD \uC2DC \uB9C8\uB2E4 \uBB34\uB8CC \uC74C\uB8CC \uD558\uB098");
		lblNewLabel_3_1_1_2_1_1.setFont(new Font("HY¡ﬂ∞ÌµÒ", Font.PLAIN, 15));
		lblNewLabel_3_1_1_2_1_1.setBounds(26, 120, 296, 18);
		contentPane.add(lblNewLabel_3_1_1_2_1_1);
		
		JLabel lblNewLabel_3_1_1_2_1_2 = new JLabel("\u203B \uC0DD\uC77C \uCD95\uD558 \uBB34\uB8CC \uC74C\uB8CC\uB294 VIP, Gold Level");
		lblNewLabel_3_1_1_2_1_2.setFont(new Font("HY¡ﬂ∞ÌµÒ", Font.PLAIN, 15));
		lblNewLabel_3_1_1_2_1_2.setBounds(26, 500, 318, 18);
		contentPane.add(lblNewLabel_3_1_1_2_1_2);
		
		JLabel lblNewLabel_3_1_1_2_1_3 = new JLabel("\uC5D0\uB3C4 \uD574\uB2F9\uB429\uB2C8\uB2E4.");
		lblNewLabel_3_1_1_2_1_3.setFont(new Font("HY¡ﬂ∞ÌµÒ", Font.PLAIN, 15));
		lblNewLabel_3_1_1_2_1_3.setBounds(47, 520, 273, 18);
		contentPane.add(lblNewLabel_3_1_1_2_1_3);
		
		JLabel lblNewLabel_3_1_1_2_1_3_1 = new JLabel("\uC2A4\uD0EC\uD504\uB294 1\uB144\uB9C8\uB2E4 \uCD08\uAE30\uD654\uB429\uB2C8\uB2E4.");
		lblNewLabel_3_1_1_2_1_3_1.setFont(new Font("HY¡ﬂ∞ÌµÒ", Font.PLAIN, 15));
		lblNewLabel_3_1_1_2_1_3_1.setBounds(47, 540, 273, 18);
		contentPane.add(lblNewLabel_3_1_1_2_1_3_1);
	}
}
