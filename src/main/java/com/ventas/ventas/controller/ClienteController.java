package com.ventas.ventas.controller;

import com.ventas.ventas.model.ClienteModel;
import com.ventas.ventas.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;
    @GetMapping
    public ResponseEntity<List<ClienteModel>> listar() {
        return clienteService.listar();
    }
    @GetMapping("/{id}")
    public ResponseEntity<ClienteModel> listarXId(@PathVariable Integer id) {
        return clienteService.listarXId(id);
    }
    @PostMapping
    public ResponseEntity<ClienteModel> crear(@RequestBody ClienteModel cliente) {
        return clienteService.crear(cliente);
    }
    @PutMapping
    public ResponseEntity<ClienteModel> actualizar(@RequestBody ClienteModel cliente) {
        return clienteService.actualizar(cliente);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> eliminar(@PathVariable Integer id) {
        return clienteService.eliminar(id);
    }
}
