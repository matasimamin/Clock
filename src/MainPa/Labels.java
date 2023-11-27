package MainPa;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import java.io.InputStream;
import java.io.File;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Labels extends JLabel {
	
	String type;
	  LineBorder border = new LineBorder(Color.BLUE, 2);
	  Font font;


	  public Labels() {}
	public Labels (String type)
	{
		addNewFont();
		this.setForeground(Color.GREEN);
		this.type = type;
		switch (type)
		{
		case "date":
			this.setFont(font.deriveFont(50f));
			this.setHorizontalAlignment(SwingConstants.LEFT);
			break;
			
		case "time":
			this.setFont(font.deriveFont(80f));
			this.setHorizontalAlignment(JLabel.CENTER);
			
			break;
		case "day":
			this.setFont(font.deriveFont(30f));
			this.setHorizontalAlignment(SwingConstants.RIGHT);
			
			
		}
		
	}
	
	
	private void addNewFont()
	{
		try {
		     //Returned font is of pt size 1
		     font = Font.createFont(Font.TRUETYPE_FONT, new File("digital-7.ttf"));
		     //adding font from file, after 
		     //adding the file in project's main folder.
		     GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		         ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("digital-7.ttf")));
		     //Derive and return a 12 pt version:
		     //Need to use float otherwise
		     //it would be interpreted as style
	} catch (IOException|FontFormatException e) {
		     // Handle exception
				e.getMessage();
		}
	}
}
