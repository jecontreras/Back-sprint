package com.bolsadeideas.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.backend.apirest.models.enity.Usuario;

public interface IUsuarioDAo extends CrudRepository<Usuario, Long> {

	public Usuario findByUsername(String username);
	
//	@Query("select u from Usuarios")
}
