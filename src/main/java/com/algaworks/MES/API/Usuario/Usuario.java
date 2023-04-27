package com.algaworks.MES.API.Usuario;


import jakarta.persistence.*;

@Entity
public class Usuario {


    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private  Integer id;


    @Column(length = 50)
    private String nome;


    @Column (length = 30, unique = true)
    private  String login;

    @Column (length = 30)
    private  String senha;
}
