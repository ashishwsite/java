// INTERFACE : its is similar to class but but here declaration not allow 
// its implement into antoher class
// method and filed in interface is public ,static and final;
// STATIC keyword: it is final key world access anywhere and change its value from anywhwere 
interface A{
    void show();

}
class B implements A{
    static String name="ramashish";
    public void show(){
        System.out.println("this is function which decleare in interface A and implement into the class B");
    }
}
public class Interface {
    public static void main(String args[])
    {
        System.out.println("this is interface tutorial ");
        B ob=new B();
        ob.show();
        
    }
    
}
