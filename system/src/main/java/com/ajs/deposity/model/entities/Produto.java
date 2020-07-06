package com.ajs.deposity.model.entities;


import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name ="PRODUTO")
public class Produto {

    @Id
    @Column(name = "codBarras")
    private String codBarras;
    @Column(name = "nome")
    private String nome;
    @Column(name="preco")
    private float preco;
    @Column(name = "quantidade")
    private int quantidade;
    @OneToMany(mappedBy = "produto")
    private List<Venda> vendas;
    @ManyToMany(mappedBy = "produtos")
    private List<Administrador> administradores;

    public String getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public List<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(List<Venda> vendas) {
        this.vendas = vendas;
    }

    public List<Administrador> getAdministradores() {
        return administradores;
    }

    public void setAdministradores(List<Administrador> administradores) {
        this.administradores = administradores;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Produto produto = (Produto) object;
        return Objects.equals(codBarras, produto.codBarras);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codBarras);
    }
}
