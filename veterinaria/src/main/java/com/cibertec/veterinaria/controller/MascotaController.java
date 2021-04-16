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

import com.cibertec.veterinaria.entity.Mascota;
import com.cibertec.veterinaria.service.MascotaService;

@RequestMapping(value="/mascota")
@RestController
public class MascotaController {

	@Autowired
	MascotaService mSer;
	
	@GetMapping(value="/listaMascota", produces = "application/json")
	public List<Mascota> listaMascota(){
		return mSer.listaMascota(); 
	}
	
	@PostMapping(value="/registraMascota", produces = "application/json")
	public Mascota registraMascota(@RequestBody Mascota obj) {
		return mSer.insertaMascota(obj);
	}
	
	@PatchMapping(value="/actualizaMascota", produces = "application/json")
	public String actualizaMascota(@RequestBody Mascota obj) {
		return mSer.actualizaMascota(obj);
	}
	
	@GetMapping(value="/eliminaMascota/{cod_mas}", produces = "application/json")
	public void eliminaMascota(@PathVariable int cod_mas) {
		mSer.eliminaMascota(cod_mas);
	}
}
