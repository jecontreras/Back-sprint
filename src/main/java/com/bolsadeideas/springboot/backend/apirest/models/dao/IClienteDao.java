package com.bolsadeideas.springboot.backend.apirest.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bolsadeideas.springboot.backend.apirest.models.enity.Cliente;

public interface IClienteDao extends JpaRepository<Cliente, Long> {

}
