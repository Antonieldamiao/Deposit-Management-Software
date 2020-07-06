package com.ajs.deposity.model.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "VENDA")
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private int codigo;
    @Column(name = "data")
    private LocalDate data;
    @Column(name = "tipo")
    private String tipo;
    @ManyToOne
    @JoinColumn(name = "codProduto")
    private Produto produto;


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Venda venda = (Venda) object;
        return codigo == venda.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}
