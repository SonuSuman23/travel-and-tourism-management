
package travel.management.system;

import java.sql.*;

public class conn {
    Connection c;
    Statement s;
    public conn(){
        try{
//            class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///travelmanagementsystem","root","Sonu@2003");
            s = c.createStatement();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        
    }
}
