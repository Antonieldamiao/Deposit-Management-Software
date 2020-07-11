package com.ajs.deposity.model.dao;

import com.ajs.deposity.model.connection.ConnectionFactory;
import com.ajs.deposity.model.entities.CompraProduto;
import com.ajs.deposity.model.entities.Produto;
import com.ajs.deposity.model.interfaces.EntitiesDao;

import javax.persistence.EntityManager;
import java.util.List;

public class CompraDao implements EntitiesDao {
    private ConnectionFactory conFactory;
    private EntityManager manager;
    public CompraDao(){
        manager = conFactory.getConnection().createEntityManager();
    }


    @Override
    public boolean addEntitie(Object object) {
        manager.getTransaction().begin();
        CompraProduto compraProduto = (CompraProduto) object ;
        manager.persist(compraProduto);
        manager.getTransaction().commit();
        return true;
    }

    @Override
    public boolean updateEntitie(Object object) {
        manager.getTransaction().begin();
        CompraProduto compraProduto = (CompraProduto) object ;
        manager.merge(compraProduto);
        manager.getTransaction().commit();
        return true;
    }

    @Override
    public boolean removeEntitie(Object object) {
        CompraProduto compraProduto = (CompraProduto) object;
        manager.getTransaction().begin();
        manager.remove(compraProduto);
        manager.getTransaction().commit();
        return true;
    }

    @Override
    public Object searchEntitie(Object id) {
        CompraProduto compraProduto = manager.find(CompraProduto.class,(String)id);
        return compraProduto;
    }

    public List<CompraProduto> getCompraProdutos(){
        List<CompraProduto> compras = manager.createQuery("SELECT cp FROM CompraProduto cp").getResultList();
        return compras;
    }
}

