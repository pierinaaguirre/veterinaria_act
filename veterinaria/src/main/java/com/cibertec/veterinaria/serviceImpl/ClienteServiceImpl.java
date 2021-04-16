package com.cibertec.veterinaria.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.veterinaria.entity.Cliente;
import com.cibertec.veterinaria.repository.ClienteRepository;
import com.cibertec.veterinaria.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{
	
	@Autowired
	ClienteRepository cRep;

	@Override
	public List<Cliente> listaCliente() {
		return cRep.findAll();
	}

	@Override
	public Cliente insertaActualiza(Cliente obj) {
		return cRep.save(obj);
	}

	@Override
	public void eliminaCliente(int cod_cli) {
		cRep.deleteById(cod_cli);
	}
	

}
