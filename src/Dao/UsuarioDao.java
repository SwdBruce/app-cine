/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Dao;

/**
 *
 * @author PC
 */
public interface UsuarioDao {

    public abstract boolean isExistUser(int usuarioId, String contraseña);

    public abstract int userTipoId(int usuarioId);
}
