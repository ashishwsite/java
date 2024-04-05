package InheritanceF;
//Dynamic BInding : it is way of intaillsing at the time of running 
// as at the time of intialling binding is done so class A intise but Acess from B
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
        A o1=new B();// here name is A class but object create in B ,so all o1.acess from B
        o1.callme();// beacuse B class ki field / method acess hoga 
        A o2=new A();
        o2.callme();
        
    }
    
}
