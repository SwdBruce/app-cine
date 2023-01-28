/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Dao;

import Model.Pelicula;
import java.util.Collection;

/**
 *
 * @author PC
 */
public interface PeliculaDao {

    public abstract void insert(Pelicula pelicula);

    public abstract void update(Pelicula pelicula);

    public abstract void delete(int peliculaId);

    public abstract Collection<Pelicula> findAll();
}
