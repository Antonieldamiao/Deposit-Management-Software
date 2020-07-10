package com.ajs.deposity.model.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="PRODUTO")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Produto {
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
}
