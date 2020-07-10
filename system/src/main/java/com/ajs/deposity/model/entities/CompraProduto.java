package com.ajs.deposity.model.entities;


import lombok.*;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="COMPRAPRODUTO")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class CompraProduto implements Serializable{
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

    public CompraProduto(int quantidade, float valor) {
        this.quantidade = quantidade;
        this.valor = valor;
    }
}
