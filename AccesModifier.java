import java.util.*;

// ACESS MODIFIER ARE:
// PUBLIC:its can acess into the present package as well as other package 
// PROTECTED: its can be access only in the same package and same object of class and its sub class
//PRIVATE: only acess in the same class ,not even the same object ]
// DEAFAULT : ONLY IN the same package 
class A {
    public void showB() {
        System.out.println(" i am  from public class type");
    }
}
class AI extends A{
    void showAI(){
        System.out.println("this AI behaviour");
    }
}

class B {
    // this is deafult behaviour
    void showB() {
        System.out.println("i am from default class type ");
    }
}
class BI extends B{
    void showBI(){
        System.out.println("this BI behaviour");
    }
}
class C {
    protected void showB() {
        System.out.println(" i am from protected class type ");
    }

}
class CI extends C{
    void showCI(){
        System.out.println("this CI behaviour");
    }
}

class D {

   private void showBD() {
        System.out.println("i am from private class and not aceess by anywhere");
    }

}

public class AccesModifier {
    public static void main(String args[]){
        System.out.println("this is tutorial which decscripe the acess modifier in java ");
        A ao=new A();
        ao.showB();
        System.out.println(" BBBBB");
        B bo=new B();
        bo.showB();
        BI bio=new BI();
        bio.showBI();
        System.out.println(" CCCCCCC");
        C co=new C();
        co.showB();
        CI cio=new CI();
        cio.showB();

        System.out.println(" DDDDDD");
        D Do=new D();
        // Do.showBD();//this is not aceess beacause its is private 

    }

}
