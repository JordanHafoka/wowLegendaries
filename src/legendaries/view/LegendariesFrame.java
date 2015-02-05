package legendaries.view;

import javax.swing.JFrame;

import legendaries.controller.LegendariesController;

public class LegendariesFrame extends JFrame
{
	private LegendariesPanel appPanel;
	
	public LegendariesFrame(LegendariesController baseController)
	{
		appPanel = new LegendariesPanel(baseController);
		setupFrame();
	}
	private void setupFrame()
	{
		this.setResizable(true);
		this.setSize(500, 500);
		this.setContentPane(appPanel);
		this.setVisible(true);
	}
}
