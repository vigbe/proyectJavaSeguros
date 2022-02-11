/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.seguro.dao;

import cl.duoc.seguro.conexion.Conexion;
import cl.duoc.seguro.dominio.Automotriz;
import cl.duoc.seguro.dominio.Vehiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;

import java.util.ArrayList;

/**
 *
 * @author vykto
 */
public class AutomotrizDao {

    
    
    //Acá van los métodos que hacen CRUD a la BD.
    //método Crear
    public static ArrayList<Automotriz> RecuperarDatoAutomotriz() {

        ArrayList<Automotriz> paso = new ArrayList<Automotriz>();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
   
        try {
            con = Conexion.getConnection();
            ps = con.prepareStatement("select * from seguro");
            rs = ps.executeQuery();
            while (rs.next()) {
                Automotriz a = new Automotriz() {};
                Vehiculo ve = new Vehiculo ();
                a.setIdentificador(rs.getInt("identificador"));
                a.setNombreCliente(rs.getString("nombreCliente"));
                a.setCosto(rs.getInt("costo"));
                a.setFechaVigencia(rs.getInt("fechaVigencia"));
                a.setDeducibleUf(rs.getInt("deducibleUf"));
                ve.setPatente(rs.getString("patente"));
                ve.setMarca(rs.getString("marca"));
                ve.setAvaluoFiscal(rs.getInt("avaluoFiscal"));
                
                
                paso.add(a);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(AutomotrizDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return paso;
    }
    public static boolean insertarSeguroAutomotriz (Automotriz a) {
        boolean resultado = false;
        Connection con = null;
        PreparedStatement ps = null;
        
        try {
            con = Conexion.getConnection();
            ps = con.prepareStatement("insert into seguro(identificador, nombreCliente, costo,fechaVigencia,deducibleUf,patente,marca,avaluoFiscal)"
                    + "values(?,?,?,?,?,?,?,?)");
            ps.setInt(1, a.getIdentificador());
            ps.setString(2, a.getNombreCliente());
            ps.setInt(3, a.getCosto());
            ps.setInt(4, a.getFechaVigencia());
            ps.setInt(5, a.getDeducibleUf());
            ps.setString(6, a.vehiculo.getPatente());
            ps.setString(7, a.vehiculo.getMarca());
            ps.setInt(8, a.vehiculo.getAvaluoFiscal());
            ;
            ps.executeUpdate();
            resultado = true;
        } catch (SQLException e) {
            resultado = false;
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(AutomotrizDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return resultado;
    }

    public static boolean eliminarSeguroAutomotriz(Automotriz a) {
        boolean resultado = false;
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = Conexion.getConnection();
            ps = con.prepareStatement("delete from seguro where identificador=? ");
            ps.setInt(1, a.getIdentificador());

            ps.executeUpdate();
            resultado = true;

        } catch (SQLException e) {
            resultado = false;
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(AutomotrizDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return resultado;
    }
}
//CODIGO CREADO POR KAREN LUENGO TORO Y VICTOR BASTIAS ESCOBAR