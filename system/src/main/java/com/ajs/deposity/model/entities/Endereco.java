package com.ajs.deposity.model.entities;

import lombok.*;

import javax.persistence.*;


@Entity
@Table(name = "ENDERECO")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Endereco {
    @EmbeddedId
    @EqualsAndHashCode.Include
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
    @Column(name="complemento")
    private String complemento;
    @OneToOne
    @MapsId("idCliente")
    private br.com.jpa.model.Cliente cliente;
}
