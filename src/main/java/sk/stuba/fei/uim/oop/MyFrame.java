package sk.stuba.fei.uim.oop;

import javax.swing.*;

public class MyFrame extends JFrame {
    public  MyFrame(){
        TestCanvas  can = new TestCanvas();
        setSize(300,300);
        setVisible(true);
        this.add(can);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
