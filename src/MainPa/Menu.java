package MainPa;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Menu extends JPanel {
	
	
	private JMenuBar mBar ;
	private JMenu settings,colors;
	private JMenuItem red,blue,green;
	 // getters and setters
	public JMenuItem getGreen() {
		return green;
	}

	public JMenuItem getRed() {
		return red;
	}

	public JMenuItem getBlue() {
		return blue;
	}


	//	MenuClickable menuClickable;
	DigitalClock digitaClock;
	
	public Menu (DigitalClock digitaClock)
	
	{this.digitaClock = digitaClock;
		initialize();
	}
	
	
	public void initialize ()
	{
		this.setLayout(new GridLayout(1,1));
		/*initializing*/
		mBar = new JMenuBar();
		settings = new JMenu("Settings");
		colors = new JMenu("Color");
		red = new JMenuItem("Red");
		green = new JMenuItem("Green");
		blue = new JMenuItem("Blue");
		
		/*Adding to UI*/
		colors.add(red);
		colors.add(green);
		colors.add(blue);
		this.add(mBar);
		mBar.add(settings);
		settings.add(colors);
		/*Adding as ActionListner*/
		red.addActionListener(digitaClock);
		green.addActionListener(digitaClock);
		blue.addActionListener(digitaClock);
			

		
		
	}


}
