// INTERFACE : its is similar to class but but here declaration not allow 
// its implement into antoher class
// method and filed in interface is public ,static and final;
// STATIC keyword: it is final key world access anywhere and change its value from anywhwere 
interface A{
    final String intrvar="this is interface variable ";
    void show();

}
class B implements A{
    static String name="ramashish";
    public void show(){
        System.out.println("this is function which decleare in interface A and implement into the class B");
    }
}
// to achieve multiinheritance we used interface i.e show below 
interface vehical{
    void wheel(int a);
    void speed(int a);
    void capicity(int a);
}
class car implements vehical{
    // int wheel;
    // int speed;
    // int capicity;
    @Override
    public void wheel(int a) {
        System.out.println(" wheel in car is 4");
    };
    @Override
    public void speed(int a){
        System.out.println("maximum speed is 120 km/h");
    }
    @Override
    public void capicity(int a){
        System.out.println("capicity of car is 4 to 8 variable on size ");
    }
}
// class bike implements vehical{
//     @Override
//     public void wheel(int a) {System.out.println("wheel in bike is 2 ");};
//     @Override
//     public void capicity(int a) {System.out.println("capicity in bike is 3 person");};
//     @Override
//     public void speed(int a) {System.out.println("speed range can 30- 150 km/h");};
// }
// class bus implements vehical{
//     @Override
//     public void wheel(int a) {System.out.println("wheele in bus is 4- 8 ");};
//     @Override
//     public void speed(int a) {System.out.println("speed of bus 20- 80 km/h");};
//     @Override
//     public void capicity(int a) {System.out.println("capicity is 20-50 person");};
// }
public class Interface {
    public static void main(String args[])
    {
        System.out.println("this is interface tutorial ,interface required altleast one class which is inherited from interface ");
        B ob=new B(); // intialse B class inherited from interface A
        // ob.show();

        // interface example
        car c=new car();
        c.speed(4);
        c.wheel(5);
        c.capicity(0);
         

        
    }
    
}
