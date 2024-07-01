package com.bookStore.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false, unique=true)
    private String name;

    @ManyToMany(mappedBy="roles")
    private List<User> users;

    // Constructors, getters, setters, and other methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
