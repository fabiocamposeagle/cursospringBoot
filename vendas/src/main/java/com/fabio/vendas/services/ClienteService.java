package com.fabio.vendas.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fabio.vendas.entities.Cliente;
import com.fabio.vendas.repositories.ClienteRepository;

@Service
public class ClienteService implements ClienteRepository {
	
	
	List<Cliente>lista=new ArrayList<>();
	
	@Override
	public List<Cliente> findAll() {
		return lista;
	}

	@Override
	public Cliente saveCliente() {
		Cliente c1=new Cliente(0, "", "");
		c1.setId(1);
		c1.setNome("Pedro");
		c1.setDn("14/08/2002");
		
		Cliente c2=new Cliente(0, "", "");
		c1.setId(2);
		c1.setNome("Cleire");
		c1.setDn("14/08/2000");
		
		lista=Arrays.asList(c1,c2);
		return null;
	}

}
