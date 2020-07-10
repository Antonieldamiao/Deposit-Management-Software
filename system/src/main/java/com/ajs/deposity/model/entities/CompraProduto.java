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
    private br.com.jpa.model.CompraProdutoId compraProdutoId;
    @Column(name = "quantidade")
    private int quantidade;
    @Column(name = "valor")
    private float valor;
    @OneToOne
    @MapsId("idCliente")
    private br.com.jpa.model.Cliente cliente;
    @OneToOne
    @MapsId("codProduto")
    private br.com.jpa.model.Produto produto;
}
