package legendaries.view;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SpringLayout;
import javax.swing.table.DefaultTableModel;

import legendaries.controller.LegendariesController;
import javax.swing.border.LineBorder;

public class LegendariesPanel extends JPanel
{
	private LegendariesController baseController;
	private JTable legendaries;
	private SpringLayout baseLayout;
	private JLabel titleLabel;
	private JTable legendariesTable;
	
	
	public LegendariesPanel(LegendariesController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		titleLabel = new JLabel("JJ's Legendary Items");
		titleLabel.setForeground(Color.GREEN);
		titleLabel.setBackground(Color.GREEN);
	
		
		setupTable();
		
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	private void setupTable()
	{
		String colNames[] = {"Name, Owner, Is Available"};
		DefaultTableModel legendariesModel = new DefaultTableModel(baseController.getLegendaries(), colNames);
		legendariesTable = new JTable(legendariesModel);
		legendariesTable.setBorder(new LineBorder(new Color(0, 0, 0)));
	
	
	}
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, legendariesTable, 26, SpringLayout.SOUTH, titleLabel);
		baseLayout.putConstraint(SpringLayout.WEST, legendariesTable, 87, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, legendariesTable, -50, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, legendariesTable, -84, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, titleLabel, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, titleLabel, -171, SpringLayout.EAST, this);
	}
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(legendariesTable);
		this.add(titleLabel);
		this.setBackground(Color.DARK_GRAY);
		
	}
	private void setupListeners()
	{
		
	}
}
