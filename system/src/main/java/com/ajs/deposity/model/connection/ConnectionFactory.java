package com.ajs.deposity.model.connection;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionFactory {

    public EntityManagerFactory getConnection(){
        return Persistence.createEntityManagerFactory("AMAKHA");
    }
}
