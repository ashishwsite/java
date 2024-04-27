import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//LINK::   https://www.geeksforgeeks.org/java-awt-tutorial/
// FRAME : IT IS INTIAL CONTAINER ,WITH BOUNDARY AND SOME BUTTON 
class frame extends Frame {
    public frame() {
        Button btn = new Button("click me");
        // btn.setBackground(Color.green);
        btn.setBackground(Color.red);
        btn.setForeground(Color.gray);
        btn.setBounds(20, 50, 50, 30);

        Label l1 = new Label("hello");
        l1.setBackground(Color.blue);
        l1.setForeground(Color.orange);
        l1.setBounds(20, 100, 60, 30);

        TextField tf = new TextField("enter your text ");
        tf.setBounds(20, 150, 80, 30);
        add(btn);
        add(l1);
        add(tf);
        setTitle("title");
        setSize(400, 300);
        java.awt.Container.setLayout(LayoutManager mgr) ;// btn.setBounds();
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

    }

    public void tilte(String t) {
        setTitle(t);
    }
}

public class frameT {
    public static void main(String args[]) {
        System.out.println("freame is display");
        frame f = new frame();
        f.tilte("second window");
        // Frame obj=new Frame();
        // obj.setTitle("first window");
        // obj.setSize(400,300);
        // obj.setVisible(true);

    }

}