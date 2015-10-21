package components;

import javax.swing.*;

import java.awt.*;

public class Schedule extends JPanel {

	/**
	 * Written by Jack Rivadeneira
	 */
	private static final long serialVersionUID = -3562918757950801886L;

	private Dimension minSize = new Dimension(800, 600);
	private JTable table;
	JPanel p;

	public Schedule() {
		this.buildUI();
	}

	private void buildUI() {
		this.setLayout(new BorderLayout());
		this.setMinimumSize(minSize);
		Object[] ColLabels = "\t;Monday;Tuesday;Wednesday;Thursday;Friday;Saturday;Sunday"
				.split(";");
		Object[][] data = { 
				"0600; ; ; ; ; ; ; ;".split(";"),
				 "0630; ; ; ; ; ; ; ;".split(";"),
				 "0700; ; ; ; ; ; ; ;".split(";"),
				 "0730; ; ; ; ; ; ; ;".split(";"),
				 "0800; ; ; ; ; ; ; ;".split(";"),
				 "0830; ; ; ; ; ; ; ;".split(";"),
				 "0900; ; ; ; ; ; ; ;".split(";"),
				 "0930; ; ; ; ; ; ; ;".split(";"),
				 "1000; ; ; ; ; ; ; ;".split(";"),
				 "1030; ; ; ; ; ; ; ;".split(";"),
				 "1100; ; ; ; ; ; ; ;".split(";"),
				 "1130; ; ; ; ; ; ; ;".split(";"),
				 "1200; ; ; ; ; ; ; ;".split(";"),
				 "1230; ; ; ; ; ; ; ;".split(";"),
				 "1300; ; ; ; ; ; ; ;".split(";"),
				 "1330; ; ; ; ; ; ; ;".split(";"),
				 "1400; ; ; ; ; ; ; ;".split(";"),
				 "1430; ; ; ; ; ; ; ;".split(";"),
				 "1500; ; ; ; ; ; ; ;".split(";"),
				 "1530; ; ; ; ; ; ; ;".split(";"),
				 "1600; ; ; ; ; ; ; ;".split(";"),
				 "1630; ; ; ; ; ; ; ;".split(";"),
				 "1700; ; ; ; ; ; ; ;".split(";"),
				 "1730; ; ; ; ; ; ; ;".split(";"),
				 "1800; ; ; ; ; ; ; ;".split(";"),
				 "1830; ; ; ; ; ; ; ;".split(";"),
				 "1900; ; ; ; ; ; ; ;".split(";"),
				 "1930; ; ; ; ; ; ; ;".split(";"),
				 "2000; ; ; ; ; ; ; ;".split(";"),
				 "2030; ; ; ; ; ; ; ;".split(";"),
				 "2100; ; ; ; ; ; ; ;".split(";")
				};
		table = new JTable(data, ColLabels){
			/**
			 * Stop them from modifying any of the cells.
			 */
			private static final long serialVersionUID = 1L;
			@Override
		    public boolean isCellEditable(int row, int column) {
		        return column == 1 ? true : false;
		    }
		};
		table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		table.getColumnModel().setColumnSelectionAllowed(true);
		table.setRowHeight(32);
		
		this.add(new JScrollPane(table),BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		JFrame jf = new JFrame("TESTING SCHEDULE COMPONENT");
		jf.setSize(1000, 1000);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		jf.add(new Schedule(), BorderLayout.CENTER);
		jf.setVisible(true);
	}
}
