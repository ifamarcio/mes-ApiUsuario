package com.algaworks.MES.API.Usuario.repositories;


import com.algaworks.MES.API.Usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface  UsuarioRepository extends JpaRepository<Usuario, Integer > {

    Usuario findByLogin(String login);

}
