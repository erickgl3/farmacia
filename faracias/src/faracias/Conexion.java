/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faracias;

/**
 *
 * @author Sanchez
 */
import java.sql.Connection;
import java.sql.DriverManager;
public class Conexion {
    Connection con;
    public Connection Conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba","root","");
        }catch (Exception e){
            System.out.print(e.getMessage());
        }
        return con;
    }
}

