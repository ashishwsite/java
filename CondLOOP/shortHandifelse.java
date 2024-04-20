
import java.util.*;
 class check{
    check(){
        System.out.println("check construtor is call ");
    }
    public void show(){
        System.out.println("this is show function in object ");
    }
}

public class shortHandifelse {
    // pahle condtion check karta hai 
    // condtion ,?(if) {if running code } :(elese) {else running code }
   
    public static void main(String args[]){
        int a=9 ,b=23;
        check c1=new check();
        // ? ->if  then run condtion 
        // condtion is return at strating me 
        boolean ans=(a>b)? true :false;
        // :->else then condition
    //  System.out.println(ans);

    //switch case code 
    int day=3;
    switch (3) {
        case 6:
            System.out.println("week day");
            break;
       case 7:
          System.out.println("week day");
          break;
        default:
        System.out.println("no a week day");
            break;
    }
    }
}
