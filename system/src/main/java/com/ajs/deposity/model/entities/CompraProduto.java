package com.ajs.deposity.model.entities;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "COMPRAPRODUTO")
public class CompraProduto {
    private String cpfCliente;
}
