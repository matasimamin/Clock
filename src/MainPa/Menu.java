package MainPa;

import java.awt.GridLayout;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Menu extends JPanel {
	
	
	JMenuBar mBar ;
	 JMenu settings;
	JMenuItem color;
	
	public Menu ()
	{
		initialize();
	}
	
	
	public void initialize ()
	{
		this.setLayout(new GridLayout(1,1));
		mBar = new JMenuBar();
		settings = new JMenu("Settings");
		color = new JMenuItem("Color");
		this.add(mBar);
		mBar.add(settings);
		settings.add(color);
	}
	

}
