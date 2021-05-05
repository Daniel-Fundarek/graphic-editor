package sk.stuba.fei.uim.oop;



import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;



public class TestCanvas extends Canvas implements MouseListener, MouseMotionListener {
    public ArrayList<MyRectangle> obj = new ArrayList<>();
    MyRectangle actualRect;
    int x =0, y= 0;

    public TestCanvas() {
        super();
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        actualRect = new MyRectangle(x,y,1,1, Color.GREEN);

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        obj.add(actualRect);
        repaint();
        actualRect = null;
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if(actualRect !=null){
            int dx = e.getX();
            int dy = e.getY();
            if (dx > this.x && dy < this.y){
                actualRect.y = dy;
                actualRect.width = this.y - dy;
                actualRect.height =  dx - this.x;

            }
            else if(dx < this.x && dy < this.y){
                actualRect.x = dx;
                actualRect.y = dy;
                actualRect.width = this.x - dx;
                actualRect.height = this.y - dy;
            }
            else if(dx < this.x && dy > this.y) {
                actualRect.x = dx;
                actualRect.width = this.x - dx;
                actualRect.height =  dy - this.y;
            }
            else {
                actualRect.width = dx - this.x;
                actualRect.height = dy - this.y;
            }
            repaint();
        }

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void paint(Graphics g) {
         for (MyRectangle a: obj){
             a.paintRect(g);
         }
         if(actualRect != null){
             actualRect.paintRect(g);
         }
    }
}
