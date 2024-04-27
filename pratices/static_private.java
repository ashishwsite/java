// package pratices;
import java.util.*;
class exam{
    int subj=4;
}

public class static_private {
    //VARIABLE TYPE 
    // instance variable by default =0; crated whever onbject is created
    // static variable by default=0
    // local variable by default null ,so error untill it initiase ,local variable is the variable which is intiasel inside the function block
    // local veriable nevear be an static variable , so compliee time error
    private int x;// this is private variable ,it intiallse with 0 intiallay ,as its not static so it create whenever object is formed,private variable  access with in same calss only 
     
float fv=3.9f;// if f in last of decimal valu than its is by deafault 3.9 is double type
// in java object only intiase with new key word and constructor ,
//  exam e1;   object not create , its  like varable , complisation error beacuse local variable as null

//   prt p1=new childC();
//  object child class ka , refernce parent class ka possible hai 

// public class name is same as file name and main() function define in it ,
// no two public class exist in same file       

// variable with final keyword is balank intially

// REFRENCE NUMBER COMPARISION IN OBJECT 
 String s1=new String("first");
 String s3=new String("first");
//  if(s1==s3) // its is false because object ka ref comparision , and two object have not same ref 
 
    public static void main(String args[]){
        System.out.println("this is static");
        // System.out.println(x); // error beacuse x is not static so make sure first create obj
    }
}
