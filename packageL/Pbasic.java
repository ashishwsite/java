// package packageN; // creation of package 
import packageN.*;//after creation using of package 
// after making the make sure that it is successfully complie  
// javac -d . filename.java
// by run button it complile agine the run and make .class file in folder where .java file is presrnt 
// if no name given for package the folder in which .java file present is default package name 
// package alway form in folder in which .java file is present
public class Pbasic {
   public static void main(String agrs[]){
    System.out.println("this is first package by change name");
    System.out.println(" suceesfully package creater and access class from package");
    second obj=new second();
    String data=obj.topic;
    System.out.println(data);
   }
}
