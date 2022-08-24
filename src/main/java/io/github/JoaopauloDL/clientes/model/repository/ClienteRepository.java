package io.github.JoaopauloDL.clientes.model.repository;

import io.github.JoaopauloDL.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
