package com.cibertec.veterinaria.service;

import java.util.List;

import com.cibertec.veterinaria.entity.Cliente;

public interface ClienteService {
	public abstract List<Cliente> listaCliente();
	public abstract Cliente insertaActualiza(Cliente obj);
	public abstract void eliminaCliente(int cod_cli);
}
