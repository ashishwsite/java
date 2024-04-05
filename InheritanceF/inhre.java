package InheritanceF;
// define a super/parent /main class 
class cars{
     int wheel=4;
    String name;
    int model;
    double price;

}
// TO stop overdiing due to child class used final key in parent class 
 // defining sub/child/inheritant class
 class tata extends cars{
    // overriding of variable and method in parent class is possible through its child class 
    int  wheel=2;
    void setattribute(String na,double pric,int mode){
        name=na;
        price =pric;
        model=mode;
    }
    void show(){
        System.out.println("name "+name+"  price"+price+"  model"+model);
        System.out.println("wheel is"+wheel);
    }
    
 }
public class inhre {
    public static void main(String args[]){
        cars c1=new cars();
        tata t1=new tata();
        // System.out.println(c1.wheel);

        t1.setattribute("suzuki", 1500000, 2014);
        // t1.show();



        // make parent class to behavior like child
        cars c2=new cars();
        // wheel in cars=4 
        // wheel in tata=2;
        // let seen what ans
        System.out.println(c2.wheel);


    }
}
