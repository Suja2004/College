/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sams;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class College {
            Connection conn = DB.Connection(); 


         public int getMax(){
     int id = 0;
     Statement st;
     try{
         st = conn.createStatement();
         ResultSet rs = st.executeQuery("Select MAX(clgid) from college");
         while(rs.next()){
             id=rs.getInt(1);
         }

     }catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
     }
     return id+1;

 }
}

