package sams;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Suja
 */
public class DB {
 final static String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
    final static String DB_URL="jdbc:mysql://localhost:3306/management";
    final static String USER="root";
    final static String PASS="toor";
    public static Connection Connection(){
        try{
           Class.forName(JDBC_DRIVER);
            
            Connection conn= DriverManager.getConnection(DB_URL,USER,PASS);
            return conn;
            
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
        
    }   
}
