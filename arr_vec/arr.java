package arr_vec; //THIS IS PACKAGE NAME /FOLDER NAME 


public class arr {// FILE NAME 
  public static void main(String[] args) { // MAIN FUNCTION START
    // int arra[6 ] thsi is not work
    // every initilise as, new word with type[size]
    int arra[] = new int[6];// simaile like object and class where int is className ,arra is new Object
                            // ,which caling an constructor(which define size of onj )
     arra[0] = 2;
    // System.out.println(arra[0]);
                            
    // other way we define in this way we can not intisle size at start it
    // automaticcay tke size at run time
    int[] prime = { 2, 3, 5, 7, 11, 13 };
    for (int I : prime) {// auto is not dfeine in java 
      // System.out.println(I);
    }

    // MULTI DIMENSION ARR 
    int[][] twoDArr={{1,2,2}};
    char[][] charArr={{'a','f'},{'d','o'}};

  

  }
}
