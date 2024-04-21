import java.util.*; // this package not all library
import java.io.File;// for file handle we require  java.io.File
import java.io.FileWriter;// to write in file 
import java.text.FieldPosition;
public class filen {

    public static void main(String args[]){
        System.out.println("this is tutorial of file handling in java ");
        // file creation always required try and catch 
        try {
            File f=new File("vardan.txt");
            if(f.createNewFile()){
                System.out.println("created success ");
               
            }
            else {
                System.out.println("creation fail");
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("exception is come ");
        }
        
        
        System.out.println("file creation is success");
    }
}