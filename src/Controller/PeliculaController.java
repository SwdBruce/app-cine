/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Dao.PeliculaDao;
import Dao.PeliculaDaoImpl;
import Model.Pelicula;
import java.util.Collection;

/**
 *
 * @author PC
 */
public class PeliculaController {

    private PeliculaDao peliculaDao = new PeliculaDaoImpl();

    public void insert(Pelicula pelicula) {
        peliculaDao.insert(pelicula);
    }

    public void update(Pelicula pelicula) {
        peliculaDao.update(pelicula);
    }

    public void delete(int peliculaId) {
        peliculaDao.delete(peliculaId);
    }

    public Collection<Pelicula> findAll() {
        Collection<Pelicula> peliculas;
        peliculas = peliculaDao.findAll();
        return peliculas;
    }
}
