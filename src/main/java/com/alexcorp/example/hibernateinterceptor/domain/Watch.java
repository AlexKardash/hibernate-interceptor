package com.alexcorp.example.hibernateinterceptor.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "test")
@Entity
@Data
public class Watch {

    @Id
    private Long id;

    private String name;

    private int year;
}
