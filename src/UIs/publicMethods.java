/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIs;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Vikum
 */
public class publicMethods {
    public static Connection ConnectDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection con= DriverManager.getConnection("jdbc:sqlite:data_from.db");
            return con;
        }
        catch(Exception e){
           
           JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
    public Float totalCal(Float discount, Float ppi, int numOfItem){
        Float temp = ppi*numOfItem;
        Float total = temp - temp*(discount/100);
        
        return total;
    }
    
}
