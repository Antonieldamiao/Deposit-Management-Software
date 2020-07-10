package com.ajs.deposity.model.entities;



import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "ADMINISTRADOR")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Administrador implements Serializable{
    @Id
    @Column(name = "codigo")
    @EqualsAndHashCode.Include
    private String codigo;
    @Column(name = "nome")
    private String nome;
    @Column(name = "senha")
    private String senha;
    @OneToMany(mappedBy = "administrador")
    private List<Cliente> clientes;
    @ManyToMany
    @JoinTable(name = "GERENCIAPRODUTO",
            joinColumns = @JoinColumn(name = "codAdmin"),
            inverseJoinColumns = @JoinColumn(name = "codProduto")
    )
    private List<Produto> produtos;

    public Administrador(String codigo, String nome, String senha) {
        this.codigo = codigo;
        this.nome = nome;
        this.senha = senha;
    }

}
