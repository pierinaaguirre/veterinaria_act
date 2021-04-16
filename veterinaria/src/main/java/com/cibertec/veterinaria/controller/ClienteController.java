package com.cibertec.veterinaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.veterinaria.entity.Cliente;
import com.cibertec.veterinaria.service.ClienteService;

@RequestMapping(value="/cliente")
@RestController
public class ClienteController {
	
	@Autowired
	ClienteService cSer;
	
	@GetMapping(value="/listaCliente", produces = "application/json")
	public List<Cliente> listaCliente(){
		return cSer.listaCliente(); 
	}
	
	@PostMapping(value="/registraCliente", produces = "application/json")
	public Cliente registraCliente(@RequestBody Cliente obj) {
		return cSer.insertaActualiza(obj);
	}
	
	@PostMapping(value="/actualizaCliente", produces = "application/json")
	public Cliente actualizaCliente(Cliente obj) {
		return cSer.insertaActualiza(obj);
	}
	
	@GetMapping(value="/eliminaCliente/{cod_cli}", produces = "application/json")
	public void eliminaCliente(int cod_cli) {
		cSer.eliminaCliente(cod_cli);
	}
}
