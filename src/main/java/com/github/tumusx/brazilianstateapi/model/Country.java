package com.github.tumusx.brazilianstateapi.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Entity(name = "country")
@Getter
@Setter
@NoArgsConstructor
public
class Country implements Serializable {
    @Id
    private Long id;

    @Column(name = "nameCountry")
    private String nameCountry;

    @Column(name = "popularity")
    private int popularityCountry;

    @OneToOne
    private Continent typeContinent;

}