

import java.util.*;


 // MULTIPROCEESING: a single oprating system run multiple process like(powershell,notepad,vscode,excel etc in window ) [window is oprating sysytem]
    // MULTITHREADING:  it is lighter weight then process , thread is inside the process 
    // multiprocessing and multithreading  is the way of attending multitasking sysytem
    // multitasking means doing of multiple /parrellel work simentenoluly 
    //multithreading = ek sath more then "one function is running "
    // multithreading is achieve using extends thread class(present in java ) samll task ke liye normal work karta hai 
    class thread1 extends Thread{// thread is java inbullt class
        @Override// beacause run () already present in thread java class
        public void run(){
            int i=0;
            while (i<4000) {
                System.out.println("thread 1 is ruuning FOOD IS PARPRE");
                i++;
            }
            
        }
    }
    class thread2 extends Thread{
        @Override
        public void run(){
            int i=0;
            while (i<4000) {
                System.out.println("thread 2 is ruuning WHATAPP CHARTING ");
                i++;
            }
            
        }

    }

public class threading {
    public static void main(String args[]){
        System.out.println("this is multithreading tutorial");
        System.out.println("where is .class file ");
        System.out.println("whout making the .class file progrmae is running fine ");
        System.out.println("calling of java thread");
        thread1 t1=new thread1();
        thread2 t2=new thread2();
        t1.start();
        t2.start();

    }
    
}
