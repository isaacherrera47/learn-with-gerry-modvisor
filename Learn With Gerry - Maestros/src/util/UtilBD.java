/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import bd.ConexionBD;
import clases.PerfilCarga;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Isaac
 */
public class UtilBD {
    
    public boolean cargarPerfil(String nombreUsuario, String password) {
        try {
            ConexionBD.abrirConexion();
            PreparedStatement ps = ConexionBD.con.prepareCall("CALL iniciarSesion(?,?)");
            ps.setString(1, nombreUsuario);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.first()) {
                ps = ConexionBD.con.prepareCall("CALL cargarPerfil(?,?)");
                ps.setString(1, nombreUsuario);
                ps.setString(2, password);
                rs = ps.executeQuery();
                if (rs.first()) {
                    PerfilCarga.setNombre(rs.getString("nombre"));
                    PerfilCarga.setApPaterno(rs.getString("ApPaterno"));
                    PerfilCarga.setApMaterno(rs.getString("ApMaterno"));
                    PerfilCarga.setCodAlias(rs.getString("Alias"));
                    PerfilCarga.setCodAvatar(rs.getInt("avatar"));
                    PerfilCarga.setCodColor(ColorFondo.obtenerColorPorID(rs.getInt("Color")));
                    PerfilCarga.setGrado(rs.getString("grado"));
                    PerfilCarga.setLogros(rs.getInt("Logros Desbloqueados"));
                    PerfilCarga.setNick(rs.getString("usuario"));
                    PerfilCarga.setNivel(rs.getInt("nivel"));
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(UtilBD.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexionBD.cerrarConexion();
        }
        return false;
    }

    public boolean consultaExisteUsuario(String usuario) {
        try {
            ConexionBD.abrirConexion();
            String sql = "SELECT user FROM usuario WHERE user= ?;";
            PreparedStatement ps = ConexionBD.con.prepareStatement(sql);
            ps.setString(1, usuario);
            ResultSet rs = ps.executeQuery();
            return rs.first();
        } catch (SQLException ex) {
            Logger.getLogger(UtilBD.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexionBD.cerrarConexion();
        }
        return false;
    }

    public int llenarPerfil(String usuario, String pass, int idGrado, String nombre, String apPat, String apMat) {
        try {
            ConexionBD.abrirConexion();
            PreparedStatement ps = ConexionBD.con.prepareCall("CALL llenarPerfil(?,?,?,?,?,?)");
            ps.setString(1, usuario);
            ps.setString(2, pass);
            ps.setInt(3, idGrado);
            ps.setString(4, nombre);
            ps.setString(5, apPat);
            ps.setString(6, apMat);
            return ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UtilBD.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexionBD.cerrarConexion();
        }
        return 0;
    }
    
    public int llenarPreguntasUsuario(String usuario, int idPregunta, String respuesta){
        try {
            ConexionBD.abrirConexion();
            PreparedStatement ps= ConexionBD.con.prepareStatement("INSERT INTO preguntausuario values(?,?,?)");
            ps.setInt(1, idPregunta);
            ps.setString(2, usuario);
            ps.setString(3, respuesta);
            return ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UtilBD.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexionBD.cerrarConexion();
        }
        return 0;
    }


}
