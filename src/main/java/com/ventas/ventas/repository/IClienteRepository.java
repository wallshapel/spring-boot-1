package com.ventas.ventas.repository;

import com.ventas.ventas.model.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteRepository extends JpaRepository<ClienteModel, Integer> {  // JpaRepository es una clase que hereda de otras, pero a la final contiene los métodos crud.

}
