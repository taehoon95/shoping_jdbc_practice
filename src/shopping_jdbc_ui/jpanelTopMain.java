package shopping_jdbc_ui;

import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class jpanelTopMain extends JPanel {

	public jpanelTopMain() {

		initialize();
	}
	private void initialize() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("날짜별 조회");
		lblNewLabel.setBounds(42, 32, 98, 21);
		add(lblNewLabel);
		
		JComboBox<String> comboBox = new JComboBox();
		comboBox.getSelectedItem().toString();
		comboBox.setBounds(152, 32, 135, 21);
		add(comboBox);
		
		JButton btnNewButton = new JButton("검색");
		btnNewButton.setBounds(318, 31, 72, 22);
		add(btnNewButton);
	}

}
