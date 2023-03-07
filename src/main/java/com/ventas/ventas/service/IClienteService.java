package com.ventas.ventas.service;

import com.ventas.ventas.model.ClienteModel;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IClienteService {
    ResponseEntity<List<ClienteModel>> listar();
    ResponseEntity<ClienteModel> listarXId(Integer id);
    ResponseEntity<ClienteModel> crear(ClienteModel cliente);
    ResponseEntity<ClienteModel> actualizar(ClienteModel cliente);
    ResponseEntity<Object> eliminar(Integer id);
}
