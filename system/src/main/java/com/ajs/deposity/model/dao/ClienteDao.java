package com.ajs.deposity.model.dao;

import com.ajs.deposity.model.connection.ConnectionFactory;
import com.ajs.deposity.model.entities.Cliente;
import com.ajs.deposity.model.interfaces.EntitiesDao;

import javax.persistence.EntityManager;
import javax.swing.*;

public class ClienteDao implements EntitiesDao {
    private ConnectionFactory conFactory;
    private EntityManager manager;

    public ClienteDao(){manager = conFactory.getConnection().createEntityManager();
    }

    
    @Override
    public boolean addEntitie(Object object) {
        manager.getTransaction().begin();
        Cliente cliente = (Cliente) object;
        manager.persist(cliente);
        manager.getTransaction().commit();
        return true;
    }

    @Override
    public boolean removeEntitie(Object object) {
        Cliente cliente = (Cliente) object;
        manager.getTransaction().begin();
        manager.remove(cliente);
        manager.getTransaction().commit();
        return true;
    }

    @Override
    public boolean updateEntitie(Object object) {
        manager.getTransaction().begin();
        Cliente cliente = (Cliente) object;
        /*SETA VALORES
        *
        * cliente.setNome()
        *
        * */
        manager.getTransaction().commit();
        return true;
    }

    @Override
    public Object searchEntitie(Object id) {

        Cliente cliente = manager.find(Cliente.class,"IDENTIFICADOR");
        return cliente;
    }
}
