package com.ajs.deposity.model.dao;

import com.ajs.deposity.model.connection.ConnectionFactory;
import com.ajs.deposity.model.entities.Administrador;
import com.ajs.deposity.model.interfaces.EntitiesDao;

import javax.persistence.EntityManager;

public class AdministradorDao implements EntitiesDao {
    private ConnectionFactory conFactory;
    private EntityManager manager;
    public AdministradorDao(){manager = conFactory.getConnection().createEntityManager();}


    @Override
    public boolean addEntitie(Object object) {
        return false;
    }

    @Override
    public boolean removeEntitie(Object object) {
        return false;
    }

    @Override
    public boolean updateEntitie(Object object) {
        return false;
    }

    @Override
    public Object searchEntitie(Object id) {
        Administrador administrador = manager.find(Administrador.class,(String)id);
        return administrador;
    }
}
