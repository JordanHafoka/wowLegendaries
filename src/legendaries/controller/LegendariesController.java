package legendaries.controller;

import javax.swing.JOptionPane;

import legendaries.model.Frostmourne;
import legendaries.view.LegendariesFrame;

public class LegendariesController
{
	private Object frostmourne;
	private Object thunderfury;
	private Frostmourne[][] legendaries;
	private LegendariesFrame appFrame;
	
	
	
	public LegendariesController()
	{
		Object frostmourne = new Object();
		Object thunderfury = new Object();
		legendaries = new Frostmourne[2][3];
		fillLegendariesArray();
		appFrame = new LegendariesFrame(this);
	}
	public Frostmourne[][] getLegendaries()
	{
		return legendaries;
	}
	private void fillLegendariesArray()
	{
		for(int row=0; row<legendaries.length; row++)
		{
			for(int col=0; col<legendaries[0].length; col++)
			{
				String name = row + col + "Weapon";
				String owner = "Lich King Arthas Menethil";
				boolean isAvailable = false;
				
				legendaries[row][col] = new Frostmourne(name, owner, isAvailable);
				
			}
		}
	}
	
	public void start()
	{
		JOptionPane.showMessageDialog(appFrame, "Welcome to my Legendaries app :)");
		
	}
	

}
