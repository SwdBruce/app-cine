/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Database.Conexion;
import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class UsuarioDaoImpl implements UsuarioDao {

    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

    @Override
    public boolean isExistUser(int usuarioId, String contrasena) {
        boolean respuesta = false;

        try {
            con = Conexion.SQLSERVER2017();
            ps = con.prepareStatement("SELECT * FROM Usuario WHERE id=? AND contrasena=?");
            ps.setInt(1, usuarioId);
            ps.setString(2, contrasena);

            rs = ps.executeQuery();

            while (rs.next()) {
                respuesta = true;
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error: Red desconocida.. ponganse en contacto con el Soporte", ".: Sistema", JOptionPane.ERROR_MESSAGE);
        }

        return respuesta;
    }

    @Override
    public int userTipoId(int usuarioId) {
        int tipoUsuarioId = 0;
        try {
            con = Conexion.SQLSERVER2017();
            ps = con.prepareStatement("SELECT tipoId FROM Usuario WHERE id=?");
            ps.setInt(1, usuarioId);

            rs = ps.executeQuery();

            while (rs.next()) {
                tipoUsuarioId = rs.getInt("tipoId");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: Red desconocida.. ponganse en contacto con el Soporte", ".: Sistema", JOptionPane.ERROR_MESSAGE);
        }

        return tipoUsuarioId;
    }

}
