/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.seguro.dao;

import cl.duoc.seguro.conexion.Conexion;
import cl.duoc.seguro.dominio.Vida;
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
public class VidaDao {

    //Acá van los métodos que hacen CRUD a la BD.
    //método Crear
    public static ArrayList<Vida> recuperarVida() {

        ArrayList<Vida> paso = new ArrayList<Vida>();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = Conexion.getConnection();
            ps = con.prepareStatement("select * from seguro");
            rs = ps.executeQuery();
            while (rs.next()) {
                Vida v = new Vida() {
                };
                v.setIdentificador(rs.getInt("identificador"));
                v.setNombreCliente(rs.getString("nombreCliente"));
                v.setCosto(rs.getInt("costo"));
                v.setFechaVigencia(rs.getInt("fechaVigencia"));
                v.setNombreAsegurado(rs.getString("nombreAsegurado"));
                v.setEdadAsegurado(rs.getInt("edadAsegurado"));
                v.setValorFallecimiento(rs.getInt("valorFallecimiento"));
                
                paso.add(v);
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
    public static boolean insertarSeguroVida(Vida v) {
        boolean resultado = false;
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = Conexion.getConnection();
            ps = con.prepareStatement("insert into seguro(identificador,nombreCliente, costo, fechaVigencia, "
                    + "nombreAsegurado, edadAsegurado, valorFallecimiento) values(?,?,?,?,?,?,?)");
            ps.setInt(1, v.getIdentificador());
            ps.setString(2, v.getNombreCliente());
            ps.setInt(3, v.getCosto());
            ps.setInt(4, v.getFechaVigencia());
            ps.setString(5, v.getNombreAsegurado());
            ps.setInt(6, v.getEdadAsegurado());
            ps.setInt(7, v.getValorFallecimiento());
            
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

    public static boolean eliminarSeguroVida(Vida v) {
        boolean resultado = false;
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = Conexion.getConnection();
            ps = con.prepareStatement("delete from seguro where identificador=? ");
            ps.setInt(1, v.getIdentificador());

            ps.executeUpdate();
            resultado = true;

        } catch (SQLException e) {
            resultado = false;
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(VidaDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return resultado;
    }
}
//CODIGO CREADO POR KAREN LUENGO TORO Y VICTOR BASTIAS ESCOBAR