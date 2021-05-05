package sk.stuba.fei.uim.oop;

import java.awt.*;

public class MyRectangle extends Rectangle {
    Color farba;

    public MyRectangle(int x, int y, int width, int height, Color farba) {
        super(x, y, width, height);
        this.farba = farba;
    }
    public void paintRect(Graphics g){
        g.setColor(farba);
        g.fillRect(this.x,this.y,this.width,this.height);
    }
}
