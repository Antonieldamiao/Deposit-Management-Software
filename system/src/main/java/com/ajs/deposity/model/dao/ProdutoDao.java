package com.ajs.deposity.model.dao;

import com.ajs.deposity.model.connection.ConnectionFactory;
import com.ajs.deposity.model.entities.Produto;
import com.ajs.deposity.model.interfaces.EntitiesDao;

import javax.persistence.EntityManager;


public class ProdutoDao implements EntitiesDao{
    private ConnectionFactory conFactory;
    private EntityManager manager;
    public ProdutoDao(){
        manager = conFactory.getConnection().createEntityManager();
    }

    @Override
    public boolean addEntitie(Object object) {
        manager.getTransaction().begin();
       Produto produto = (Produto) object;
        manager.persist(produto);
        manager.getTransaction().commit();
        return true;
    }

    @Override
    public boolean updateEntitie(Object object) {
        manager.getTransaction().begin();
        Produto produto = (Produto) object;
        manager.getTransaction().commit();
        return true;
    }

    @Override
    public boolean removeEntitie(Object object) {
        Produto produto = (Produto) object;
        manager.getTransaction().begin();
        manager.remove(produto);
        manager.getTransaction().commit();
        return true;
    }
    @Override
    public Object searchEntitie(Object id) {

        Produto produto = manager.find(Produto.class,"IDENTIFICADOR");
        return produto;
    }
}
