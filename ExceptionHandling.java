import java.util.*;
//ERROR : can not catch , and if error come code stop running 
//EXCEPTION: it can be catch  and hande , rest of the code run without distrubing the error/exception componnet part 
// exception handling achieve using { try and catch block}
public class ExceptionHandling {
    public static void main(String args[]){
        int[] marks={45,63,98,65};
        try{
          System.out.println(" the marks i="+marks[9]);
        }
        catch(Exception em){
            System.out.println("exception mess:::"+em);
        }
        System.out.println("run after exception is present in the code ");

    }
    
}
