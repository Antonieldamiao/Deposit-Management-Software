package com.ajs.deposity.model.dao;

import com.ajs.deposity.model.connection.ConnectionFactory;
import com.ajs.deposity.model.entities.CompraProdutoId;
import com.ajs.deposity.model.interfaces.EntitiesDao;

import javax.persistence.EntityManager;

public class CompraIdDao implements EntitiesDao {
    private ConnectionFactory conFactory;
    private EntityManager manager;
    public CompraIdDao(){ manager = conFactory.getConnection().createEntityManager();}

    @Override
    public boolean addEntitie(Object object) {
        manager.getTransaction().begin();
        CompraProdutoId compraProdutoId = (CompraProdutoId) object;
        manager.persist(compraProdutoId);
        manager.getTransaction().commit();
        return true;
    }

    @Override
    public boolean removeEntitie(Object object) {
        CompraProdutoId compraProdutoId = (CompraProdutoId) object;
        manager.getTransaction().begin();
        manager.remove(compraProdutoId);
        manager.getTransaction().commit();
        return true;
    }

    @Override
    public boolean updateEntitie(Object object) {

        manager.getTransaction().begin();
        CompraProdutoId compraProdutoId = (CompraProdutoId) object;
        manager.getTransaction().begin();
        return true;
    }

    @Override
    public Object searchEntitie(Object id) {
        CompraProdutoId compraProdutoId = manager.find(CompraProdutoId.class,"IDENTIFICADOR");
        return compraProdutoId;
    }
}
