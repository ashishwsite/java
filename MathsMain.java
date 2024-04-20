
package mathsP;
import mathsP.*;
class series{
    int  n;
    void counting(int n){
        for(int i=1;i<=n;i++)
        System.out.print(i);
    }
    void odd(int n){
for(int i=1;i<=n;i++){
  if(i%2!=0)  System.out.print(i);
}
    }
}
public class MathsMain {
    public static void main(String args[]){
        double ans=Math.sqrt(9);
        series s=new series();
        s.counting(3);
        s.odd(11);
    // System.out.println(a
    int  RandomEle=(int)(Math.random()*120);// 120 is nuber from upto random number generate
    System.out.println(RandomEle);   
    System.out.println("maths objcet  explaine");
    int mv=Math.max(8,9);
    System.out.println("maximun value using Maths object is "+mv);
    double rn=Math.random();
    System.out.println("output using random function in maths object ="+rn);
    System.out.println("by maltiplay with a number we get random int = "+ rn*1000);
}
}
