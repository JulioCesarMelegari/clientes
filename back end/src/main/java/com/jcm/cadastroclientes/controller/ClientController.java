package com.jcm.cadastroclientes.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jcm.cadastroclientes.model.Cliente;
import com.jcm.cadastroclientes.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClientController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping
	public List<Cliente> getClientes(){
		return clienteRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Cliente> getId(@PathVariable("id") Integer id) {
		return clienteRepository.findById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteCliente(@PathVariable("id") Integer id) {
		clienteRepository.deleteById(id);
	}
	
	@PostMapping
	public void postCliente(@RequestBody Cliente cliente) {
		clienteRepository.save(cliente);
	}
}
