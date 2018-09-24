import java.awt.*;
import java.applet.*;
public class display_image_applet extends Applet 
{
Image pic;
public void init()
{
	pic = getImage(getDocumentBase(), "letter.jpg");
}
public void paint(Graphics g)
{
	g.drawImage(pic,50,50,this);
}
}