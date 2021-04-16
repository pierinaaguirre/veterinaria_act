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

import com.cibertec.veterinaria.entity.Producto;
import com.cibertec.veterinaria.service.ProductoService;

@RequestMapping(value="/producto")
@RestController
public class ProductoController {
	
	@Autowired
	ProductoService pSer;
	
	@GetMapping(value="/listaProducto", produces = "application/json")
	public List<Producto> listaProducto(){
		return pSer.listaProducto(); 
	}
	
	@PostMapping(value="/registraProducto", produces = "application/json")
	public Producto registraProducto(@RequestBody Producto obj) {
		return pSer.insertaProducto(obj);
	}
	
	@PatchMapping(value="/actualizaProducto", produces = "application/json")
	public String actualizaProducto(@RequestBody Producto obj) {
		return pSer.actualizaProducto(obj);
	}
	
	@GetMapping(value="/eliminaProducto/{cod_pro}", produces = "application/json")
	public void eliminaProducto(@PathVariable int cod_pro) {
		pSer.eliminaProducto(cod_pro);
	}
}
