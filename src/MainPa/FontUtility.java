package MainPa;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;

import javax.swing.JLabel;

import java.io.File;

class FontUtility {
	//This class not in use
    private Font baseFont;

    public FontUtility(String fontFileName, int style) throws IOException, FontFormatException 
    {
        this.baseFont = createCustomFont(fontFileName, style);
    }

    private Font createCustomFont(String fontFileName, int style) throws IOException, FontFormatException
    {
        Font originalFont = Font.createFont(Font.TRUETYPE_FONT, new File(fontFileName));
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        ge.registerFont(originalFont);
        return originalFont.deriveFont(style);
    }

    public void applyFontSize(float size, JLabel... labels) {
        Font customFont = baseFont.deriveFont(size);

        for (JLabel label : labels) {
            label.setFont(customFont);
        }
    }
}
