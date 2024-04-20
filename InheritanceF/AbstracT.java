
// ABSTRACT : IT Way inwhich only function is nsame in super class , its defination is describe in its sub class 
//abstraction means hidding the some info from user view point 
abstract class First{
    abstract void show();
}
class Second extends First{
    void show(){
        System.out.println("this is priting from class second ,where show is define  ");
}
}
public class AbstracT {
    public static void main(String args[]){
     //   First(abstract_class_name) f1=new Second()(inherite_class_constructor) ;
   First f1=new Second() ;
 f1.show();

    }
}
