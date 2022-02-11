/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.seguro.conexion;

//Creado originalmente por mi
import java.sql.*;

public class Conexion {

    private static Conexion instance = new Conexion();
 
    public static Conexion getInstance() {
        return instance;
    }

    private Conexion() {
        try {
            System.out.println("Conexion() : instanciando Driver");
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Conexion(): Driver instanciado!");
        } catch (Exception e) {
            System.out.println("Conexion(): ERROR: No se pudo instanciar el driver");
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {

        String url = "jdbc:mysql://127.0.0.1:3306/bd_seguro"; 
        ////?characterEncoding=latin1&useConfigs=maxPerformance"
        String user = "root";
        String password = "";  
        return getConnection(url, user, password);
    }

    public static Connection getConnection(String url, String user, String password) {
        Connection conn = null;
  
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            System.out.println("Conexion:getConnection() : ERROR: No se pudo crear la conexion");
            e.printStackTrace();
        }

        return conn;
    }
}
//CODIGO CREADO POR KAREN LUENGO TORO Y VICTOR BASTIAS ESCOBAR