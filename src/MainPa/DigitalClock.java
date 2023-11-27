package MainPa;

import java.awt.BorderLayout;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class DigitalClock {
		JFrame frame;
		Menu menu;
		JPanel panel; 
		Labels time,date,day;
	
	public DigitalClock	()
	{
		initialize();
	}
	
	private void initialize() {
	
		frame = new JFrame();
		menu = new Menu();
		panel = new JPanel();
		date= new Labels("date");
		time= new Labels("time");
		day= new Labels("day");
	/*	This way is used to manipulate font for every different label by The font class, 
	 * this in not prefer to me because you have you use so many in try/catch block
		try {
			FontUtility baseFont = new FontUtility("digital-7.ttf",Font.PLAIN);
			baseFont.applyFontSize(80f, time);
		} catch (IOException |FontFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		*/
		/*========FRAME===========*/
		frame.setTitle("My Clock");
		frame.setSize(600, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setResizable(true);
		frame.setLayout(new BorderLayout());
		frame.add(menu,BorderLayout.NORTH);
		frame.add(panel,BorderLayout.CENTER);
		
		/*=========PANEL========== */
		panel.setLayout(new GridLayout(3,1));

		panel.setBackground(Color.black);
		panel.add(date);
		panel.add(time);
		panel.add(day);
		
	    
		getTime();
		

	}
	
	void getTime ()
	{
		while (true)
		{
			LocalDateTime  ld = LocalDateTime.now();
			DateTimeFormatter timeText = DateTimeFormatter.ofPattern("HH:mm:ss");
			DateTimeFormatter dayText = DateTimeFormatter.ofPattern("EEEE");
			DateTimeFormatter dateText = DateTimeFormatter.ofPattern("yyyy - M - d");
			String TimeText = ld.format(timeText);
			String DayText = ld.format(dayText);
			String DateText = ld.format(dateText);
			date.setText(DateText);
			time.setText(TimeText);
			day.setText(DayText);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	

}

