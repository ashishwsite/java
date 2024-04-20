
// variable in the class is called field
// function inside clss is called metheod
// java is class based component so its has one main clss which include main froom excution start
// constructer is method which called automatically at time of intiallasing 
// constructor has not return type ,its used to set the field of objcet 
// ksi bhi progrme me jitna class hoga utna hi .class fiel bana jata hia foleder me 
  class circle{
    
    int r;
    int x,y;
    circle(){
        System.out.println(" constructor is call ");
    }


}
class box{
    int l,b,h;
    //consstructor is crateing 
    box(int l,int b,int h){
        this.l=l;
        this .b=b;
        this .h=h;
    }
    double volume(){
        return l*b*h;
    }
    void dimesion(){
        System.out.println("length " + l + " breadth" + b );
        // System.err.print( "breadth" + b );
        System.err.print("height  " + h);
    }
}
public class mainclass{
    public static void main(String args[]){
        System.out.println("thsi is class intro tutorial");
        // class onjecct is intialled 
        circle c=new circle();
        c.r=2;
        System.out.println(c.r);
        box b1=new box(1, 2, 3);
        System.err.println("volume is "+ b1.volume());
        b1.dimesion();
    }
    
}
