package snippets11;

/**
 * Created by root on 16/3/16.
 */


//	Write a simple JAVA Program using Mouse Event handlers.

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="MouseEvents" width=300 height=100> </applet>*/
public class MouseEvents  extends Applet implements MouseListener,MouseMotionListener
{
    String msg= " ";
    int mousex=0,mousey=0; // coordinates of mouse
    public void init()
    {
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    public void mouseClicked(MouseEvent me)
    {	// Save coordinates
        mousex=0; mousey=10; msg="Mouse clicked"; repaint();
    }
    public void mouseEntered (MouseEvent me)
    {	// Save coordinates
        mousex=0; mousey=10; msg="Mouse entered"; repaint();
    }
    public void mouseExited(MouseEvent me)
    {	// Save coordinates
        mousex=0; mousey=10; msg="Mouse exited"; repaint();
    }
    public void mousePressed (MouseEvent me)
    {	// Save coordinates
        mousex=me.getX(); mousey=me.getY();msg="Down"; repaint();
    }
    public void mouseReleased (MouseEvent me)
    {	// Save coordinates
        mousex=me.getX(); mousey=me.getY();msg="Up"; repaint();
    }
    public void mouseMoved (MouseEvent me)
    {	// Save status
        showStatus("Moving mouse at"+me.getX()+","+me.getY());
    }
    public void mouseDragged (MouseEvent me)
    {	// Save coordinates
        mousex=me.getX(); mousey=me.getY(); msg="*";
        showStatus ("Dragging mouse at"+mousex+","+mousey);
        repaint();
    }
    public void paint (Graphics g)
    {
        g.drawString(msg, mousex, mousey);
    }
}