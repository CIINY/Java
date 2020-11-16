package manager_management;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import user_package.WB3_login;

public class WB14 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WB14 frame = new WB14();
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
	public WB14() {
		setTitle("\uAD00\uB9AC\uC790 \uD654\uBA74");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 391, 632);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("\uC8FC\uBB38\uBA54\uB274 \uCC98\uB9AC");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			new WB15().setVisible(true);
			}
		});
		btnNewButton.setBounds(72, 61, 223, 86);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uB4F1\uAE09\uBCC4\uD61C\uD0DD \uC791\uC131");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			new WB16().setVisible(true);
			}
		});
		btnNewButton_1.setBounds(72, 161, 223, 86);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uC9C0\uC810 \uCC98\uB9AC");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			new WB17().setVisible(true);
			}
		});
		btnNewButton_2.setBounds(72, 259, 223, 86);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\uD68C\uC6D0\uC870\uD68C");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			new WB18().setVisible(true);
			}
		});
		btnNewButton_3.setBounds(72, 357, 223, 86);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\uB85C\uADF8\uC544\uC6C3");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			new WB3_login().setVisible(true);
			}
		});
		btnNewButton_4.setBounds(72, 511, 223, 35);
		contentPane.add(btnNewButton_4);
	}

}
