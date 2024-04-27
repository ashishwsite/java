import java.util.*; // this package not all library
import java.io.File;// for file handle we require  java.io.File ,for making the file and checking the exist of file
import java.io.FileWriter;// to write in file 
import java.text.FieldPosition;
import java.io.*;
public class filen {
    public static void main(String args[]){
        System.out.println("this is tutorial of file handling in java ");
        // file creation always required try and catch 
        try {
            File f=new File("vardan.txt"); // making the file object to creation of file
            f.createNewFile();// createfile of given object it return boolean value if create ->true else false
            if(f.exists()){// check the exist of file in directory
                System.out.println("created success ");
            }
            else {
                System.out.println("creation fail");
            }
            // read and write opration in file using FileReader class and Filewriter Class
            FileWriter fw=new FileWriter(f);// creation of FileWrite object by passing file object in constructor

            fw.write("this is vardan file witten by java ");
            fw.close();// closing of writing file is madatory

            FileReader fr=new FileReader(f);
            // fr.read() return no of bite
            //  System.out.println(fr.read());
            // take constructor para as fileReader pbject
             BufferedReader br=new BufferedReader(fr);// BufferReader class requird first fileReader and fileWirter obj;
              System.out.println(br.readLine()) ;// br.readline() return string so makeing printing result
              

                } catch (Exception e) {
            // TODO: handle exception
            System.out.println("exception is come ");
        }
        System.out.println("file directory  is success");
    }
}