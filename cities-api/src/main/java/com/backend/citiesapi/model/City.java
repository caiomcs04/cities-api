package com.backend.citiesapi.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cidade")
@NoArgsConstructor
@Getter
public class City {

    @Id
    private Long id;

    @Column(name = "uf")
    private String uf;

    @Column(name = "ibge")
    private String ibge;

    @Column(name = "sigla")
    private String code;

    private Integer bacen;

}
