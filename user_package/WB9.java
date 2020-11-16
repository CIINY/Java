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
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;

public class WB9 extends JFrame {

	private JPanel contentPane;
	private JTable table_1;
	private JTable table;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WB9 frame = new WB9();
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
	public WB9() {
		setTitle("\uC9C0\uC810 \uC870\uD68C");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 391, 632);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("HOME");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			setVisible(false);
			new WB2_main().setVisible(true);
			}
		});
		btnNewButton_2.setBounds(281, 0, 92, 46);
		contentPane.add(btnNewButton_2);
		
		table_1 = new JTable();
		table_1.setBounds(359, 102, -342, 382);
		contentPane.add(table_1);
		
		table = new JTable();
		table.setBounds(16, 90, 343, 445);
		contentPane.add(table);
		
		lblNewLabel_1 = new JLabel("\uC9C0\uC810 \uC870\uD68C");
		lblNewLabel_1.setFont(new Font("HY°ß°íµñ", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(15, 15, 132, 31);
		contentPane.add(lblNewLabel_1);
	}
}
