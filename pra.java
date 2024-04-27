class parent{
    String name="parent";
    String mess(){
        return "parent class";
    }
}
class child extends parent{
    String name="child";
    String mess(){
        return " child class ";
    }
}
public class pra {
    public static void main(String[] args) {
        parent o=new child();// here call for parent clas but due to function ovride its value is change 
        System.out.println(o.name+" "+o.mess());
        out.println(" sjf");
    }
}
