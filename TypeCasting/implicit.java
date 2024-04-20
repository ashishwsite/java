
public class implicit {// file name
  // implict casting means java automatically convert (int into double)
  // ie int can store in double

  public static void main(String args[]) {
    System.out.println("casting meand convert one data type to other ");
    int p = 89; // int type
    double finalp = p + 18.0;// as p is int and it can automatiaclly cond=vert into double
    System.out.println(finalp);
    // but double cannot store in int
    double gst = 18.0;
    int pr = 70;
    // int fp=pr +18.0;// this line error due to 18.0 as doible
    // to solve this we can do explit casting
    int fp = pr + (int) 18.0;
    System.out.println(fp);
    System.out.println("casting of int to string ");
    int age=23;
    String name="ramashish "+age ;
    System.out.println(name);

  }

}
