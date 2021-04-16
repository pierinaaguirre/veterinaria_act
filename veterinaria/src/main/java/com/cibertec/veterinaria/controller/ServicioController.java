package com.cibertec.veterinaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.veterinaria.entity.Servicio;
import com.cibertec.veterinaria.service.ServicioService;

@RequestMapping(value="/servicio")
@RestController
public class ServicioController {
	
	@Autowired
	ServicioService sSer;
	
	@GetMapping(value="/listaServicio", produces = "application/json")
	public List<Servicio> listaServicio(){
		return sSer.listaServicio(); 
	}
	
	@PostMapping(value="/registraServicio", produces = "application/json")
	public Servicio registraServicio(@RequestBody Servicio obj) {
		return sSer.insertaServicio(obj);
	}
	
	@PatchMapping(value="/actualizaServicio", produces = "application/json")
	public String actualizaServicio(@RequestBody Servicio obj) {
		return sSer.actualizaServicio(obj);
	}
	
	@GetMapping(value="/eliminaServicio/{cod_ser}", produces = "application/json")
	public void eliminaServicio(@PathVariable int cod_ser) {
		sSer.eliminaServicio(cod_ser);
	}
}
