package com.ajs.deposity.model.entities;

import javax.persistence.Embeddable;
import java.security.Timestamp;

@Embeddable
public class CompraProdutoId {
    private String cpfCliente;
    private String codProduto;
    private Timestamp hora;
}
