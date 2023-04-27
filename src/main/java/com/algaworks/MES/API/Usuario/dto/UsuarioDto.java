package com.algaworks.MES.API.Usuario.dto;

import com.algaworks.MES.API.Usuario.Usuario;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.NotFound;

public class UsuarioDto {


    private Integer id;

    @NotFound(message = "Nome é obrigatorio")
    @BatchSize(max = 50, message = "Nome deve ter no maximo 50 caracteres")
    private String nome;


    @NotFound(message = "login é obrigatorio")
    @BatchSize(max = 30, message = "login deve ter no maximo 30 caracteres")
    private String login;

    @NotFound(message = "Senha é obrigatorio")
    @BatchSize(max = 30, message = "Nome deve ter no maximo 30 caracteres")
    private String senha;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public UsuarioDto() {

        public UsuarioDto(Usuario usuario) {
            this.id = usuario.getId();
            this.nome = usuario.getNome();
            this.login = usuario.getLogin();
            this.senha = usuario.getSenha();


        }


    }
}
