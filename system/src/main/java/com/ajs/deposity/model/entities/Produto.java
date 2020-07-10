package com.ajs.deposity.model.entities;

import lombok.*;
import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="PRODUTO")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Produto implements Serializable{
    @Id
    @Column(name = "codBarras")
    @EqualsAndHashCode.Include
    private String codBarras;
    @Column(name = "nome")
    private String nome;
    @Column(name = "preco")
    private float preco;
    @Column(name = "quantidade")
    private int quantidade;
    @ManyToMany(mappedBy = "produtos")
    private List<Administrador> administradores;
    @OneToMany(mappedBy = "produto")
    private List<Venda> vendas;
    @OneToOne(mappedBy = "produto")
    private CompraProduto compraProduto;

    public Produto(String codBarras, String nome, float preco, int quantidade) {
        this.codBarras = codBarras;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
}
