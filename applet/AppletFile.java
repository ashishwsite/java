//  link:https://www.javatpoint.com/java-applet
//  applet is ui made using java
//  it has many predefine method 
//  applet is lokking like window 
//  applet has 5 impoertant method
//  applet is run using coomand appletviwer 
// applet is help ,when dynamic behaviour are present
//  applet file required html file to view/run applet in web browser 
// HTML FILE ME 
// <applet> tag ke under applet ko run karne ke liye code likha jata hai 
import java.applet.*;  
import java.awt.*;  // provide graphical tool and design 
public class AppletFile extends Applet{  
public void paint(Graphics g){  // applet me void main ke jagah void paint (hota hai ) ,parameter Graphics object leta hai 
g.drawString("welcome",150,150);  
}  
  
} 