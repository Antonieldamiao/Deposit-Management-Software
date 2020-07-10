package com.ajs.deposity.model.entities;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;


@Entity
@Table(name="VENDA")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Venda {
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
}
