
package fakepopvirus;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JWindow;


public class FakePopVirus {
    
    private final  Random rd = new Random();
    private final  Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private final int width = (int) screenSize.getWidth();
    private final int height = (int) screenSize.getHeight();
    
    
    
    public void BlockKeyandMouse() throws AWTException
    {
        Robot rb = new Robot();
        rb.keyPress(KeyEvent.VK_0); 
        rb.mouseMove(rd.nextInt(width),rd.nextInt(height));

    }
    
    public void Popup()
    {
        JWindow win = new JWindow();
        JLabel label = new JLabel("You Have Been Hacked!!!",JLabel.CENTER);
        win.add(label);
        win.setSize(200, 75);
        win.setLocation(rd.nextInt(width), rd.nextInt(height));
        win.setVisible(true);
    
    }
    
    
    
    
    
    public static void main(String[] args) throws AWTException, InterruptedException {
        FakePopVirus fv = new FakePopVirus();
        while(true)
        {
            fv.BlockKeyandMouse();
            fv.Popup();
        }
        
        
    }
    
}
