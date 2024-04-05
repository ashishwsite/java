package TypeCasting;

import javax.swing.text.Style;

public class IntType {
    public static void main(String args[]){
        int num=4536;
        double numDT=(double) num;
        float NumFT=(float) num;
        // System.out.println(num );
        // System.out.println(numDT );
        // System.out.println(NumFT );


        // converting intger into string  using 
        // String.valueOf(int_var) return an string
        String st=String.valueOf(num);
        // System.out.println(st.charAt(2));

        //coverting integer into string using 
        // Integer.parseint(string_var) return int value
        String Svar="1508";
        int Ivar=Integer.parseInt(Svar);
        // System.out.println(Ivar);

        // converting char to int || 
        char ch='9';
        int Ich=ch-'0';
        System.out.println(Ich);
        //int to char using noraml method
        int it=5;
        char Cit=(char) it;
        // System.out.println(Cit);

     // char to stirng uisng string.valueof(char_var)
     char char_var='t';
     String Sch=String.valueOf(char_var);

    //   string to char type , 
    //   string element access using
    //   string_name.charAt(index) return a charter
        

    }
    
}
