import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ScreenshotExample
{
	public static void main(String[] args)
	{
		try
		{
			Robot robot = new Robot();
			Rectangle rectangle = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
			BufferedImage bufferedImage = robot.createScreenCapture(rectangle);
			File file=new File("screenshot.png");
			boolean status = ImageIO.write(bufferedImage, "png",file);
			System.out.println("Screenshot captured!" + status + "File path: "+file.getAbsolutePath());
		}
		catch(AWTException | IOException ex)
		{
			System.out.println(ex.toString());
		}
	}
}