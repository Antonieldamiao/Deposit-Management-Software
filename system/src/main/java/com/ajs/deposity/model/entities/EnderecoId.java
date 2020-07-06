package com.ajs.deposity.model.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class EnderecoId {
    @Column(name = "cep")
    private String cep;
    @Column(name = "cpfCliente")
    private String cpfCliente;


    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        EnderecoId that = (EnderecoId) object;
        return Objects.equals(cpfCliente, that.cpfCliente) &&
                Objects.equals(cep, that.cep);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpfCliente, cep);
    }
}
