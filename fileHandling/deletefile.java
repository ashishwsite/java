import java.io.File;
public class deletefile {
    public static void main(String args[]){
     File d=new File("vardan.txt");
     if(d.delete()){
        System.out.println("deletion of vardn file is possibe");
     }
    }
}
