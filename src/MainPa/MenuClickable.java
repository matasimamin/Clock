package MainPa;

import java.awt.Color;

public interface MenuClickable {

	void onColorChangeRed();
	void onColorChangeBlue();
	void onColorChangeGreen();
	
	/*
	 * This interface is created for Observer Pattern where it was used 
	 * between Menu class and DigitalClock by declaring an object of this 
	 * interface in Menu class and pass it as parameter to Menu constructor
	 * and add the menu class as actionlistener to the component 
	 * the use actionperformed method inside Menu class to call 
	 * the methods onColorChangeRed() and it send notify to digitalClock because it
	 * implement the interface and the methods so it called under DigitalClock name
	 * 
	 * 
	 */
}
