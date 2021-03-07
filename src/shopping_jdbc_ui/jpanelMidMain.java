package shopping_jdbc_ui;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import shoping_jdbcDaoImpl.saleDaoImpl;
import shoping_jdbcDto.sale;

public class jpanelMidMain extends JPanel {
	private JTable tableMain;

	public jpanelMidMain() {

		initialize();
	}

	private void initialize() {
		setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);

		tableMain = new JTable();
		tableMain.setModel(getModel());
		scrollPane.setViewportView(tableMain);
		
	}

	private DefaultTableModel getModel() {
		return new DefaultTableModel(getData(), getColumn());
	}

	private String[] getColumn() {
		return new String[] { "날짜", "제품코드", "제품명", "주문수량", "단가", "판매액","이익금액" };
	}

	private Object[][] getData() {
		try {
			List<sale> list = saleDaoImpl.getInstance().selectProduct();
			Object[][] arr = new Object[list.size()][];
			for(int i = 0; i < list.size(); i++) {
				sale sale = list.get(i);
				arr[i] = new Object[] {
					sale.getDate(),
					sale.getProduct().getProduct(),
					sale.getProduct().getProName(),
					sale.getSaleRate(),
					sale.getProduct().getProPrice(),
					sale.getSales(),
					sale.getProfit()
				};
			}	
			return arr;				
		}catch(NumberFormatException e) {}
			return null;
	}

}
