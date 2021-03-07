package shopping_jdbc_ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class shopping_Main extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnMain;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					shopping_Main frame = new shopping_Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public shopping_Main() {
		initialize();
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		btnMain = new JButton("메인");
		btnMain.addActionListener(this);
		contentPane.add(btnMain);
		
		JButton btnProduct = new JButton("제품조회");
		contentPane.add(btnProduct);
		
		JButton btnDetail = new JButton("상세조회");
		contentPane.add(btnDetail);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnMain) {
			btnMainActionPerformed(e);
		}
	}
	protected void btnMainActionPerformed(ActionEvent e) {
		jframeMain frame = new jframeMain();
		frame.setVisible(true);
	}
}
