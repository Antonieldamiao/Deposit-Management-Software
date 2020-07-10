package com.ajs.deposity.model.entities;

import lombok.*;
import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name = "ENDERECO")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Endereco implements Serializable{
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
    private Cliente cliente;

    public Endereco(String estado, String cidade, String bairro, String rua, int numero, String complemento) {
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
    }
}
