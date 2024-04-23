package org.example;

import javax.persistence.*;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    // constructors, getters, setters
}