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
import javax.swing.JLabel;
import java.awt.Font;

public class WB8_orderList extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WB8_orderList frame = new WB8_orderList();
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
	public WB8_orderList() {
		setTitle("\uC8FC\uBB38\uB0B4\uC5ED\uBAA9\uB85D");
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
		
		table = new JTable();
		table.setBounds(33, 90, 308, 417);
		contentPane.add(table);
		
		JLabel lblNewLabel_1_1 = new JLabel("\uC8FC\uBB38\uB0B4\uC5ED\uBAA9\uB85D");
		lblNewLabel_1_1.setFont(new Font("HY°ß°íµñ", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(15, 15, 132, 31);
		contentPane.add(lblNewLabel_1_1);
	}

}
