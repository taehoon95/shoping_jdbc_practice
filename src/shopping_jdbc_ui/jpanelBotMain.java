package shopping_jdbc_ui;

import javax.swing.JPanel;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class jpanelBotMain extends JPanel {
	private JTextField tfTotalSaleOrder;
	private JTextField tfTotalProfit;
	
	public jpanelBotMain() {

		initialize();
	}
	private void initialize() {	
		JLabel lblTotalSaleOrder = new JLabel("√— ¡÷πÆ∑Æ");
		add(lblTotalSaleOrder);
		
		tfTotalSaleOrder = new JTextField();
		tfTotalSaleOrder.setHorizontalAlignment(SwingConstants.RIGHT);
		add(tfTotalSaleOrder);
		tfTotalSaleOrder.setColumns(10);
		
		JLabel lblTotalProfit = new JLabel("√— ¿Ã¿Õ±›æ◊");
		add(lblTotalProfit);
		
		tfTotalProfit = new JTextField();
		tfTotalProfit.setHorizontalAlignment(SwingConstants.RIGHT);
		add(tfTotalProfit);
		tfTotalProfit.setColumns(10);
	}
	
}
