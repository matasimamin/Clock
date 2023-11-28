package MainPa;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Menu extends JPanel implements ActionListener  {
	
	
	JMenuBar mBar ;
	 JMenu settings,colors;
	JMenuItem red,blue,green;
	MenuClickable menuClickable;

	
	public Menu (MenuClickable colorChangeListener)
	
	{this.menuClickable = colorChangeListener;
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
		red.addActionListener(this);
		green.addActionListener(this);
		blue.addActionListener(this);
			

		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (menuClickable != null)
		{
			if(e.getSource()==red)
			{
		                menuClickable.onColorChangeRed();
			
			} else if(e.getSource()==blue)
			{
			    menuClickable.onColorChangeBlue();
			
			} else if (e.getSource()==green)
			{
				menuClickable.onColorChangeGreen();
			
			} 
		}
		
	}
}
