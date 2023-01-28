/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Dao.ClienteDao;
import Dao.ClienteDaoImpl;
import Model.Cliente;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author PC
 */
public class ClienteController {

    private ClienteDao clienteDao = new ClienteDaoImpl();

    public void insert(Cliente cliente) {
        clienteDao.insert(cliente);
    }

    public void update(Cliente cliente) {
        clienteDao.update(cliente);
    }

    public void delete(int usuarioId) {
        clienteDao.delete(usuarioId);
    }

    public Collection<Cliente> findAll() {
        Collection<Cliente> clientes;
        clientes = clienteDao.findAll();
        return clientes;
    }
}
