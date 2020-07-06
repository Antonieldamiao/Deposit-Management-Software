package com.ajs.deposity.model.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Entity
@Table(name = "ADMINISTRADOR")
public class Administrador {

    @Id
    @Column(name = "codigo")
    private String codigo;
    @Column(name = "nome")
    private String nome;
    @Column(name = "senha")
    private String senha;
    @OneToMany(mappedBy = "administrador")
    private List<Cliente> clientes;
    @ManyToMany
    @JoinTable(
            name = "GERENCIAPRODUTO",
            joinColumns = @JoinColumn(name = "codAdmin"),
            inverseJoinColumns = @JoinColumn(name = "codProduto")
    )
    private List<Produto> produtos;

    public Administrador(){
        clientes = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Administrador that = (Administrador) object;
        return Objects.equals(codigo, that.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}
