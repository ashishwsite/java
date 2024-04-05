package Input_output;
// import javax.swing.text.Style;
// there 3 type by which output shown on diaplay 
// 1. print("massage to display ") print whitout cussor shift to new line 
// 2.println("message  display " ) print message and cursor move to new line 
// 3. printf(" formating printing ") its is similr to C Progmaing language it alse required %d for interger 
// + is seprator between two message/expreesion 
public class outputMeth {
  public static void main(String args[]) {
    int age = 9;
    String name = "ramashish";// java string required Cappital S
    double avg = 8.5;// flot is not present in java
    char gender = 'M';
    // printing message using println() means each line
    System.out.println(name);
    System.out.print(gender + "\n");
    System.out.println(age);
    // printing message using printf() formating display manner
    System.out.printf("the avg value is a %f", avg);

  }
}