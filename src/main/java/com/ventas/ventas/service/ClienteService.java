package com.ventas.ventas.service;

import com.ventas.ventas.model.ClienteModel;
import com.ventas.ventas.repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService implements IClienteService {
    @Autowired
    private IClienteRepository clienteRepo;
    @Override
    public ResponseEntity<List<ClienteModel>> listar() {
        return ResponseEntity.ok(clienteRepo.findAll());
    }
    @Override
    public ResponseEntity<ClienteModel> listarXId(Integer id) {
        Optional<ClienteModel> clienteOpcional = clienteRepo.findById(id);  // Se necesita obligatoriamente Optional debido a que si el objeto no es encontrado devuelve otro estado.
        return clienteOpcional.map(ResponseEntity::ok).orElse(ResponseEntity.noContent().build());
    }
    @Override
    public ResponseEntity<ClienteModel> crear(ClienteModel cliente) {
        clienteRepo.save(cliente);
        URI localidad = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{pais}")
                .buildAndExpand(cliente.getId())
                .toUri();
        return ResponseEntity.created(localidad).build(); // 200 y devuelve por el HEADER en el parámetro 'location', la url donde se puede consultar el recurso creado.
    }
    @Override
    public ResponseEntity<ClienteModel> actualizar(ClienteModel cliente) {
        return ResponseEntity.ok(clienteRepo.save(cliente));
    }
    @Override
    public ResponseEntity<Object> eliminar(Integer id) {
        if (this.listarXId(id).toString().equals("<204 NO_CONTENT No Content,[]>"))
            return ResponseEntity.notFound().build();
        clienteRepo.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
