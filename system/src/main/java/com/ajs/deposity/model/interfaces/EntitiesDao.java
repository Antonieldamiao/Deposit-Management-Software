package com.ajs.deposity.model.interfaces;



public interface EntitiesDao {
    boolean addEntitie(Object object);
    boolean removeEntitie(Object object);
    boolean updateEntitie(Object object);
    Object searchEntitie(Object id);
}
