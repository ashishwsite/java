import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Button;

public class swing_awt {
    public static void main(String args[]){
        System.out.println("main fun is call ");
        JFrame f=new JFrame("my frame");
        f.add(new Button("ok"));// this button not visible beacuse by default layout visible only last component in frame 
        f.add(new Button("cancel"));// as this is last compont so its is visible 
        f.setVisible(true);
        f.setSize(200,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());
System.out.println("at the end of fun ");
    }
}
