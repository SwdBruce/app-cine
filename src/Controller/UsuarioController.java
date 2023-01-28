/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Dao.UsuarioDao;
import Dao.UsuarioDaoImpl;

/**
 *
 * @author PC
 */
public class UsuarioController {

    private UsuarioDao usuarioDao = new UsuarioDaoImpl();

    public boolean isExistUser(int usuarioId, String contraseña) {
        boolean respuesta = respuesta = usuarioDao.isExistUser(usuarioId, contraseña);
        return respuesta;
    }

    public int userTipoId(int usuarioId) {
        int respuesta = respuesta = usuarioDao.userTipoId(usuarioId);
        return respuesta;
    }
}
