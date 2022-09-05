package com.github.tumusx.brazilianstateapi.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity(name = "continent")
@Getter
@Setter
@NoArgsConstructor
public class Continent implements Serializable {

    @Id
    private Long id;

    @Column(name = "name_continent")
    private String nameContinent;
}
