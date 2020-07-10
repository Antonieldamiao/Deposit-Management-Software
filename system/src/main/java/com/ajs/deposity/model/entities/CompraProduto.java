package com.ajs.deposity.model.entities;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="COMPRAPRODUTO")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class CompraProduto {
    @EmbeddedId
    @EqualsAndHashCode.Include
    private CompraProdutoId compraProdutoId;
    @Column(name = "quantidade")
    private int quantidade;
    @Column(name = "valor")
    private float valor;
    @OneToOne
    @MapsId("idCliente")
    private Cliente cliente;
    @OneToOne
    @MapsId("codProduto")
    private Produto produto;
}
