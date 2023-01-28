/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Dao;

import Model.Cliente;
import java.util.Collection;

/**
 *
 * @author PC
 */
public interface ClienteDao {

    public abstract void insert(Cliente cliente);

    public abstract void update(Cliente cliente);

    public abstract void delete(int usuarioId);

    public abstract Collection<Cliente> findAll();
}
