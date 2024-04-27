import java.util.*;
//default priority is 5 in java 
public class thread_con extends Thread {
    //MAKING NEW EXTENDED THREAD AND PASS OBJECT OF THIS THREAD INTO THREAD CONSTRUCTOR AND CALL START METHOD 
     public static void main(String args[]){
        thread_con ch =new thread_con();
        // Thread prt=new Thread(ch);// calling constructor with help of child objcet overide prt class method 
        Thread Ref=Thread.currentThread();
        System.out.println(Ref.getPriority());

        // prt.start();// run method pf prt is replace by run () of child
        // ch.start();
     }
     public void run(){
        System.out.println("run method of child class is running ");
     }
}
