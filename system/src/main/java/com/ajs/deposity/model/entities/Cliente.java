package com.ajs.deposity.model.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "CLIENTE")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Cliente implements Serializable{
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

    public Cliente(String id, String cpf, String nome, LocalDate dataNascimento, String telefone){
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
    }


}
