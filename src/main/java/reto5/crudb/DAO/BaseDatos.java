
package reto5.crudb.DAO;

import java.sql.Connection;
import java.sql.DriverManager;


public class BaseDatos {
    Connection conn;
    public void conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/reto4?serverTimezone=UTC", "root", "Mr35qy-1970");
        } catch (Exception e) {
            System.out.println("Error en driver");        
        }
    
    }

    public BaseDatos() {
        conectar();
    }
    
    
    public static void main(String[] args) {
        new BaseDatos();
    }
    
}
