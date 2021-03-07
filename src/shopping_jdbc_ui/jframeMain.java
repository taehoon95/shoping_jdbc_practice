package shopping_jdbc_ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class jframeMain extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jframeMain frame = new jframeMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public jframeMain() {
		initialize();
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 627, 435);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		jpanelTopMain panelTop = new jpanelTopMain();
		panelTop.setBounds(5, 5, 606, 66);
		contentPane.add(panelTop);		
		
		jpanelMidMain panelMid = new jpanelMidMain();
		panelMid.setBounds(5, 70, 606, 249);
		contentPane.add(panelMid);
		
		jpanelBotMain panelBot = new jpanelBotMain();
		panelBot.setBounds(5, 319, 606, 67);
		contentPane.add(panelBot);
	}

}
