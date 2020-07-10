package com.ajs.deposity.model.entities;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
public class EnderecoId  implements Serializable {
    @Column(name = "cep")
    private String cep;
    @Column(name = "idCliente")
    private String idCliente;
}
