/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Felype
 */
public class ConnectionJBDC {
    
   private static final String URL = "jdbc:mysql://localhost:3306/lab";
    private static final String USER = "root";
    private static final String PASSWORD = "password";
    
    public static Connection c;
    
    public static Connection getConn(){
        try {
            if(c == null){
                c=DriverManager.getConnection(URL, USER, PASSWORD);
                return c;
            
            }else{
                return c;
            }
                
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Houve um erro ao tentar conectar banco de dados");
            return null;
        }
        
    };
   
   
}
