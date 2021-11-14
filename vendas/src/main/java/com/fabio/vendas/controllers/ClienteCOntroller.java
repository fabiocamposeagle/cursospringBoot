package com.fabio.vendas.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Clientes")
public class ClienteCOntroller {
	
	@GetMapping
	public String teste() {
		return "ok";
	}
}
