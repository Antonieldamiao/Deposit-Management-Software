package com.ajs.deposity.model.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "ENDERECO")
public class Endereco {

    @EmbeddedId
    private EnderecoId enderecoId;
    @Column(name = "estado")
    private String estado;
    @Column(name = "cidade")
    private String cidade;
    @Column(name = "bairro")
    private String bairro;
    @Column(name = "rua")
    private String rua;
    @Column(name = "numero")
    private int numero;
    @Column(name = "complemento")
    private String complemento;
    private List<Cliente> clientes;

    public Endereco(){
        clientes = new ArrayList<>();
    }

    public EnderecoId getEnderecoId() {
        return enderecoId;
    }

    public void setEnderecoId(EnderecoId enderecoId) {
        this.enderecoId = enderecoId;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Endereco endereco = (Endereco) object;
        return Objects.equals(enderecoId, endereco.enderecoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enderecoId);
    }
}
