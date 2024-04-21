// package case_study;
import java.util.regex.*;
  
    
public class code {

    public static void show() throws Exception{
        try{
        // System.out.println(" parent class show function is called ");
        throw new Exception();
        }
        finally{
            // System.out.println("exception occer while calling parent class ");
            System.out.println("finally block is call");
        }
    }



    public static void main(String args[]){

    // try{
    //     // prtcl obj=new prtcl();
    //     show();
    //     // System.out.println("show function is called without creating obj");
    // }
    // catch(Exception e){
    //     System.out.println("exception in main class ");
    // }


    // String  st="ramashish kumar thakur ";
    // String subst=st.substring(3,5);// last index char is not include 
    // System.out.println(subst);
    
     String first="hello";
     String second=new String("hello");
     System.out.print(first==second); // false beacuse first string is litaral and second stirng is object 
    }
}
