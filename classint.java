// variable in the class is called field
// function inside clss is called metheod
// java is class based component so its has one main clss which include main froom excution start
// constructer is method which called automatically at time of intiallasing 
// constructor has not return type ,its used to set the field of objcet 
class circle{
    
    int r;
    int x,y;
    double circumfence(){
        return 3.14*r*2;
    }
    double area(){
        return 3.14*r*r;
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
public class classint {
    public static void main(String args[]){
        System.out.println("thsi is class intro tutorial");
        // class onjecct is intialled 
        circle c=new circle();
        c.r=2;
        System.err.println("circumfence is " + c.circumfence());
        System.err.println("area of circle is " + c.area());
        box b1=new box(1, 2, 3);
        System.err.println("volume is "+ b1.volume());
        b1.dimesion();
    }
    
}
