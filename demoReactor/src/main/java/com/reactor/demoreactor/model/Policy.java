package com.reactor.demoreactor.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;


import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("policies")

public class Policy {

    @Id
    private Integer idPolicy;

    private Client client;


    private LocalDate contractDate;


    private String numberSolicitude;


    private String typeBussiness;

}
