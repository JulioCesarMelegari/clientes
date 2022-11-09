package com.jcm.cadastroclientes.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.jcm.cadastroclientes.model.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Integer>{


}
