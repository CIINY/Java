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
import javax.swing.JList;
import javax.swing.JFormattedTextField;
import javax.swing.JTextPane;
import javax.swing.JSpinner;

public class WB6_order extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WB6_order frame = new WB6_order();
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
	public WB6_order() {
		setTitle("\uC74C\uB8CC \uC8FC\uBB38");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 391, 632);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("\uC74C\uB8CC \uC8FC\uBB38");
		lblNewLabel_1_1.setFont(new Font("HY°ß°íµñ", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(15, 15, 132, 31);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnNewButton_2 = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			new WB5_menu().setVisible(true);
			}
		});
		btnNewButton_2.setBounds(281, 0, 92, 46);
		contentPane.add(btnNewButton_2);
		
		JList list = new JList();
		list.setBounds(47, 62, 223, 292);
		contentPane.add(list);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(304, 74, 31, 24);
		contentPane.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(304, 136, 31, 24);
		contentPane.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(304, 203, 31, 24);
		contentPane.add(spinner_2);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(304, 269, 31, 24);
		contentPane.add(spinner_3);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setBounds(304, 330, 31, 24);
		contentPane.add(spinner_4);
		
		JLabel lblNewLabel = new JLabel("\uC774 \uCC3D\uC5D0\uB294 \uC5B4\uB5A4 \uCEF4\uD3EC\uB10C\uD2B8\uB97C \uB123\uC5B4\uC57C\uD560\uC9C0 \uBAA8\uB974\uACA0");
		lblNewLabel.setBounds(36, 361, 308, 46);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC2B5\uB2C8\uB2E4. \uBA54\uB274\uD310 \uD654\uBA74\uC5D0\uC11C \uC120\uD0DD\uD55C \uC74C\uB8CC\uC758 \uB370\uC774\uD130");
		lblNewLabel_1.setBounds(36, 400, 308, 24);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("\uB97C \uC774 \uD654\uBA74\uC5D0 \uAC00\uC838\uC640 JSpinner \uCEF4\uD3EC\uB10C\uD2B8\uB85C \uC74C\uB8CC");
		lblNewLabel_1_2.setBounds(36, 427, 308, 24);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("\uC758 \uAC2F\uC218\uB97C \uBA87 \uAC1C \uC8FC\uBB38\uD560 \uAC83\uC778\uAC00\uB85C \uD558\uACE0\uC2F6\uC2B5\uB2C8\uB2E4.");
		lblNewLabel_1_2_1.setBounds(36, 451, 308, 24);
		contentPane.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("\uC774\uB807\uAC8C \uD560\uB824\uBA74 \uC800 \uD558\uC580 \uB124\uBAA8\uCE78\uC5D4 \uC5B4\uB5A4 \uCEF4\uD3EC\uB10C\uD2B8");
		lblNewLabel_1_3_1.setToolTipText("");
		lblNewLabel_1_3_1.setBounds(36, 475, 308, 24);
		contentPane.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_3_1_1 = new JLabel("\uB97C \uB123\uC5B4\uC57C \uD558\uB098\uC694??");
		lblNewLabel_1_3_1_1.setToolTipText("");
		lblNewLabel_1_3_1_1.setBounds(36, 502, 308, 24);
		contentPane.add(lblNewLabel_1_3_1_1);
		
		JButton btnNewButton = new JButton("\uC8FC\uBB38\uD558\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			new WB6_orderSuccess().setVisible(true);
			}
		});
		btnNewButton.setBounds(131, 538, 105, 27);
		contentPane.add(btnNewButton);
	}
}
