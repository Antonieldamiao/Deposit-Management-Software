package com.ajs.deposity.model.entities;

import lombok.*;
import java.io.Serializable;
import javax.persistence.*;
import java.sql.Date;


@Entity
@Table(name="VENDA")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Venda implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "codigo")
    private int codigo;
    @Column(name = "data")
    private Date data;
    @Column(name = "tipo")
    private String tipo;
    @ManyToOne
    @JoinColumn(name = "codProduto")
    private Produto produto;

    public Venda(int codigo, String tipo) {
        this.codigo = codigo;
        this.tipo = tipo;
    }
}
