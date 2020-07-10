package com.ajs.deposity.model.dao;

import com.ajs.deposity.model.entities.Administrador;

import java.io.*;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class SessaoDao {
    private File sessaoFile;
    private Set<Administrador> administradores;

    public SessaoDao() throws IOException {
        sessaoFile = new File("sessao");
        if(!sessaoFile.exists()){
            sessaoFile.createNewFile();
        }
    }

    public boolean startSession(Administrador administrador) throws IOException, ClassNotFoundException {
        administradores = getAdmin();
        if(administradores.add(administrador)){
            updateFile(administradores);
            return true;
        }
        return false;

    }

    public boolean finishSession() throws IOException, ClassNotFoundException {
        administradores = getAdmin();
        return sessaoFile.delete();
    }

    public Optional<Administrador> getAdministrador(){
       return administradores.stream().findFirst();
    }


    private Set<Administrador> getAdmin() throws IOException, ClassNotFoundException {
        if(sessaoFile.length()>0){
            try(ObjectInputStream obis =  new ObjectInputStream(new FileInputStream(sessaoFile))){
                return (HashSet) obis.readObject();
            }
        }else{
            return new HashSet<>();
        }
    }

    private void updateFile(Set<Administrador> admins) throws IOException {
        try(ObjectOutputStream obos = new ObjectOutputStream(new FileOutputStream(sessaoFile))){
            obos.writeObject(admins);
        }
    }

}
