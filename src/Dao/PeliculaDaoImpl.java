/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Database.Conexion;
import Model.Pelicula;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class PeliculaDaoImpl implements PeliculaDao {

    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;
    SimpleDateFormat frmt = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public void insert(Pelicula pelicula) {

        try {
            con = Conexion.SQLSERVER2017();
            ps = con.prepareStatement("EXEC spPeliculaInsert @titulo=?,@categoria=?,@fecha=?,@duracion=?,@idioma=?;");
            ps.setString(1, pelicula.getTitulo());
            ps.setString(2, pelicula.getCategoria());
            ps.setString(3, frmt.format(pelicula.getFecha()));
            ps.setString(4, pelicula.getDuracion());
            ps.setString(5, pelicula.getIdioma());
            ps.executeUpdate();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: Red desconocida.. ponganse en contacto con el Soporte", ".: Servidor", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void update(Pelicula pelicula) {
        try {
            con = Conexion.SQLSERVER2017();
            ps = con.prepareStatement("EXEC spPeliculaUpdate @id=?,@titulo=?,@categoria=?,@fecha=?,@duracion=?,@idioma=?;");
            ps.setInt(1, pelicula.getCodigo());
            ps.setString(2, pelicula.getTitulo());
            ps.setString(3, pelicula.getCategoria());            
            ps.setString(4, frmt.format(pelicula.getFecha()));
            ps.setString(5, pelicula.getDuracion());
            ps.setString(6, pelicula.getIdioma());
            
            ps.executeUpdate();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: Red desconocida.. ponganse en contacto con el Soporte", ".: Servidor", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void delete(int peliculaId) {
        try {
            con = Conexion.SQLSERVER2017();
            ps = con.prepareStatement("EXEC spPeliculaDelete @id=?;");
            ps.setInt(1, peliculaId);
            ps.executeUpdate();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: Red desconocida.. ponganse en contacto con el Soporte", ".: Servidor", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public Collection<Pelicula> findAll() {
        Collection<Pelicula> elementos = new ArrayList();

        try {
            con = Conexion.SQLSERVER2017();
            ps = con.prepareStatement("SELECT * FROM Pelicula;");
            rs = ps.executeQuery();

            while (rs.next()) {
                Pelicula peliculaT = new Pelicula();

                peliculaT.setCodigo(rs.getInt("id"));
                peliculaT.setTitulo(rs.getString("titulo"));
                peliculaT.setCategoria(rs.getString("categoria"));
                peliculaT.setFecha(rs.getDate("fecha"));
                peliculaT.setDuracion(rs.getString("duracion"));
                peliculaT.setIdioma(rs.getString("idioma"));

                elementos.add(peliculaT);
                // System.out.println(rs.getString("fecha") + "\n");
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return elementos;
    }

}
