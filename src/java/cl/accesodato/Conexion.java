/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.accesodato;

import java.sql.*;

public class Conexion {
    
    private Connection con = null;
    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost/inacap";
    private String user = "root";
    private String pass = "123";
    private Statement smt;
    
    public Conexion(){
        try{
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Usuario conectado"); 
        }catch(Exception ex){
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public void setInsertar(String sql){
        try {
            smt = con.createStatement();
            smt.executeUpdate(sql);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    
}
