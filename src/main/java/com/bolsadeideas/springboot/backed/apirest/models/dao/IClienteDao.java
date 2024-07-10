package com.bolsadeideas.springboot.backed.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bolsadeideas.springboot.backed.apirest.models.entity.Cliente;

public interface IClienteDao extends JpaRepository<Cliente, Long>{
    List<Cliente> findByNombre(String nombre);
}
