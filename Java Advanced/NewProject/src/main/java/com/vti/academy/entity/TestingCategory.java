package com.vti.academy.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table (name = "testing_category", catalog = "TestingSystem")

public class TestingCategory implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short id;

    @Column(name = "name", nullable = false, length = 50, unique = true)
    private String name;

    public TestingCategory() {

    }

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
