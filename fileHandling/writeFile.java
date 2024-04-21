import java.io.FileWriter;
public class writeFile {
    public static void main(String args[]){
        try {
            FileWriter f2=new FileWriter("vardan.txt");// object of FileWriter() only allow to write in file 
            f2.write("this is texrt from .java file againe ");
            f2.write("this is vardan file which can be delelte soon");
            f2.close();// after writing closing is must 
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
