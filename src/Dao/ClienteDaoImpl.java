/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Database.Conexion;
import Model.Cliente;
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
public class ClienteDaoImpl implements ClienteDao {

    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

    @Override
    public void insert(Cliente cliente) {

        try {
            con = Conexion.SQLSERVER2017();
            ps = con.prepareStatement("EXEC spClienteInsert @nombres=?,@apellidos=?,@dni=?,@correo=?,@celular=?,@contrasena=?,@tarjeta=?;");
            ps.setString(1, cliente.getNombres());
            ps.setString(2, cliente.getApellidos());
            ps.setInt(3, cliente.getDni());
            ps.setString(4, cliente.getCorreo());
            ps.setInt(5, cliente.getCelular());
            ps.setString(6, cliente.getContrasena());
            ps.setString(7, cliente.getTarjeta());
            ps.executeUpdate();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: Red desconocida.. ponganse en contacto con el Soporte", ".: Servidor", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void update(Cliente cliente) {
        try {
            con = Conexion.SQLSERVER2017();
            ps = con.prepareStatement("EXEC spClienteUpdate @id=?,@nombres=?,@apellidos=?,@dni=?,@correo=?,@celular=?,@contrasena=?,@tarjeta=?;");
            ps.setInt(1, cliente.getCodigo());
            ps.setString(2, cliente.getNombres());
            ps.setString(3, cliente.getApellidos());
            ps.setInt(4, cliente.getDni());
            ps.setString(5, cliente.getCorreo());
            ps.setInt(6, cliente.getCelular());
            ps.setString(7, cliente.getContrasena());
            ps.setString(8, cliente.getTarjeta());
            ps.executeUpdate();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: Red desconocida.. ponganse en contacto con el Soporte", ".: Servidor", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void delete(int usuarioId) {
        try {
            con = Conexion.SQLSERVER2017();
            ps = con.prepareStatement("EXEC spClienteDelete @id=?;");
            ps.setInt(1, usuarioId);
            ps.executeUpdate();            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: Red desconocida.. ponganse en contacto con el Soporte", ".: Servidor", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public Collection<Cliente> findAll() {
        Collection<Cliente> elementos = new ArrayList();

        try {
            con = Conexion.SQLSERVER2017();
            ps = con.prepareStatement("SELECT u.id,u.nombres,u.apellidos,u.dni,u.correo,u.celular,u.contrasena,c.tarjeta FROM Usuario AS u INNER JOIN Cliente AS c ON u.id = c.usuarioId WHERE u.tipoId = 2;");
            rs = ps.executeQuery();

            while (rs.next()) {
                Cliente clienteT = new Cliente();

                clienteT.setCodigo(rs.getInt("id"));
                clienteT.setNombres(rs.getString("nombres"));
                clienteT.setApellidos(rs.getString("apellidos"));
                clienteT.setDni(rs.getInt("dni"));
                clienteT.setCorreo(rs.getString("correo"));
                clienteT.setCelular(rs.getInt("celular"));
                clienteT.setContrasena(rs.getString("contrasena"));
                clienteT.setTarjeta(rs.getString("tarjeta"));

                elementos.add(clienteT);
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return elementos;
    }

}
