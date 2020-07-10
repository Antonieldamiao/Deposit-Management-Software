package com.ajs.deposity.model.entities;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "CLIENTE")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Cliente {
    @Id
    @Column(name = "id")
    @EqualsAndHashCode.Include
    private String id;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "nome")
    private String nome;
    @Column(name = "dataNascimento")
    private LocalDate dataNascimento;
    @Column(name = "telefone")
    private String telefone;
    @ManyToOne
    @JoinColumn(name = "codAdmin")
    private Administrador administrador;
    @OneToOne(mappedBy = "cliente")
    private Endereco endereco;
    @OneToOne(mappedBy = "cliente")
    private CompraProduto compraProduto;


}
