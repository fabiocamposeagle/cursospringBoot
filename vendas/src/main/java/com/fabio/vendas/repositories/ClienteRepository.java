package com.fabio.vendas.repositories;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.fabio.vendas.entities.Cliente;

 
@Repository
public interface ClienteRepository {
	
	public List<Cliente>findAll();
	
	public Cliente saveCliente();
	
	
	
	
}
