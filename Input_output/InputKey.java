package Input_output;
import java.util.*;// Scanner class is import
// there is 3 method of taking input frome keyboard 
// 1. by command promete : in this method all input taking as string and store in agrs[ ] array 
// 1.1  all input taking at the time at complianation 
// METHOD 2: BY INCluding package(import java.util.*;) and define Scanner class 
public class InputKey {
    public static void main(String args[]){

        //METHOD 1:HERE input is given at time of running and store in args[]
        // by default all input which is given at the time of runing store in args stirng
        for(int i=0;i<args.length;i++)
     {System.out.println(args[i]);}



    // // METHOD 2: BY INCluding package(import java.util.*;) and define Scanner class 
    // Scanner sc=new Scanner(System.in);// this statemt is hard code 
    // System.out.println("enter 3 integer to display avg of given number ");
    // int arr[]=new int[3];// decleration array of length 3
    // for(int i=0;i<3;i++){// taking input in array
    //     arr[i]=sc.nextInt();
    // }
    // int avg=0;
    // for(int i=0;i<arr.length;i++){// by acessing array elment and find sum 
    //     avg+=arr[i];
    // }
    // System.out.println(avg/arr.length);// calculating avg and displaying 


    // METHOD 3 : DataInputStream file import and making class like sc and then take input as Scanner method input 
    }
}
