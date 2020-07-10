package com.ajs.deposity.model.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.sql.Time;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class CompraProdutoId implements Serializable {
    @Column(name = "idCliente")
    private String idCliente;
    @Column(name = "codProduto")
    private String codProduto;
    @Column(name = "hora")
    private Time hora;
}
