import java.sql.*;// 1. import package

// JDBC :java database connectivity its is api(server ) which connect with database 
// JDBC DRIVER: its calient side ui for passing query from used to database using JDBC API
public class intro{
  
    public static void main(String args[]) throws Exception{
      System.out.println("starting of main function ");  
      String url="jdbc:mysql://localhost:3306/emp_det";
      String username="root";
      String pass="Ramashish1234@";
      String query="select * from emp";
     
        Class.forName("com.mysql.cj.jdbc.Driver");// 2. loading the driver for jdbc || DONT KNOW HOW THIS ERROR IS RESOLVE   x/
        
        Connection conn = DriverManager.getConnection(url, username, pass);// 3 getting  connection of  database 
        Statement st=conn.createStatement();//4. creating connection
        ResultSet rs=st.executeQuery(query);// 5 sending query 
        while (rs.next()) {// 6 printing the result 
          // int age = rs.getInt("age");
          String name = rs.getString("name");
          int age = rs.getInt("age");
          // Print or process retrieved data
          System.out.println( ",Name: " + name + ", Age: " + age);
      }
      st.close();// 7 closing the connection
      conn.close();
     
    

    }
}