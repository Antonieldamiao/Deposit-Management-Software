package com.ajs.deposity.model.entities;



import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ADMINISTRADOR")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Administrador {
    @Id
    @Column(name = "codigo")
    @EqualsAndHashCode.Include
    private String codigo;
    @Column(name = "nome")
    private String nome;
    @Column(name = "senha")
    private String senha;
    @OneToMany(mappedBy = "administrador")
    private List<br.com.jpa.model.Cliente> clientes;
    @ManyToMany
    @JoinTable(name = "GERENCIAPRODUTO",
            joinColumns = @JoinColumn(name = "codAdmin"),
            inverseJoinColumns = @JoinColumn(name = "codProduto")
    )
    private List<br.com.jpa.model.Produto> produtos;

}
