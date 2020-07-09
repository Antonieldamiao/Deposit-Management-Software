package com.ajs.deposity.model.dao;

import com.ajs.deposity.model.connection.ConnectionFactory;
import com.ajs.deposity.model.entities.Venda;
import com.ajs.deposity.model.interfaces.EntitiesDao;

import javax.persistence.EntityManager;

public class VendaDao implements EntitiesDao{
    private ConnectionFactory conFactory;
    private EntityManager manager;
    public VendaDao() { manager = conFactory.getConnection().createEntityManager();}

    @Override
    public boolean addEntitie(Object object) {
        manager.getTransaction().begin();
        Venda venda = (Venda) object;
        manager.persist(venda);
        manager.getTransaction().commit();
        return true;
    }

    @Override
    public boolean removeEntitie(Object object) {
        Venda venda = (Venda) object;
        manager.getTransaction().begin();
        manager.remove(venda);
        manager.getTransaction().commit();
        return true;
    }

    @Override
    public boolean updateEntitie(Object object) {
        Venda venda = (Venda) object;
        manager.getTransaction().begin();
        manager.getTransaction().commit();
        return true;
    }

    @Override
    public Object searchEntitie(Object id) {
        Venda venda = manager.find(Venda.class, "IDENTIFICADOR");
        return true;
    }
}
