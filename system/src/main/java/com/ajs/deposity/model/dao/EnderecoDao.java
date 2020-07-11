package com.ajs.deposity.model.dao;

import com.ajs.deposity.model.connection.ConnectionFactory;
import com.ajs.deposity.model.entities.Endereco;
import com.ajs.deposity.model.entities.EnderecoId;
import com.ajs.deposity.model.interfaces.EntitiesDao;

import javax.persistence.EntityManager;
import java.util.List;

public class EnderecoDao implements EntitiesDao{
    private ConnectionFactory conFactory;
    private EntityManager manager;
    public EnderecoDao(){ manager = conFactory.getConnection().createEntityManager(); }


    @Override
    public boolean addEntitie(Object object) {
        manager.getTransaction().begin();
        Endereco endereco = (Endereco) object;
        manager.persist(endereco);
        manager.getTransaction().commit();
        return true;
    }

    @Override
    public boolean removeEntitie(Object object) {
        Endereco endereco = (Endereco) object;
        manager.getTransaction().begin();
        manager.remove(endereco);
        manager.getTransaction().commit();
        return true;
    }

    @Override
    public boolean updateEntitie(Object object) {
        manager.getTransaction().begin();
        Endereco endereco = (Endereco) object;
        manager.merge(endereco);
        manager.getTransaction().commit();
        return true;
    }

    @Override
    public Object searchEntitie(Object id) {
        Endereco endereco = manager.find(Endereco.class,(EnderecoId)id);
        return endereco;
    }

    public List<Endereco> getEnderecos(){
        List<Endereco> enderecos = manager.createQuery("SELECT e FROM Endereco e").getResultList();
        return enderecos;
    }
}
