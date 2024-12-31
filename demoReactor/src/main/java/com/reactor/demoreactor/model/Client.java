package com.reactor.demoreactor.model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("clients")

public class Client {

    @Id
    private Integer idClient;


    private String primaryName;


    private String lastName;


    private String numberDni;


    private LocalDate birthDate;
}
