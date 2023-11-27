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
		color.addActionListener(this);
		this.add(mBar);
		mBar.add(settings);
		settings.add(color);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==color)
		{
		
		}
		
	}
	

}
