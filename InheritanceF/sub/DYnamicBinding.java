
//Dynamic BInding : it is way of intaillsing at the time of running 
// as at the time of intialling binding is done so class A intise but Acess from B

import acessmodifier.A;
import acessmodifier.B;

class A{
void callme(){
    System.out.println("I ams from A");
}
}
class B extends A{
void callme(){
    System.out.println("I ams from B");
}
}

public class DYnamicBinding {
    public static void main(String args[]){
        A o1=new B();// here  object of Class A , constructor of  B ,as B is inheritant from A so 'B ' class object is created
        o1.callme();// beacuse B class ki field / method acess hoga 
        A o2=new A();
        o2.callme();
        
    }
    
}
