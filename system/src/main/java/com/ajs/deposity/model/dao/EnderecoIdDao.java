package com.ajs.deposity.model.dao;

import com.ajs.deposity.model.connection.ConnectionFactory;

import com.ajs.deposity.model.entities.EnderecoId;
import com.ajs.deposity.model.interfaces.EntitiesDao;

import javax.persistence.EntityManager;

public class EnderecoIdDao implements EntitiesDao {
    private ConnectionFactory conFactory;
    private EntityManager manager;
    public EnderecoIdDao() { manager = conFactory.getConnection().createEntityManager();}

    @Override
    public boolean addEntitie(Object object) {
        manager.getTransaction().begin();
        EnderecoId enderecoId = (EnderecoId) object;
        manager.persist(enderecoId);
        manager.getTransaction().commit();
        return true;
    }

    @Override
    public boolean removeEntitie(Object object) {
        EnderecoId enderecoId = (EnderecoId) object;
        manager.getTransaction().begin();
        manager.remove(enderecoId);
        manager.getTransaction().commit();
        return true;
    }

    @Override
    public boolean updateEntitie(Object object) {
        manager.getTransaction().begin();
        EnderecoId enderecoId = (EnderecoId) object;
        manager.getTransaction().commit();
        return true;
    }

    @Override
    public Object searchEntitie(Object id) {
        EnderecoId enderecoId = manager.find(EnderecoId.class,"IDENTIFICADOR");
        return enderecoId;
    }
}

