package com.senac.sistemacoleta.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "selo")
public class Selo {

    @Id
    @Column(name = "selo_id")
    private Long id;

    @Column(name = "selo_nome")
    private String nome;

    @Column(name = "selo_descricao")
    private String descricao;

    @Column(columnDefinition = "LONGBLOB", name = "selo_imagem")
    private byte[] seloImagem;

    @Column(name = "selo_status")
    private int status;
}
