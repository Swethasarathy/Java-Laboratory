import java.awt.*;
import java.applet.*;
public class animation_applet extends Applet 
{
Image img;
public void init()
{
img = getImage(getDocumentBase(),"letter.jpg");  
} 

public void paint(Graphics g) 
{  
for(int i=0;i<500;i++)
{  
g.drawImage(img, i,30, this);  
try
{
	Thread.sleep(100);
	}
catch(Exception e)
{
}  
}  
}
}